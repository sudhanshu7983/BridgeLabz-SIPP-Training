import java.util.*;

public class NthFromEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A","B","C","D","E"));
        int n = 2;
        System.out.println(getNthFromEnd(list, n));
    }

    static String getNthFromEnd(LinkedList<String> list, int n) {
        Iterator<String> p1 = list.iterator();
        Iterator<String> p2 = list.iterator();

        for(int i=0;i<n;i++) p1.next();
        while(p1.hasNext()) {
            p1.next();
            p2.next();
        }
        return p2.next();
    }
}
