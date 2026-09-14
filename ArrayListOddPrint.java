public class ArrayListOddPrint {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 25, 24, 26, 37, 41, };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }

}
