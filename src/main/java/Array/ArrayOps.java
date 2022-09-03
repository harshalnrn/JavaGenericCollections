package Array;

//ArrayS are homogenous data-structure, with fixed predeclared size.
public class ArrayOps {


    public static void main(String[] args) {
        int[] sample = {1, 2, 3, 4, 5}; // Initilization/Insertion : O(n) // since each value is initialized across its size
        // element cannot be deleted in array
        //traversing an array: O(n)

        for (int i = 0; i < sample.length; i++) {
            System.out.println(sample[i]);
        }

        //retreiving by index: O(1)

        System.out.println(sample[2]);

        //updating by index: O(1) : this is same as accessing an element by index
        sample[2] = 4;
        System.out.println(sample[2]);
    }
}


/*  initialization: O(n)
    no delete
    retreive by index,update by index: O(1)
    traverse across:O(n)
*/
