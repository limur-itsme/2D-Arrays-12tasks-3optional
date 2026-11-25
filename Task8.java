import java.util.Scanner;

public class Task8 {
    static void main(String[] args) {
        int[][] a = {
                {42, 17, 89},
                {5, 63, 31},
                {74, 28, 90}
        };
        Scanner scanner = new Scanner(System.in);
        int greater = 0;
        System.out.print("Please enter integer number: ");
        int input = scanner.nextInt();
        for(int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(input < a[i][j]){
                    greater++;
                }
            }
        }
        System.out.println(greater + " greater than your number(" + input + ")");
    }
}
