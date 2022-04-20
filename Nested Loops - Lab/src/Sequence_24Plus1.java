import java.util.Scanner;

public class Sequence_24Plus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int currentN = 1;
        while (currentN <= n){
            System.out.println(currentN);
            currentN = currentN * 2 + 1;
        }
    }
}
