import java.util.*;

public class TwoDArraylistPrintEven {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(10);
        arr1.add(11);
        arr1.add(12);
        arr.add(arr1);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(13);
        arr2.add(14);
        arr2.add(15);
        arr.add(arr2);

        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.add(16);
        arr3.add(17);
        arr3.add(18);
        arr.add(arr3);

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                if (arr.get(i).get(j) % 2 == 0) {
                    System.out.println(arr.get(i).get(j));
                }
            }
        }
    }
}
