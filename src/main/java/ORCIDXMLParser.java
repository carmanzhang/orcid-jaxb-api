import org.apache.commons.lang3.StringUtils;
import org.orcid.jaxb.model.v3.release.record.Record;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ORCIDXMLParser {
    public static void bulkWrite2File(BufferedWriter bw, List<CompactORCID> resList) throws IOException {
        for (CompactORCID item : resList) {
            String[] res = {
                    JsonUtil.Marshal(item.addresses),
                    JsonUtil.Marshal(item.biography),
                    JsonUtil.Marshal(item.emails),
                    JsonUtil.Marshal(item.external_ids),
                    JsonUtil.Marshal(item.keywords),
                    JsonUtil.Marshal(item.orcid_last_modified_date),
                    JsonUtil.Marshal(item.name),
                    JsonUtil.Marshal(item.other_names),
                    item.person_path,
                    JsonUtil.Marshal(item.researcher_urls),
                    item.orcid_id_host,
                    item.orcid_id_uri,
                    item.claimed ? "1" : "0",
                    JsonUtil.Marshal(item.completion_date),
                    JsonUtil.Marshal(item.creation_method),
                    JsonUtil.Marshal(item.deactivation_date),
                    JsonUtil.Marshal(item.history_last_modified_date),
                    JsonUtil.Marshal(item.source),
                    JsonUtil.Marshal(item.submission_date),
                    item.verified_email ? "1" : "0",
                    item.verified_primary_email ? "1" : "0",
                    JsonUtil.Marshal(item.distinctions),
                    JsonUtil.Marshal(item.educations),
                    JsonUtil.Marshal(item.employments),
                    JsonUtil.Marshal(item.fundings),
                    JsonUtil.Marshal(item.invited_positions),
                    JsonUtil.Marshal(item.activity_last_modified_date),
                    JsonUtil.Marshal(item.memberships),
                    JsonUtil.Marshal(item.peer_reviews),
                    JsonUtil.Marshal(item.qualifications),
                    JsonUtil.Marshal(item.research_resources),
                    JsonUtil.Marshal(item.services),
                    JsonUtil.Marshal(item.works),
                    JsonUtil.Marshal(item.activity_map),
                    item.path,
                    item.locale,
                    item.orcid_type
            };

            String joinedRes = StringUtils.join(res, "\t");
            bw.write(joinedRes);
            bw.write("\n");
        }
    }

    public static void main(String[] args) throws IOException {
        String basePath = args[0];
        int processdCnt = 0;
        int errCnt = 0;
        List<CompactORCID> compactORCIDArrayList = new ArrayList<>();
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File(args[1])));
        try {
            JAXBContext context = JAXBContext.newInstance(Record.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
//            Marshaller marshaller = context.createMarshaller();
            File dir = new File(basePath);
            if (!dir.isDirectory()) {
                return;
            }

            File[] dirs = dir.listFiles();
            assert dirs != null;
            for (File subDir : dirs) {
                if (!subDir.isDirectory()) {
                    continue;
                }
                System.out.println(subDir.getAbsolutePath());
                if (!subDir.isDirectory()) {
                    continue;
                }
                File[] files = subDir.listFiles();
                assert files != null;
                for (File file : files) {
                    if (!file.isFile() || !file.getName().contains("xml")) {
                        continue;
                    }

                    processdCnt += 1;

                    try {
                        Record record = null;
                        Reader reader = new FileReader(file);
                        Object o = unmarshaller.unmarshal(reader);
                        record = (Record) o;
                        CompactORCID compactORCID = MetadataCleaner.parser(record);
                        compactORCIDArrayList.add(compactORCID);
                    } catch (Exception e) {
                        System.out.println(file.getName());
//                        e.printStackTrace();
                        errCnt += 1;
                        continue;
                    }
                    if (processdCnt % 10000 == 0) {
                        System.out.println(processdCnt + "\t" + errCnt);
                        // bulk write
                        bulkWrite2File(bw, compactORCIDArrayList);
                        compactORCIDArrayList.clear();
                    }
                }
            }
            bulkWrite2File(bw, compactORCIDArrayList);
            if (bw != null) {
                bw.close();
            }
        } catch (
                JAXBException e) {
            e.printStackTrace();
        }
    }


}
