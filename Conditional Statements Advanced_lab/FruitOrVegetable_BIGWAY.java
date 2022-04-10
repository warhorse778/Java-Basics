import java.util.Scanner;

public class FruitOrVegetable_BIGWAY {
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
                        if (fruit.equals("banana")) {
                            countity*=2.50;
                        }else if (fruit.equals("apple")) {
                            countity *= 1.20;
                        }else if (fruit.equals("orange")) {
                            countity*=0.85;
                        }else if (fruit.equals("grapefruit")) {
                            countity*=1.45;
                        }else if (fruit.equals("kiwi")) {
                            countity*=2.70;
                        }else if (fruit.equals("pineapple")) {
                            countity*=5.50;
                        }
                        else if (fruit.equals("grapes")) {
                            countity*=3.85;
                        }else {
                            isValid = false;
                        }

                        break;
                    case "Saturday":
                    case "Sunday":
                        if (fruit.equals("banana")) {
                            countity*=2.70;
                        }else if (fruit.equals("apple")) {
                            countity*=1.25;
                        }else if (fruit.equals("orange")) {
                            countity*=0.90;
                        }else if (fruit.equals("grapefruit")) {
                            countity*=1.60;
                        }else if (fruit.equals("kiwi")) {
                            countity*=3;
                        }else if (fruit.equals("pineapple")) {
                            countity*=5.60;
                        }else if (fruit.equals("grapes")) {
                            countity*=4.20;
                        }else{
                            isValid = false;
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