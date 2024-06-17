import java.util.*;
class MyHashSet{
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<String>();
        set.add("Geeks");
        set.add("For");
        set.add("Geeks");
        set.add("Example");
        System.out.println(set);
        System.out.println(set.size());
        Iterator<String> i=set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        for(String s:set){
            System.out.println(s);
        }
        set.remove("Geeks");
        System.out.println(set);
        System.out.println(set.contains("For"));
        set.clear();
        System.out.println(set);
    }
}