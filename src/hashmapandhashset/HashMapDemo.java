package hashmapandhashset;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    HashMap<String, String> obj = new HashMap<>();

    public static void main(String[] ard) {
        HashMap<String, String> obj = new HashMap<>();
        obj.put("london", "England");
        obj.put("Ahmedabad", "Gujarat");
        obj.put("Mumbai", "Maharashtra");

        System.out.println(obj.size());
        System.out.println(obj.entrySet());
        String s = obj.get("london");
        System.out.println(s);
        for (Map.Entry obj1 : obj.entrySet()) {
            System.out.println(obj1);
        }
    }
}
