public class Task7 {
    static void main(String[] args) {
        int[][] a = {
                {42, 17, 89},
                {5, 63, 31},
                {74, 28, 90}
        };

        for (int i = 0; i < a[0].length; i++) {
            int columnSum = 0;
            for (int j = 0; j < a.length; j++) {
                columnSum += a[j][i];
            }
            System.out.println("Column " + i + ": " + columnSum);
        }

    }
}
