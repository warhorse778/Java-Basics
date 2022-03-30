import java.util.Scanner;

public class Calculator_deposits {
    public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
 double deposit = Integer.parseInt(scan.nextLine());
 double srok = Integer.parseInt(scan.nextLine());
 double lihven_procent = Double.parseDouble(scan.nextLine());
 double suma = 0;
 suma = deposit + srok * ((deposit * (lihven_procent/100)/12));
 System.out.println(suma);

    }
}
