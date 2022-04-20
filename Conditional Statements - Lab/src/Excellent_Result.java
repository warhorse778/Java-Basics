import java.util.Scanner;

public class Excellent_Result {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int ocenka = Integer.parseInt(scan.nextLine());
        if (ocenka >= 5) {
            System.out.println("Excellent!");
        }
    }
}
