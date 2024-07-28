package CollectionFramework.Map;

import java.util.HashMap;
import java.util.Map;
//HashMap is a class implementing Map Interface which stores the elements with key value pair
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map= new HashMap<>();

        map.put("Ashish",1);
        map.put("Ashwini",2);
        map.put("Holla",3);
        map.put("VV9",4);
        map.put("Ramana",5);

        if(!map.containsKey("Holla")){
            map.put("Pruthvi",3);
        }
        //map.putIfAbsent("Pruthvi",3);
        //System.out.println(map);

        //It does not maintain any order of element
        for (Map.Entry<String,Integer> e: map.entrySet()){
            //System.out.println(e);
            System.out.println("Key: "+e.getKey()+" Value: "+e.getValue());
        }

        System.out.println(map.containsValue(3));

        map.remove("Ashish");

        System.out.println(map);

        //map.clear();
    }
}
