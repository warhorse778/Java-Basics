import java.util.Scanner;
public class Testkolega {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excMoney = Double.parseDouble(scanner.nextLine());
        int numPuzzle = Integer.parseInt(scanner.nextLine());
        int numDolls = Integer.parseInt(scanner.nextLine());
        int numBears = Integer.parseInt(scanner.nextLine());
        int numMinions = Integer.parseInt(scanner.nextLine());
        int numTrucks = Integer.parseInt(scanner.nextLine());

        int allToys = numPuzzle + numDolls + numBears + numMinions + numTrucks;

        double puzzlePrice = numPuzzle * 2.60;
        double dollPrice = numDolls * 3;
        double bearsPrice = numBears * 4.10;
        double minionPrice = numMinions * 8.20;
        double trucksPrice = numTrucks * 2;

        double profit = puzzlePrice + dollPrice + bearsPrice + minionPrice + trucksPrice;


         if (allToys >= 50) {
             profit = profit - (profit * 0.25);
         }

        double totProfit = profit - (profit * 0.10);

        if(totProfit >= excMoney) {

            System.out.printf("Yes! %.2f lv left.", totProfit - excMoney);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", excMoney - totProfit);
        }
    }
}

