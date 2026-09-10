import java.util.*;

public class MatrixSumOfAllElementsRow {

    static int[] rowSum(int[][] matrix) {

        int[] result = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {

            int sum = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                sum = sum + matrix[i][j];
            }

            result[i] = sum;
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 }
        };

        int[] ans = rowSum(matrix);

        for (int x : ans) {
            System.out.println(x + " ");
        }
    }
}
