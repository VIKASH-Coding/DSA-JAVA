import java.util.*;

public class MatrixSumOfElement {

    static int columnSum(int[][] matrix, int col) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum = sum + matrix[i][col];
        }

        return sum;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 }
        };

        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();

        System.out.println(columnSum(matrix, col));
    }
}
