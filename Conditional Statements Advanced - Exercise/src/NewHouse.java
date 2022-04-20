import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String flower = sc.nextLine();
        int flowerCount = Integer.parseInt(sc.nextLine());
        double budget = Double.parseDouble(sc.nextLine());
        double price = 0;
        double dis = 1;
        double budgetNeeded = 0;

        switch (flower){
            case "Roses":
                price = 5.00;
                if(flowerCount > 80){
                    budgetNeeded = (price * flowerCount) - ((price * flowerCount) * 0.10);
                }else{
                    budgetNeeded = price * flowerCount;
                }
                break;
            case "Dahlias":
                price = 3.80;
                if(flowerCount > 90){
                    budgetNeeded = (price * flowerCount) - ((price * flowerCount) * 0.15);
                }else {
                    budgetNeeded = (price * flowerCount);
                }
                break;
            case "Tulips":
                price = 2.80;
                if(flowerCount > 80){
                    budgetNeeded = (price * flowerCount) -((price * flowerCount) * 0.15);
                }else{
                    budgetNeeded = (price * flowerCount);
                }
                break;
            case "Narcissus":
                price = 3.00;
                if(flowerCount < 120){
                    budgetNeeded = (price * flowerCount) + ((price * flowerCount) * 0.15);
                }else{
                    budgetNeeded = (price * flowerCount);
                }
                break;
            case "Gladiolus":
                price = 2.50;
                if(flowerCount < 80){
                    budgetNeeded = (price * flowerCount) + ((price * flowerCount) * 0.20);
                }else{
                    budgetNeeded = (price * flowerCount);
                }
                break;
            default:
                break;


        }

        if (budget >= budgetNeeded){
            budget = budget - budgetNeeded;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flower, budget);
        }else{
            budget = budgetNeeded - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", budget);
        }

    }
}
