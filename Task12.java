public class Task12 {
    static void main(String[] args) {
        int[][] a = {
                {85, 90, 78, 92},
                {76, 88, 84, 79},
                {95, 91, 89, 94}
        };
        double overallAverage = 0;
        int overallSum = 0;
        int countForOverall = 0;
        int max = 0;
        for(int i = 0; i < a.length; i++) {
            double eachAverage = 0;
            int eachSum = 0;
            int countForEach = 0;
            for (int j = 0; j < a[i].length; j++) {
                overallSum += a[i][j]; eachSum += a[i][j];
                countForEach++; countForOverall++;
                if(j == a[i].length-1){
                    System.out.println("Average of student " + (i+1) + ": " + (eachSum/countForEach));
                }

                if(a[i][j] > max){
                    max = a[i][j];
                }
            }
        }
        System.out.println("Overall average: " + (overallSum/countForOverall));
        System.out.println("Maximum: " + max);
    }
}
