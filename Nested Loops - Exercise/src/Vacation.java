import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(sc.nextLine());
        double availableMoney  = Double.parseDouble(sc.nextLine());

        double currentMoney  = availableMoney;


        int spendStreak = 0;
        int days = 0;

        boolean cantSave = false;

        while(currentMoney < moneyNeeded) {
            days++;
           String action = sc.nextLine();
            double sum = Double.parseDouble(sc.nextLine());

            switch(action) {
                case "save":
                    spendStreak = 0;
                    currentMoney += sum;
                    break;
                case "spend":
                    spendStreak++;
                    currentMoney -= sum;
                    if(currentMoney < 0){
                        currentMoney = 0;
                    }
                    break;
            }

            if(spendStreak == 5) {
                cantSave = true;
                break;
            }
        }

        if (cantSave){
            System.out.println("You can't save the money.");
            System.out.println(days);
        } else {
            System.out.printf("You saved the money for %d days.", days);
        }
    }
}
