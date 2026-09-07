
import java.util.*;

public class ArrayListOdd {
    public static void main(String args[]) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(10);
        al.add(15);
        al.add(20);
        al.add(25);
        al.add(30);
        al.add(35);

        System.out.println(odd(al));
    }

    public static ArrayList<Integer> odd(ArrayList<Integer> al) {
        ArrayList<Integer> b = new ArrayList<Integer>();

        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) % 2 != 0)
                b.add(al.get(i));
        }
        System.out.println("Odd numbers in the array are: " + al);
        return b;
    }
}