import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int a;
        a = n % 10;
        int b;
        b = n / 10 % 10;
        int c;
        c = n / 100;


        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                for (int k = 1; k <= c; k++) {
                    System.out.printf("%d * %d * %d = %d;%n", i, j, k, i * j * k);
                }

            }
        }
    }
}
