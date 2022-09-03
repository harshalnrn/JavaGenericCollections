package GenericCollections;

import GenericCollections.List.ArrayList.ArrayListOps;
import GenericCollections.List.LinkedList.LinkedListOps;
import GenericCollections.Maps.MapOps;
import GenericCollections.Sets.SetOps;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayListOps obj1 = new ArrayListOps();
       /*
        List<String> list = new ArrayList<String>();
        Set<String> set = new HashSet<String>();
        Set<String> set1 = new LinkedHashSet<String>();
        System.out.println("add ops in arraylist");
        obj1.add(list);
       // System.out.println("remove ops from arraylist");
        //obj1.remove(list);
      //  System.out.println("search ops in arraylist");
       // obj1.search(list);
       // System.out.println("traverse ops in arraylist");
        //obj1.traverse(list);
       // System.out.println("update ops in arraylist");
        //obj1.update(list);
        **/
        Employee emp = new Employee(123, "harshal");
        Employee emp1 = new Employee(120, "harshal1");
        Employee emp2 = new Employee(124, "harshal2");
        Employee emp3 = new Employee(115, "harshal3");
        List<Employee> list1 = new ArrayList<>();
        list1.add(emp);
        list1.add(emp1);
        list1.add(emp2);
        list1.add(emp3);
        // obj1.sortInAscendingById(list1);
        //obj1.sortInDescendingById(list1);

//------------------------


        // LinkedListOps obj2 = new LinkedListOps();
        //List<String> list1 = new LinkedList<String>();
        //System.out.println("add ops ll ");
        //obj2.add(list1);

        // System.out.println("remove ops");
        //obj2.remove(list1);
        //  System.out.println("search ops ll ");
        // obj2.search(list1);
        //System.out.println("traverse ops");
        //obj2.traverse(list1);
        //System.out.println("update ops");
        //obj2.update(list1);


        //-------------
        SetOps setOps = new SetOps();
        Comparator<Employee> compare = (Employee obj2, Employee obj3) -> {
            return obj2.getEmployeeNo() - obj3.getEmployeeNo();
        };
        Comparator<Employee> compare1 = (Employee obj2, Employee obj3) -> {
            return -(obj2.getEmployeeNo() - obj3.getEmployeeNo());
        };
        Set<Employee> set1 = new TreeSet<>(compare);
        Set<Employee> set2 = new TreeSet<>(compare1);
        Set<Employee> set3 = new HashSet<>();

        set1.add(emp);
        set1.add(emp1);
        set1.add(emp2);
        set1.add(emp3);

        set2.add(emp);
        set2.add(emp1);
        set2.add(emp2);
        set2.add(emp3);

        set3.add(emp);
        set3.add(emp1);
        set3.add(emp2);
        set3.add(emp3);
        //  setOps.sortInAscendingById(set1);
        //setOps.sortInDescendingById(set2);

        //  setOps.sortInAscendingById(set3);
        // setOps.sortInDescendingById(set3);
        //  System.out.println("add ops hashset ");
        // setOps.add(set);
        // System.out.println("add ops linkedhashset ");
        //setOps.add(set1);
        // setOps.remove(set);
        //  System.out.println("search ops set ");
        // setOps.search(set);
        // setOps.traverse(set);*/

        //------------------------------------------------------------------

        Map<Integer, String> map = new TreeMap<>(); //wrappers implement comparator. so by default shall get stored by key in ascending order. what to do for sorting integers in descending?

        MapOps mapOps = new MapOps();
        mapOps.add(map);
        // mapOps.AscendingByKey(map);
        // mapOps.DescendingByKey(map);
        mapOps.AscendingByValue(map);
        mapOps.DescendingByValue(map);


        /**
         mapOps.remove(map);
         mapOps.search(map);
         mapOps.traverse(map);
         mapOps.update(map);**/


    }
}
