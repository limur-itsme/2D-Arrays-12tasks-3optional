public class Task4 {
    static void main(String[] args) {
        int[][] matrix = {
                {42, 17, 89},
                {5, 63, 31},
                {74, 28, 90}
        };
        int oddNums = 0;
        int evenNums =0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] % 2 == 0){
                    evenNums++;
                }
                else
                    oddNums++;
            }
        }
        System.out.println("Odd: " + oddNums);
        System.out.println("Even: " + evenNums);
    }
}
