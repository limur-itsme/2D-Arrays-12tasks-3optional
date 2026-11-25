import java.util.Arrays;

public class OptTaskB {
    static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] b = new int[3][2];
        for(int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++){
                b[j][i] = a[i][j];
            }
        }
        System.out.println(Arrays.deepToString(b));

    }
}
