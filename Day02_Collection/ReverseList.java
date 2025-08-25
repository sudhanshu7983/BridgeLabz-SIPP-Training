import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> linkedList = new LinkedList<>(arrayList);

        reverseList(arrayList);
        reverseList(linkedList);

        System.out.println("Reversed ArrayList: " + arrayList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }

    static void reverseList(List<Integer> list) {
        int i = 0, j = list.size() - 1;
        while(i < j) {
            Integer temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++; j--;
        }
    }
}
