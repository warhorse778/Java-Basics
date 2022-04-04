import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        if (number != 0 && number <= 100 && number >= -100){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}
