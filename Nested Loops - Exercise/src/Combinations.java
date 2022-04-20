import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int combinations = 0;

        for (int a = 0; a <= n; a++) {
            for (int b = 0; b <= n; b++) {
                for (int c = 0; c <= n; c++) {
                    if(a + b + c == n){
                        combinations++;
                    }
                }
            }
        }
        System.out.println(combinations);
    }
}