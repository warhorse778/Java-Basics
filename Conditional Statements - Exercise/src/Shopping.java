import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int videocardsCount = Integer.parseInt(scan.nextLine());
        int processorsCount = Integer.parseInt(scan.nextLine());
        int ramCount = Integer.parseInt(scan.nextLine());

        double videocards = videocardsCount * 250;
        double processors = (videocards * 0.35) * processorsCount;
        double ram = (videocards * 0.10) * ramCount;

        double totalPrice = videocards + processors + ram;

        if (videocardsCount > processorsCount){
            totalPrice = totalPrice - (totalPrice * 0.15);
        }

        if (budget >= totalPrice){
            System.out.printf("You have %.2f leva left!", budget - totalPrice);
        }else{
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrice - budget);
        }

    }
}
