package JvCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put(" Tăng Thị Hoa " , 20 );
        hashMap.put(" Đoàn Thị Hương " , 20 );
        hashMap.put(" Trần Văn Hưng " , 29);
        hashMap.put(" Trần Đình Tuệ " , 30);
        System.out.println(" Display entries in HasMap : ");
        System.out.println( hashMap + "\n");

        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(" Display entries in ascending order of key ");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap =  new HashMap<>();
        linkedHashMap.put("  thịt gà ",20 );
        linkedHashMap.put(" thịt lợn ",20 );
        linkedHashMap.put(" xúc xích ",20 );
        linkedHashMap.put(" bimbim  ",20 );
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));





    }
}
