import com.google.common.io.Resources;
import org.apache.commons.io.output.StringBuilderWriter;
import org.orcid.jaxb.model.v3.release.record.Record;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.*;
import java.net.URL;
import java.util.*;

public class XMLJAXBParserDemo {
    public static void main(String[] args) {
        //create a JAXB marshaller/unmarshaller.
        boolean schemaValidate = false;
        int processdCnt = 0;
        try {
            JAXBContext context = JAXBContext.newInstance(Record.class);
            SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            URL url = Resources.getResource("record_3.0/record-3.0.xsd");

            Unmarshaller unmarshaller = context.createUnmarshaller();
            Marshaller marshaller = context.createMarshaller();
            if (schemaValidate) {
                Schema schema = sf.newSchema(url);
                unmarshaller.setSchema(schema);
                marshaller.setSchema(schema);
            }

            //read a record from XML
            File fileOrDir = new File("samples/");
//            File fileOrDir = new File("samples/0000-0001-5105-9000.xml");
//            File fileOrDir = new File("samples/0000-0001-7270-6000.xml");
            if (fileOrDir.isDirectory()) {
                Map<Long, String> map = new TreeMap<Long, String>(new Comparator<Long>() {
                    public int compare(Long obj1, Long obj2) {
                        return obj2.compareTo(obj1);
                    }
                });
                File[] files = fileOrDir.listFiles();
                System.out.println(files.length);
                List<CompactORCID> compactORCIDArrayList = new ArrayList<>();
                for (File file : files) {
                    Record record = null;
                    long length = file.length();
                    try {
                        Reader reader = new FileReader(file);
                        Object o = unmarshaller.unmarshal(reader);
                        record = (Record) o;
                        CompactORCID compactORCID = MetadataCleaner.parser(record);
                        compactORCIDArrayList.add(compactORCID);
                    } catch (Exception e) {
                        System.out.println(file.getName());
//                        e.printStackTrace();
                        continue;
                    }
//                Writer writer = new FileWriter("temp.xml");//some kind of string/file/outputstream writer;
                    StringBuilderWriter stringBuilderWriter = new StringBuilderWriter();
                    marshaller.marshal(record, stringBuilderWriter);
                    int length1 = stringBuilderWriter.getBuilder().length();
//                System.out.println(length - length1);
                    map.put(length - length1, file.getName());
                }
                for (Long aLong : map.keySet()) {
                    System.out.println(aLong + "\t" + map.get(aLong));
                }

//                MedataHelper.calcuMedataSparsity(compactORCIDArrayList);
                System.out.println(JsonUtil.Marshal(compactORCIDArrayList.get(0)));
            } else {
                Reader reader = new FileReader(fileOrDir);
                Object o = unmarshaller.unmarshal(reader);
                Record record = (Record) o;
                //write a record as XML
                Writer writer = new FileWriter("temp.xml");//some kind of string/file/outputstream writer;
                marshaller.marshal(record, writer);
            }

        } catch (JAXBException | SAXException | IOException e) {
//            throw new RuntimeException("Unable to create jaxb marshaller/unmarshaller" + e);
            e.printStackTrace();
        }
    }


}
