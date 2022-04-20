import java.util.Scanner;

public class cleverLily {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int years = Integer.parseInt(sc.nextLine());
        double washingMachine = Double.parseDouble(sc.nextLine());
        int toyPrice = Integer.parseInt(sc.nextLine());

        int brother = 0;
        int savings = 0;
        int toys = 0;
        int money = 0;
        int totalSavings;

        for (int i = 1; i <= years; i++){
            if (i % 2 == 0) {
                money = money + 10;
                savings = savings + money;
                brother += 1;
            } else {
                toys++;
            }
        }
        totalSavings = savings + (toys * toyPrice) - brother;
        if (totalSavings >= washingMachine){
            System.out.printf("Yes! %.2f", totalSavings - washingMachine);
        } else {
            System.out.printf("No! %.2f", Math.abs(totalSavings - washingMachine));
        }
    }
}
