package CollectionFramework.Map;

import java.util.Map;

//The Major difference between treemap and hashmap is that in the tree map it will sort the elements as behind the scene,
//It will implement the binary search algorithm.

public class TreeMap {
    public static void main(String[] args) {
        Map<String,Integer> map= new java.util.TreeMap<>();

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

        //It will sort the elements based on the key elements as hts it is implementing binary search
        for (Map.Entry<String,Integer> e: map.entrySet()){
            //System.out.println(e);
            System.out.println("Key: "+e.getKey()+" Value: "+e.getValue());
        }

        System.out.println(map.containsValue(3));

        //map.clear();
    }
}
