import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int statistics = Integer.parseInt(scan.nextLine());
        double cloth = Double.parseDouble(scan.nextLine());

        double decor = budget * 0.10;


        double clothStatPrice = statistics * cloth;
        if (statistics > 150){
            clothStatPrice = clothStatPrice - (clothStatPrice * 0.10);
        }

        if (budget < decor+clothStatPrice){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", (decor+clothStatPrice) - budget);
        }else{
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - (decor+clothStatPrice));
        }
    }
}
