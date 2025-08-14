package Day02_Stack_Queue_HashSET_HashMAP;

import java.util.*;

public class PairSum {
    public static boolean hasPair(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(target - num)) return true;
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int target = 17;
        System.out.println(hasPair(arr, target));
    }
}
