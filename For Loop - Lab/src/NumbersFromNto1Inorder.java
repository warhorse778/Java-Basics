import java.util.Scanner;

public class NumbersFromNto1Inorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        for (int i = n;i >= 1;i-=1){
            System.out.println(i);
        }
    }
}
