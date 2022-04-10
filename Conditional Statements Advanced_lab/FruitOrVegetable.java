import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isValid = true;
        String fruit = sc.nextLine();
        String day = sc.nextLine();
        double countity = Double.parseDouble(sc.nextLine());

        switch (day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (fruit) {
                    case "banana" -> countity *= 2.50;
                    case "apple" -> countity *= 1.20;
                    case "orange" -> countity *= 0.85;
                    case "grapefruit" -> countity *= 1.45;
                    case "kiwi" -> countity *= 2.70;
                    case "pineapple" -> countity *= 5.50;
                    case "grapes" -> countity *= 3.85;
                    default -> isValid = false;
                }

                break;
            case "Saturday":
            case "Sunday":
                switch (fruit) {
                    case "banana" -> countity *= 2.70;
                    case "apple" -> countity *= 1.25;
                    case "orange" -> countity *= 0.90;
                    case "grapefruit" -> countity *= 1.60;
                    case "kiwi" -> countity *= 3;
                    case "pineapple" -> countity *= 5.60;
                    case "grapes" -> countity *= 4.20;
                    default -> isValid = false;
                }
                break;
            default:
                isValid = false;
        }
        if (!isValid){
            System.out.println("error");
        }else {
            System.out.printf("%.2f", countity);
        }

    }
}

