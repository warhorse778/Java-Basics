import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int maxN = Integer.MIN_VALUE;
        int minN = Integer.MAX_VALUE;

        for (int i = 0;i < n; i++){
            int num = Integer.parseInt(sc.nextLine());
            if (num > maxN) {
                maxN = num;
            }
            if (num < minN){
                minN = num;
            }
        }
        System.out.printf("Max number: %d%n", maxN);
        System.out.printf("Min number: %d", minN);
    }
}
