import java.util.Scanner;

public class HairSalon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //haircut
        int mens = 15;
        int ladies = 20;
        int kids = 10;

        //color
        int touchUp = 20;
        int fullColor = 30;

        int goalForTheDay = Integer.parseInt(sc.nextLine());
        int currentMoney = 0;
        boolean targetReached = false;

        while(currentMoney <= goalForTheDay){
            String what = sc.nextLine();
            if (what.equals("closed")) {
                break;
            }
            switch (what){
                case "haircut":
                    String haircut = sc.nextLine();
                    switch (haircut) {
                        case "mens":
                            currentMoney = currentMoney + mens;
                            break;
                        case "ladies":
                            currentMoney = currentMoney + ladies;
                            break;
                        case "kids":
                            currentMoney = currentMoney + kids;
                            break;
                    }
                    break;
                case "color":
                    String color = sc.nextLine();
                    switch (color) {
                        case "touch up":
                            currentMoney = currentMoney + touchUp;
                            break;
                        case "full color":
                            currentMoney = currentMoney + fullColor;
                            break;
                    }
                    break;
                    }
            if(currentMoney >= goalForTheDay){
                targetReached = true;
                break;
            }
            }
        if(!targetReached){
            System.out.printf("Target not reached! You need %dlv. more.%n", goalForTheDay - currentMoney);
            System.out.printf("Earned money: %dlv.",currentMoney);
        } else {
            System.out.printf("You have reached your target for the day!%n");
            System.out.printf("Earned money: %dlv.", currentMoney);
        }
        }
    }

