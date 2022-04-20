import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
        int br = 0;
        boolean isFound = false;
        
        for(int i = a;i <= b;i++){
           for(int j = a;j <= b;j++){
               br++;
               int sum = i + j;
            if (sum == c){

                isFound = true;
                System.out.printf("Combination N:%d (%d + %d = %d)", br, i, j, c);
                break;
            }
        }
           if (isFound){
               break;
           }
        }
        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d", br, c);
        }
    }
}
