
// import java.util.HashMap;
// import java.util.Map;
import java.util.*;

// package Hashing;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();
        map.put("Geeks", 10);
        map.put("For", 20);
        map.put("Geeks", 30);
        map.put("Example", 40);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get("Geeks"));
        System.out.println(map.containsKey("For"));
        System.out.println(map.containsValue(20));
        System.out.println(map.keySet());//print only key 
        System.out.println(map.values());//print only values
        System.out.println(map.entrySet());//print both key and values
        for(String s:map.keySet()){
            System.out.println(s+" "+map.get(s));
        }
        map.remove("Geeks");
        System.out.println(map);
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
