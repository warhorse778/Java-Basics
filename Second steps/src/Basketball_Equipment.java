import java.util.Scanner;

public class Basketball_Equipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double taksa = Double.parseDouble(scan.nextLine());
        double kecove =(taksa-(taksa*0.40));
        double ekip = (kecove-(kecove*0.20));
        double topka = (ekip/4);
        double aksesoari = topka/5;



        double razhodi;

        razhodi = taksa+kecove+ekip+topka+aksesoari;
        System.out.println(razhodi);


    }
}
