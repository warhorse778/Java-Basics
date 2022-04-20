import java.util.Scanner;

public class leftAndRightSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int leftSum = 0;

        for (int i = 0; i < n; i++){
            int currentNum = Integer.parseInt(sc.nextLine());

            leftSum = leftSum + currentNum;
        }
        int rightSum = 0;

        for (int i = 0; i < n; i++){
            int currentNum = Integer.parseInt(sc.nextLine());

            rightSum = rightSum + currentNum;
        }

        if (leftSum == rightSum){
            System.out.printf("Yes, sum = %d", leftSum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(leftSum - rightSum));
        }

    }
}
