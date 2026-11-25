public class Task2 {
    static void main(String[] args) {
        int[][] a = {
                {5, 10, 15},
                {20, 25, 30}
        };
        System.out.println(a[1][2]);
        a[0][1] = 99;
        System.out.println(a[0][1]);
    }
}
