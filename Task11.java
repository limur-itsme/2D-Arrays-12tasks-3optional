import java.lang.reflect.Array;
import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        int[][] a = {
                {12, -5, 8},
                {-3, 19, -11},
                {4, -7, 25}
        };

        System.out.println("Before:");
        System.out.println(Arrays.deepToString(a));
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < 0) {
                    a[i][j] = 0;
                }
            }
        }
        System.out.println("\nAfter:");
        System.out.println(Arrays.deepToString(a));
    }
}
