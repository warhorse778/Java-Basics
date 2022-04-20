import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n;i++){
            int currentNum = Integer.parseInt(sc.nextLine());
            sum += currentNum;
            if (currentNum > max){
                max = currentNum;
            }
        }
        sum -= max;
        if (max == sum){
            System.out.printf("Yes\nSum = %d", max);
        } else {
            System.out.printf("No\nDiff = %d", Math.abs(max - sum));
        }
    }
}
