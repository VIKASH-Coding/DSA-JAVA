import java.util.*;

public class ArrayListUniqueElement {

    public static void main(String args[]) {
        ArrayList<Integer> a = new ArrayList<Integer>();

        a.add(10);
        a.add(20);
        a.add(10);
        a.add(30);
        a.add(40);
        a.add(20);
        a.add(50);

        System.out.println(unique(a));
    }

    public static ArrayList<Integer> unique(ArrayList<Integer> a) {
        ArrayList<Integer> b = new ArrayList<Integer>();

        for (int i = 0; i < a.size(); i++) {
            int count = 0;

            for (int j = 0; j < a.size(); j++) {
                if (a.get(i).equals(a.get(j))) {
                    count++;
                }
            }

            if (count == 1) {
                b.add(a.get(i));
            }
        }

        return b;
    }
}
