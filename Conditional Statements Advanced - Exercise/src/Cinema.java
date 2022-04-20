import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String projection = sc.nextLine();
        int rows = Integer.parseInt(sc.nextLine());
        int columns = Integer.parseInt(sc.nextLine());
        double price = 0;
        switch(projection){
            case "Premiere":
                price = rows * columns * 12;
                break;
            case "Normal":
                price = rows * columns * 7.50;
                break;
            case "Discount":
                price = rows * columns * 5;
                break;
            default:
                break;
        }
        System.out.printf("%.2f leva", price);
    }
}
