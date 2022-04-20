import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int budget = Integer.parseInt(sc.nextLine());
        String season = sc.nextLine();
        int fishers = Integer.parseInt(sc.nextLine());
        double rent = 0;

        //season check
        switch (season){
            case "Spring":
                rent = 3000;
                break;
            case "Summer":
            case "Autumn":
                rent = 4200;
                break;
            case "Winter":
                rent = 2600;
                break;
        }
        //discount
        if (fishers <= 6){
            rent = rent - (rent *0.10);
        }else if(fishers > 7 && fishers <= 11){
            rent = rent - (rent *0.15);
        }else if(fishers > 12){
            rent = rent - (rent *0.25);
        }
        //bonus discount
        if(fishers % 2 == 0 && !(season.equals("Autumn"))){
            rent = rent - (rent *0.05);
        }

        if (budget >= rent) {
            System.out.printf("Yes! You have %.2f leva left.", budget - rent);
        }else{
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - rent));
        }
    }
}
