import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[2][3];
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("please enter integer number: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
