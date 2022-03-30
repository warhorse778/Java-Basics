import java.util.Scanner;

public class Repaiting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nailon=1.50;
        double boq=14.50;
        double razreditel=5;

        double kol_nailon=Double.parseDouble(scan.nextLine());
        double kol_boq=Double.parseDouble(scan.nextLine());
        double kol_razreditel=Double.parseDouble(scan.nextLine());
        int hours=Integer.parseInt(scan.nextLine());

        double suma;
        double obshta_suma;
        double maistori;

        suma=((kol_nailon+2)*nailon)+((kol_boq+kol_boq*10/100)*boq)+(kol_razreditel*razreditel)+0.40;
        maistori=(suma*30/100)*hours;
        obshta_suma=suma+maistori;

        System.out.println(obshta_suma);;

    }
}
