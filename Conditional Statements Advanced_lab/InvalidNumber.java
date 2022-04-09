import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        if (num <= 200 && num >= 100 || num == 0){
            System.out.println();
        }else{
            System.out.println("invalid");
        }
    }

}
