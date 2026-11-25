import java.util.Arrays;

public class OptTaskC {
    static void main(String[] args) {
        int[][] matrixA = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] matrixB = {
                {7, 8, 9},
                {10, 11, 12}
        };
        int[][] matrixC = new int[2][3];
        for(int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++){
                int inmatrixc = 0;
                inmatrixc += matrixA[i][j];
                inmatrixc += matrixB[i][j];
                matrixC[i][j] = inmatrixc;
            }
        }
        System.out.println(Arrays.deepToString(matrixC));
    }
}
