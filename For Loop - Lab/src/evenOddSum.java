import java.util.Scanner;

public class evenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 1; i <= n; i++){
            int currentNum = Integer.parseInt(sc.nextLine());
            if (i % 2 != 0){
                oddSum = oddSum + currentNum;
            } else {
                evenSum = evenSum + currentNum;
            }
        }

        if (evenSum == oddSum){
            System.out.printf("Yes%nSum = %d", evenSum);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(evenSum - oddSum));
        }

    }
}
