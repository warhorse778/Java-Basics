import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());
        double sum;
        String operation = sc.nextLine();

        String evenOdd;

        switch (operation){
            case "+":
                sum = n1 + n2;
                if (sum % 2 ==0){
                    evenOdd = "even";
                }else{
                    evenOdd = "odd";
                }
                System.out.printf("%d + %d = %.0f - %s", n1, n2, sum, evenOdd);
                break;
            case "-":
                sum = n1 - n2;
                if (sum % 2 ==0){
                    evenOdd = "even";
                }else{
                    evenOdd = "odd";
                }
                System.out.printf("%d - %d = %.0f - %s", n1, n2, sum, evenOdd);
                break;
            case "*":
                sum = n1 * n2;
                if (sum % 2 ==0){
                    evenOdd = "even";
                }else{
                    evenOdd = "odd";
                }
                System.out.printf("%d * %d = %.0f - %s", n1, n2, sum, evenOdd);
                break;
            case "/":
                if (n2 == 0){
                    System.out.printf("Cannot divide %d by zero", n1);
                }else if (n2 != 0){
                sum = (double)n1 / (double)n2;
                    System.out.printf("%d / %d = %.2f", n1, n2, sum);
            }
                break;
            case "%":
                if (n2 == 0){
                    System.out.printf("Cannot divide %d by zero", n1);
                }else if (n2 != 0){
                    sum = n1 % n2;
                    System.out.printf("%d %% %d = %.0f", n1, n2, sum);
                }
                break;


        }
    }
}
