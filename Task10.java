public class Task10 {
    public static void main(String[] args) {
        int[][] a = {
                {42, 17, 89},
                {5, 63, 31},
                {74, 28, 90}
        };

        int sum = 0;

        System.out.print("Main diagonal: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i][i] + " ");
            sum += a[i][i];
        }

        System.out.println("\nSum: " + sum);
    }
}