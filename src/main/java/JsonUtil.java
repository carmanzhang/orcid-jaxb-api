import com.google.gson.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author:Zhang_Li
 * Date:2019/6/20
 * Time:20:24
 * ProjectName: pmc_oa_citation_tagging
 * Email: zlahu@foxmail.com
 * Description:
 * Copyright:
 */
public class JsonUtil {

    private static final Gson gson = new Gson();

    public static String Marshal(Object obj) {
        String str = gson.toJson(obj);
        return str;
    }

    public static <T> T Unmarshal(String str, Class<T> classOfT) {
        return gson.fromJson(str, classOfT);
    }

    public static <T> List<T> UnmarshalList(String str, Class<T[]> clazz) {
        T[] arr = gson.fromJson(str, clazz);
        if (arr == null) {
            return null;
        }
        return Arrays.asList(arr);
    }
}

