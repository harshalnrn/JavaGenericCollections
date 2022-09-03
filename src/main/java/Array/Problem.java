package Array;

import java.util.HashMap;

public class Problem {

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 1, 1};
        System.out.println(getBalancedSubArraysNumber(arr));

    }

    public static int getBalancedSubArraysNumber(int[] arr) {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        int balancingCounter = 0;
        int res = 0;
        h.put(0, 1); // why this?
        for (int val : arr) {
            if (val == 0) {
                balancingCounter--;
            } else {
                balancingCounter++;
            }
            if (h.containsKey(balancingCounter)) {
                res += h.get(balancingCounter);
            }
            // h.put(balancingCounter, h.getOrDefault(balancingCounter, 0) + 1); // inserting balancingCounter as key //freq map

        }
        return res;
    }


}
