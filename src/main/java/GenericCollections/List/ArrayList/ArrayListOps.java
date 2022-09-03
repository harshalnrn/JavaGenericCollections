package GenericCollections.List.ArrayList;

import GenericCollections.Employee;
import GenericCollections.ListOperations;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListOps implements ListOperations {
/*    operations to be covered and their worst time complexities:
    1.Insertion
    This single add operation which is in fact a "create new bigger array, copy old array into it((Arrays.copyOf()), and then add one element to the end" operation is O(n) asymptotic complexity
    -at tail : O(n)
    -at an index : O(n)
    2.Deletion
    - at tail: no direct method. need to be eighter traversed or access via index and deleted: O(n)
    - at head : no direct method. need to be eighter traversed or access via index and deleted: best-case of O(1)
    - at an index: O(n)
    - particular element of list: O(n)
    3. Search
    - by particular element of list: O(n)
    - by index : O(1) speciality of array/arraylist for random access read
    4. Traverse entire List: O(n)
    5. Updation/Replace an existing element:
    - by index:  ?? (should this be O(1), since searching by index is O(1) before you update it
    */


    /**
     * Collection.sort(): for wrapper types, to reverse the order: we can use Collection.reverseOrder(). by default it sorts in ascending order for wrapper types
     **/
    public void add(List<String> list) {

        //insert at tail
        String s = "harshal";
        for (int i = 1; i < 200000; i++) {
            String v = s + i;
            //adding to the tail
            list.add(v);
        }
/*        list.add("harshal");
        list.add("sri");
        list.add("sri2");*/
        //insert at index
        //  list.add(0, "raj");
        //  System.out.println(list);


    }

    public void remove(List<String> list) {

        //benchmarking of remove remains bit inconsistent
        //delete at tail/head : Not applicable for arraylist, since it doesnt have direct view of head/tail element, and only possible via index

        //delete by index
        // list.remove(0); //head
        list.remove(list.size() - 1); //tail // this seems to be slower as compared to LL in benchmarking. why??
        //list.remove(2500);
        //delete specific element
        // list.remove("harshal600");
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
        //System.out.println(list);
        //by element. no encapsulated method. iterate manually,search for the element and update
    }


    public void sortInAscendingById(List<Employee> list) {
        // comparator implementation with lambda function
        // condition for Collections.sort()
        // if methods returns> 0 , emp1.id>emp2.id
        // if methods returns<0, emp1.id<emp2.id
        // else both equal
        Comparator<Employee> compare = (Employee emp1, Employee emp2) -> {
            return emp1.getEmployeeNo() - emp2.getEmployeeNo();
        };

        Collections.sort(list, compare);

        for (Employee emp : list) {
            System.out.println(emp.getEmployeeNo());
        }

    }

    public void sortInDescendingById(List<Employee> list) {
        // comparator implementation with lambda function
        Comparator<Employee> compare = (Employee emp1, Employee emp2) -> {
            return -(emp1.getEmployeeNo() - emp2.getEmployeeNo());
        };

        Collections.sort(list, compare);
        for (Employee emp : list) {
            System.out.println(emp.getEmployeeNo());
        }

    }
}
