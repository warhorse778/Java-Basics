import java.util.Scanner;

public class MaidenParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double loveMsg = 0.60;
        double vRose = 7.20;
        double keychain = 3.60;
        double karikatura = 18.20;
        double randomLuck = 22;

        //25 poveche pravi 35% dis

        double partyPrice = Double.parseDouble(sc.nextLine());
        int brLoveMsg = Integer.parseInt(sc.nextLine());
        int brVRose = Integer.parseInt(sc.nextLine());
        int brKeychains = Integer.parseInt(sc.nextLine());
        int brKarikaturi = Integer.parseInt(sc.nextLine());
        int brLucks = Integer.parseInt(sc.nextLine());

        double sum = 0;
        int countItems = 0;

        countItems = brLoveMsg + brVRose + brKarikaturi + brKeychains + brLucks;

        sum = (loveMsg * brLoveMsg) + (vRose * brVRose)
                + (keychain * brKeychains) + (brKarikaturi * karikatura)
                + (brLucks * randomLuck);
        if (countItems > 25){
            sum = sum - (sum * 0.35);
        }

        //hosting
        sum = sum - (sum * 0.10);


        if(sum >= partyPrice){
            sum = sum - partyPrice;
            System.out.printf("Yes! %.2f lv left.", sum);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", partyPrice - sum);
        }

    }
}
