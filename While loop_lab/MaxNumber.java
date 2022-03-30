import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int maxN = 0;

        while(!input.equals("Stop")){
            int n = Integer.parseInt(input);

            if (n > maxN){
                maxN = n;
            }
            input = sc.nextLine();
        }
        System.out.println(maxN);
    }
}
