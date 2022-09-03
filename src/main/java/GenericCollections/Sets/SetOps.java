package GenericCollections.Sets;

import GenericCollections.Employee;
import GenericCollections.ListOperations;
import GenericCollections.SetOperations;

import java.util.*;

// Understand how sets are implemented using Hashmaps
// sets never have duplicates, because of its hashmap implementation.
// set doesnt have get() method and doesn't have indexed access.

//Timecomplexity:
//sets are usually either trees (i.e Treeset)  O(logn) or hash tables O(1) (hashset/linkedhashset)

/**
 * HashSet/LinkedHashSet:
 * <p>
 * - Add:
 * add to tail: O(1)
 * - Search:
 * search by element:O(1)
 * - Traverse: O(n)
 * - Remove
 **/

// observation: for smaller data set above complexity looks fine.
// But for larger data set, performance of sets seems to drop, where there isnt much difference as compared to AL/LL . ex: add operation. Hence again questioning the theory!!
public class SetOps implements SetOperations {

    public void add(Set<String> set) {
        String s = "harshal";
        for (int i = 0; i < 200000; i++) {
            String v = s + i;
            set.add(v);
        }
        // System.out.println(set);
    }

    public void remove(Set<String> set) {

        //remove particular element
        set.remove("harshal3000");
    }

    public void search(Set<String> set) {
        //search specific elements
        // set doesnt have get() method
        System.out.println(set.contains("harshal13000"));
        //note java : binary search is implemented only for arrays/lists.

    }

    public void traverse(Set<String> set) {
//for-each/iterator
        for (String s : set) {
            System.out.println(s);
        }
    }

    public void update(Set<String> set) {

        //no direct method to update element in sets. only possibility is to remove and add new element to tail
    }

    //sort sets of custom objects
    public void sortInAscendingById(Set<Employee> set) {
        //eighter create a treeset and store in sorted manner, based on comparator implementation
        if (set.getClass().getName().equals("java.util.TreeSet")) {
            for (Employee emp : set) {
                System.out.println(emp.getEmployeeNo());
            }
        } else {
            // OR set-list-set

            List<Employee> list = new ArrayList<>(set);
            Comparator<Employee> compare = (Employee emp1, Employee emp2) -> {
                return emp1.getEmployeeNo() - emp2.getEmployeeNo();
            };
            Collections.sort(list, compare);
            Set<Employee> set1 = new LinkedHashSet<>(list);
            for (Employee emp : set1) {
                System.out.println(emp.getEmployeeNo());
            }
        }
    }

    public void sortInDescendingById(Set<Employee> set) {
        //eighter create a treeset and store in sorted manner

        if (set.getClass().getName().equals("java.util.TreeSet")) {
            for (Employee emp : set) {
                System.out.println(emp.getEmployeeNo());
            }
        } else {
            // OR set-list-set
            List<Employee> list = new ArrayList<>(set);
            Comparator<Employee> compare = (Employee emp1, Employee emp2) -> {
                return -(emp1.getEmployeeNo() - emp2.getEmployeeNo());
            };
            Collections.sort(list, compare);
            Set<Employee> set1 = new LinkedHashSet<>(list);
            for (Employee emp : set1) {
                System.out.println(emp.getEmployeeNo());
            }
        }
    }
    //methods unique to Sets since java8


}
