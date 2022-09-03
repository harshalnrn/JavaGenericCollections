package GenericCollections.List.LinkedList;

import GenericCollections.ListOperations;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListOps implements ListOperations {
    /*    operations to be covered and their worst time complexities:
    1.Insertion
    -at tail : O(1) : speciality of LinkedList
    -at an index : O(n)
    2.Deletion
    - at tail: have separate method: O(1): : speciality of linkedlist
    - at head:have separate method:  O(1):
    - at an index: O(n) : but need to know how index is used in a LL
    - particular element of list: O(n)
    3. Search
    - particular element of list: O(n)
    - by index : O(n) (imp difference from AL)       //but not sure how does search by index happen in LL??
    4. Traverse entire List: O(n)
    5. Updation/Replace an existing element:
     - by index: O(N)
    */


    public static void main(String[] args) {

    }


    public void add(List<String> list) {
        //insert at tail
        String s="harshal";
        for(int i=1;i<200000;i++){
            String v=s+i;
            //adding to the tail
            list.add(v);
        }
        //insert at tail
      /*  list.add("harshal");
        list.add("sri");
        list.add("sri2");*/
        //insert at index
        //list.add(0, "raj");//shifts the rest and adds
      //  System.out.println(list);


    }

    public void remove(List<String> list){

        LinkedList list1=(LinkedList) list;
        remove(list1);
    }

    public void remove(LinkedList<String> list) {

        //delete at tail/head :(note pointer to head, and tail are both diretly available as instance variable of LL object.hence O(1)
        list.remove(); //removes head. internally calls removeFirst()
      //  System.out.println(list);
        list.removeLast();//removes tail
    //    System.out.println(list);
        //delete by index
        list.remove(2500);
        //delete specific element
        list.remove("harshal600");
       // System.out.println(list);
    }

    public void search(List<String> list) {
        //search by index
       // System.out.println(list.get(10000));
        //search specific element
        System.out.println(list.contains("harshal13000"));
       // System.out.println(Collections.binarySearch(list, "harshal750")); //returns int (i.e 0 /negative value)
    }

    public void traverse(List<String> list) {

        //can use for, for-each, Iterator, List-iterator
        for (String s : list) {
           // System.out.println(s);
        }
    }

    public void update(List<String> list) {

        //by index
        list.set(1000, "kaushi");
      //  System.out.println(list);
        //by element
    }
}
