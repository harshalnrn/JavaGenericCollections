package GenericCollections.ConcurrentModificationException;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionImpl {


    public static void main(String[] args) {

        int[] a;
        //Lists
        List<String> arrayList = new ArrayList<String>();
        List<String> linkedList = new LinkedList<String>();


        //Maps
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        //   Map<Integer, String> enumMap = new EnumMap<Integer, String>();
        Map<Integer, String> concurrentHashMap = new ConcurrentHashMap<Integer, String>();


        //Sets
        Set<String> hashSet = new HashSet<String>();
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        //   Set<String> enumSet = new EnumSet<String>();
        Set<String> treeSet = new TreeSet<String>();


        //operations
        arrayList.add("amar");
        arrayList.add("raj");
        arrayList.add(0, "prey");

        arrayList.set(2, "kuwar");
        System.out.println(arrayList);

        linkedList.add("amar");
        linkedList.add("raj");
        linkedList.add(0, "prey");
        System.out.println(linkedList);

        Iterator<String> iterator = linkedList.iterator();



/*
    : difference between for, for-each, iterator, list-iterator for collections (solving concurrent modification problem during traversal)
*/
 /*       --------- for-each implementation-----------------
 note in for-each" a new copy of variable created for each element */
        /*


        for (String str : arrayList) {
            // for-each vulnerable to concurent modification exception.Iterator solves this.
            if (str.equals("amar")) {
                arrayList.add("kaush"); // throws concurennt modification exception // traversal and modification cannot go together in a for-each//This occurs because for-each loop implicitly creates an iterator but it is not exposed to the user thus we can’t modify the items in the collections
            }
        }*/

        //---------Iterator implementation----------------
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.equals("amar")) {
                s = "raju";
                //iterator.remove(); // modification along with traversal // removes the current element in the Collection
            }
        }
        System.out.println(linkedList);
        //-------------ListIterator implementation---------------------------
        //note: create an iterator/listiterator before its modification.
        ListIterator<String> iterator1 = linkedList.listIterator();
        while (iterator1.hasNext()) {
            String s = iterator1.next();
            if (s.equals("prey")) {
                iterator1.add("Krishna"); //The element is inserted before the next element may return by next() method.
            }
        }
        System.out.println(linkedList);


        /*An Iterator is an interface in Java and we can traverse the elements of a list only in forward direction
        whereas a ListIterator is an interface that extends the Iterator interface and we can traverse the elements in both forward and backward directions
        The important methods of Iterator interface are hasNext(), next() and remove()
        important methods of ListIterator interface are add(), hasNext(), hasPrevious() and remove()
*/
    }
}
