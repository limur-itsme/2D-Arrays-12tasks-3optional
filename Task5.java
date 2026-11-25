public class Task5 {
    static void main(String[] args) {
        int[][] matrix = {
                {42, 17, 89, 70},
                {5, 63, 31, 65},
                {74, 28, 90, 87}
        };
        int max = 0;
        int min = matrix[0][0];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                }

            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
