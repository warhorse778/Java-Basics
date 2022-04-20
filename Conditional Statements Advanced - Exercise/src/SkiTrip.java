import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = Integer.parseInt(sc.nextLine());
        String typePlace = sc.nextLine();
        String rating = sc.nextLine();

        double price = 0;
        int overnights = days - 1;


        switch (typePlace){
            case "room for one person":
                if(days < 10){
                    price = overnights * 18;
                }else if(days > 10 && days < 15){
                    price = overnights * 18;
                }else if(days > 15){
                    price = overnights * 18;
                }
                break;
            case "apartment":
                if(days < 10){
                    price = (overnights * 25) * 0.70;
                }else if(days > 10 && days < 15){
                    price = (overnights * 25) * 0.65;
                }else if(days > 15){
                    price = (overnights * 25) * 0.50;
                }
                break;
            case "president apartment":
                if(days < 10){
                    price = (overnights * 35) * 0.90;
                }else if(days > 10 && days < 15){
                    price = (overnights * 35) * 0.85;
                }else if(days > 15){
                    price = (overnights * 35) * 0.80;
                }
                break;
        }
        switch (rating){
            case "positive":
                price *= 1.25;
                break;
            case "negative":
                price *= 0.90;
                break;
        }

        System.out.printf("%.2f", price);

    }
}
