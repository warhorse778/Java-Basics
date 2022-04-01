import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int min_number = Integer.MAX_VALUE;
        while (!input.equals("Stop")){
            int n = Integer.parseInt(input);
            if (n < min_number){
                min_number = n;
            }
            input=sc.nextLine();
        }
        System.out.println(min_number);
    }
}
