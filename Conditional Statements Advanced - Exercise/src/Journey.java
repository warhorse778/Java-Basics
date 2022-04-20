import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();
        String place = "";
        String where = "";

        if (budget <= 100){
            place = "Bulgaria";
            if(season.equals("summer")){
                budget = budget * 0.30;
                where = "Camp";
            }else if(season.equals("winter")){
                budget = budget * 0.70;
                where = "Hotel";
            }
        }
        if (budget <= 1000 && budget > 100){
            place = "Balkans";
            if(season.equals("summer")){
                where = "Camp";
                budget = budget * 0.40;
            }else if(season.equals("winter")){
                where = "Hotel";
                budget = budget * 0.80;
            }
        }
        if (budget > 1000){
            where = "Hotel";
            place = "Europe";
            budget = budget * 0.90;
        }
        System.out.printf("Somewhere in %s%n", place);
        System.out.printf("%s - %.2f", where, budget);
    }
}
