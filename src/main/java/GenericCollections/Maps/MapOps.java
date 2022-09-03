package GenericCollections.Maps;

import GenericCollections.Employee;
import GenericCollections.MapOperations;

import java.util.*;

//: average time complexity (i.e amortisized complexity)

/**
 * - insert (put()) : HM/LHM: O(1) TM: O(log n)
 * - search (get(), containsKey(), containsValue()):HM/LHM O(1) , TM: O(log n)
 * - remove (remove(key): )
 * - traverse (HM/LHM: O(n))
 * <p>
 * * TreeMap/TreeSet represent Binary search tree i.e BST)
 **/


//(K,V) pair should have unique key. values could be duplicate
public class MapOps implements MapOperations {
    public void add(Map<Integer, String> map) {
        //insert (K,V) pair
        map.put(1, "harshal");
        map.put(1, "rajesh"); // this replaces the value of the key, if key already exists. (so could act as update value based on key)
        map.put(2, "har");
        map.put(3, "hars");
        map.put(4, "harsh");
        System.out.println(map);

    }

    public void remove(Map<Integer, String> map) {
//remove (K,V) pair based on key
        System.out.println(map.remove(2)); //returns value returned.
//remove based on value?
    }

    public void search(Map<Integer, String> map) {
        //search by key
        System.out.println(map.containsKey(3));
        System.out.println(map.get(4));
        //search by value
        System.out.println(map.containsValue("harshal"));

    }

    public void traverse(Map<Integer, String> map) {
//foreach/Iterator for set of entry objects in map
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    public void update(Map<Integer, String> map) {
        //put itself serves to update values corresponding to a key
        map.put(1, "kaushal");
        System.out.println(map);
    }

    /**
     * Tree map stores by default in ascending order of the key, where no comparator required in case of wrapper type, otherwise required!
     **/

    public void AscendingByKey(Map<Integer, String> map) {
        if (map.getClass().getName().equals("java.util.TreeMap")) {
            //iterate set of entry objects
            //note: tree map can store in sorted order only by key
            for (Map.Entry<Integer, String> emp : map.entrySet()) {
                System.out.println(emp.getKey() + ":" + emp.getValue());
            }
        }
    }

    /** below usecases: sort maps with list<Map.Entry> conversions- sort using mandatory comparator implementation **/
    /**
     *
     **/
    public void DescendingByKey(Map<Integer, String> map) {
        //any map type to list, sorting the list, transform to linkedHashMap
        List<Map.Entry<Integer, String>> list = new LinkedList<Map.Entry<Integer, String>>(map.entrySet()); //set to list
        Comparator<Map.Entry<Integer, String>> compare = (Map.Entry<Integer, String> obj1, Map.Entry<Integer, String> obj2) -> {
            return -(obj1.getKey() - obj2.getKey());
        };

        Collections.sort(list, compare);
        //list to map: checkout more consise way via java8 streams!
        Map<Integer, String> map1 = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : list) {
            map1.put(entry.getKey(), entry.getValue());
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }

    //sorting data structure by string: do it lexicographically (i.e dictionary order)
    public void AscendingByValue(Map<Integer, String> map) {
//any map type to list, sorting the list, transform to linkedHashMap

        Comparator<Map.Entry<Integer, String>> compare = (Map.Entry<Integer, String> obj1, Map.Entry<Integer, String> obj2) -> {
            if (obj1.getValue().equals(obj2.getValue())) {
                return 0;
            } else if (!compareStringLexicographically(obj1.getValue(), obj2.getValue())) {
                return 1;
            } else {
                return -1;
            }
        };

        //SET TO LIST

        List<Map.Entry<Integer, String>> list = new LinkedList<Map.Entry<Integer, String>>(map.entrySet());

        Collections.sort(list, compare);
        //list to map: checkout more consise way via java8 streams!
        Map<Integer, String> map1 = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : list) {
            map1.put(entry.getKey(), entry.getValue());
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }

    public void DescendingByValue(Map<Integer, String> map) {
//any map type to list, sorting the list, transform to linkedHashMap

        //any map type to list, sorting the list, transform to linkedHashMap

        Comparator<Map.Entry<Integer, String>> compare = (Map.Entry<Integer, String> obj1, Map.Entry<Integer, String> obj2) -> {
            if (obj1.getValue().equals(obj2.getValue())) {
                return 0;
            } else if (!compareStringLexicographically(obj1.getValue(), obj2.getValue())) {
                return -1;
            } else {
                return 1;
            }
        };

        //SET TO LIST

        List<Map.Entry<Integer, String>> list = new LinkedList<Map.Entry<Integer, String>>(map.entrySet());

        Collections.sort(list, compare);
        //list to map: checkout more consise way via java8 streams!
        Map<Integer, String> map1 = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : list) {
            map1.put(entry.getKey(), entry.getValue());
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }


    // a<b then returns true else false
    public boolean compareStringLexicographically(String a, String b) {

//can if-else ladders be made concise
        if (a.length() < b.length()) {
            return true;
        } else if (a.length() > b.length()) {
            return false;
        } else {
            char[] s1 = a.toCharArray();
            char[] s2 = b.toCharArray();

            for (int i = 0; i < a.length(); i++) {
                if (s1[i] < s2[i]) {
                    break;
                } else if (s1[i] > s2[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}


// try out comparator implementations for multiple datatypes: wrapper, string, Map.Entry<>,  custom types, other complex types....


