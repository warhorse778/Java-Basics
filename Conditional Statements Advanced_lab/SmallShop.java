import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();
        String city = scan.nextLine();
        double countity = Double.parseDouble(scan.nextLine());

        if (city.equals("Sofia")){
            if (item.equals("coffee")){
                System.out.println(countity * 0.50);
            }
            if (item.equals("water")){
                System.out.println(countity * 0.80);
            }
            if (item.equals("beer")){
                System.out.println(countity * 1.20);
            }
            if (item.equals("sweets")){
                System.out.println(countity * 1.45);
            }
            if (item.equals("peanuts")){
                System.out.println(countity * 1.60);
            }

        }
        if (city.equals("Plovdiv")){
            if (item.equals("coffee")){
                System.out.println(countity * 0.40);
            }
            if (item.equals("water")){
                System.out.println(countity * 0.70);
            }
            if (item.equals("beer")){
                System.out.println(countity * 1.15);
            }
            if (item.equals("sweets")){
                System.out.println(countity * 1.30);
            }
            if (item.equals("peanuts")){
                System.out.println(countity * 1.50);
            }

        }
        if (city.equals("Varna")){
            if (item.equals("coffee")){
                System.out.println(countity * 0.45);
            }
            if (item.equals("water")){
                System.out.println(countity * 0.70);
            }
            if (item.equals("beer")){
                System.out.println(countity * 1.10);
            }
            if (item.equals("sweets")){
                System.out.println(countity * 1.35);
            }
            if (item.equals("peanuts")){
                System.out.println(countity * 1.55);
            }

        }
    }
}
