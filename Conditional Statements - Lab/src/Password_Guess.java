import java.util.Scanner;

public class Password_Guess {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String password = scan.nextLine();
        String correctPass = "s3cr3t!P@ssw0rd";

        if (password.equals(correctPass)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }

    }
}
