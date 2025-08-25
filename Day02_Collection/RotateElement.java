import java.util.*;

public class RotateList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        int k = 2;
        rotate(list, k);
        System.out.println(list);
    }

    static void rotate(List<Integer> list, int k) {
        int n = list.size();
        k %= n;
        List<Integer> rotated = new ArrayList<>();
        rotated.addAll(list.subList(k, n));
        rotated.addAll(list.subList(0, k));
        for(int i=0;i<n;i++) list.set(i, rotated.get(i));
    }
}
