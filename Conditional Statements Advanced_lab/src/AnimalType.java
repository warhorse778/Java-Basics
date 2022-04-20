import java.util.Scanner;

public class AnimalType {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String animal = scan.nextLine();
        switch (animal) {
            case "dog":
                System.out.print("mammal");
                break;
            case "snake":
            case "crocodile":
            case "tortoise":
                System.out.print("reptile");
                break;
            default:
                System.out.print("unknown");
                break;
        }
    }
}
