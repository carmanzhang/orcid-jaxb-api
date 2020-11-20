import org.apache.commons.lang.StringUtils;

import java.lang.reflect.Field;
import java.util.List;

public class MedataHelper {
    public static void calcuMedataSparsity(List<CompactORCID> compactORCIDArrayList) {
        // 统计不为空的字段
        int len = compactORCIDArrayList.size();
        Field[] declaredFields = CompactORCID.class.getDeclaredFields();
        int[] cntArr = new int[declaredFields.length];
        for (CompactORCID compactORCID : compactORCIDArrayList) {
            try {
                for (int i = 0; i < declaredFields.length; i++) {
                    Field f = declaredFields[i];
                    f.setAccessible(true);
//                            System.out.print(f.getName() + ":");
                    Object o = f.get(compactORCID);
                    if (o != null && StringUtils.isNotBlank(o.toString())) {
                        cntArr[i] += 1;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < declaredFields.length; i++) {
            System.out.println(declaredFields[i].getName() + "\t" + (cntArr[i] * 1.0 / len));
        }
    }
}
