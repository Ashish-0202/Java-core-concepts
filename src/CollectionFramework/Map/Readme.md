**Map**

**HashMap:**

HashMap is a class implementing Map Interface which stores the elements with key value pair.

In HashMap we cannot store same keys, so the key  must be unique.
If we try to add two elements with same key then the value we passed with second key will be stored(Overwrite).

    Map<String,Integer> map= new HashMap<>();

HashMap doesnot maintain any order among the elements.

put(): put method is used to insert value inside the map.

putIfAbsent(): This method is used insert the element into map if the given element(k,v) is absent.

containsKey(): This method will print true if the passed key is present inside the map.

containsValue(): This method will print true if the passed value is present inside the map.

isEmpty(): This method will check whether the map is empty or not.

clear(): This method is used to clear the map.

To iterate inside map we use Entry(k,v) & entrySet() method inside for each.

    for(Map.Entry(String,Integer) e: map.entrySet()){
    System.out.println(e);
    System.out.println(e.getKey()); //This will print only keys.
    System.out.println(e.getValue()); //This will print only values.
    }

**TreeMap():**

TreeMap is a class implementing the Map interface and behind the scene it is implementing the binary search algorithm due to which it will sort the elements.

    Map<String,Integer> map= new TreeMap<>();