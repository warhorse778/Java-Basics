import java.util.Scanner;

public class ChristmasPreparation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double hartiq = 5.80;
        double plat = 7.20;
        double glue = 1.20;

        int brHartiq = Integer.parseInt(sc.nextLine());
        int brPlat = Integer.parseInt(sc.nextLine());
        double litersGlue = Double.parseDouble(sc.nextLine());
        double discount = Integer.parseInt(sc.nextLine());

        double sum = 0;

        sum = (brHartiq * hartiq) + (brPlat * plat) + (litersGlue * glue);

        System.out.printf("%.3f",sum= sum - (sum*(discount/100)));
    }
}
