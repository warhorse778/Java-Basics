import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tournaments = Integer.parseInt(sc.nextLine());
        int startingPoints = Integer.parseInt(sc.nextLine());

        int points = 0;
        double wins = 0;

        for (int i = 0; i < tournaments; i++){
            String placement = sc.nextLine();
            if (placement.equals("W")){
                points += 2000;
                wins++;
            } else if (placement.equals("F")){
                points += 1200;
            } else if (placement.equals("SF")){
                points += 720;
            }
        }
        int finalPoints;
        finalPoints = startingPoints + points;
        int avgPoints;
        avgPoints = points / tournaments;
        double winChance;
        winChance = (wins / tournaments) * 100;
        System.out.printf("Final points: %d%n", finalPoints);
        System.out.printf("Average points: %d%n", avgPoints);
        System.out.printf("%.2f%%%n", winChance);
    }
}
