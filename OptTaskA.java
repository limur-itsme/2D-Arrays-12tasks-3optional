public class OptTaskA {
    static void main(String[] args) {
        int[][] a = {
                {85, 90, 78, 92},
                {76, 88, 84, 79},
                {95, 91, 89, 94}
        };
        int sumOfRow1 = 0;
        int sumOfRow2 = 0;
        int sumOfRow3 = 0;
        for(int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++){
                if(i == 0){
                    sumOfRow1 += a[i][j];
                }
                else if(i == 1) {
                    sumOfRow2 += a[i][j];
                }
                else if(i == 2) {
                    sumOfRow3 += a[i][j];
                }
            }
        }
        if(sumOfRow1 > sumOfRow2 && sumOfRow1 > sumOfRow3){
            System.out.println("Row 1 " + sumOfRow1);
        }
        else if(sumOfRow2 > sumOfRow3 && sumOfRow2 > sumOfRow1) {
            System.out.println("Row 2 " + sumOfRow2);
        }
        else if(sumOfRow2 < sumOfRow3 && sumOfRow3 > sumOfRow1) {
            System.out.println("Row 3 " + sumOfRow3);
        }
        else{
            System.out.println("incorrect");
        }
    }
}
