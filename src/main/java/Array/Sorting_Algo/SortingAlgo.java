package Array.Sorting_Algo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class SortingAlgo {

    public static void main(String[] args) {
        int[] a = {1, 5, 2, 6, 14, 9, 1, 3};
        //bubble sort
        //sorted array gets created from right to left
        //outer loop: n-1 passes : [1,n-1]
        //inner loop: [0, n-i) //right shrinks as we ignore already sorted elements


        for (int i = 1; i <= a.length - 1; i++) {
            for (int j = 0; j < a.length - i; j++) {

                if (a[j] > a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));


        //selection sort
        //sorted array gets created from left to right with single swap per pass (i.e  min element among all unsorted elements selected, and then element swapped once per pass).
        //left side shrinks
        for (int i = 1; i <= a.length - 1; i++) {
            int minIndex = i - 1;
            int maxIndex = i - 1;
            for (int j = i; j < a.length; j++) {
                if (i - 1 == 0 || (i - 1) % 2 == 0) {
                    if (a[maxIndex] < a[j]) {
                        maxIndex = j;
                    }
                } else {
                    if (a[minIndex] > a[j]) {
                        minIndex = j;
                    }
                }
            }
            if (i - 1 == 0 || (i - 1) % 2 == 0) {
                int temp = a[i - 1];
                a[i - 1] = a[maxIndex];
                a[maxIndex] = temp;

            } else {
                int temp = a[i - 1];
                a[i - 1] = a[minIndex];
                a[minIndex] = temp;

            }
        }

        System.out.println(Arrays.toString(a));


        //insertion sort :o to i is the sorted array and rest unsorted

        for (int i = 1; i <= a.length - 1; i++) {

            for (int j = i; j >= 1; j--) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(a));
    }
}

//focus on end limits