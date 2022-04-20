import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input  = sc.nextLine();
        double sum = 0;

        while (!input.equals("NoMoreMoney")) {
            double amount = Double.parseDouble(input);
            if (amount < 0){
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n", amount);


            sum += amount;
            input = sc.nextLine();
        }
        System.out.printf("Total: %.2f", sum);
    }
}
