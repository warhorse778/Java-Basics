import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String month = sc.nextLine();
        int sleeps = Integer.parseInt(sc.nextLine());
        double studioPriceNight;
        double apartmentPriceNight;

        switch (month){
            case "May":
            case "October":
                studioPriceNight = 50;
                apartmentPriceNight = 65;
                if(sleeps > 14){
                studioPriceNight = studioPriceNight - (studioPriceNight * 0.30);
                apartmentPriceNight = apartmentPriceNight - (apartmentPriceNight * 0.10);
                }else if(sleeps > 7 ){
                    studioPriceNight = studioPriceNight - (studioPriceNight * 0.05);
                }
                System.out.printf("Apartment: %.2f lv.\n", sleeps * apartmentPriceNight);
                System.out.printf("Studio: %.2f lv.", sleeps * studioPriceNight);
                break;
            case "June":
            case "September":
                studioPriceNight = 75.20;
                apartmentPriceNight = 68.70;
                if(sleeps > 14) {
                    studioPriceNight = studioPriceNight - (studioPriceNight * 0.20);
                    apartmentPriceNight = apartmentPriceNight - (apartmentPriceNight * 0.10);
                }
                System.out.printf("Apartment: %.2f lv.\n", sleeps * apartmentPriceNight);
                System.out.printf("Studio: %.2f lv.", sleeps * studioPriceNight);
                break;
            case "July":
            case "August":
                studioPriceNight = 76;
                apartmentPriceNight = 77;
                if(sleeps > 14){
                    apartmentPriceNight = apartmentPriceNight - (apartmentPriceNight * 0.10);
                }
                System.out.printf("Apartment: %.2f lv.\n", sleeps * apartmentPriceNight);
                System.out.printf("Studio: %.2f lv.", sleeps * studioPriceNight);
                break;


        }
    }
}
