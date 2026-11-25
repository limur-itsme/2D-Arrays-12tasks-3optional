public class task3 {
    static void main(String[] args) {
        int[][] a = {
                {4, 9, 2},
                {7, 1, 8},
                {5, 3, 6}
        };
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                sum += a[i][j];
            }
        }
        System.out.println(sum);
    }
}
