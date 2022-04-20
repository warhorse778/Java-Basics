import java.util.Scanner;

public class Bonus_Score {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start_score = 0;
        int number = Integer.parseInt(scan.nextLine());
        double bonus_score = 0;

        if (number <= 100) {
            bonus_score = 5;
        }else if (number > 100 && number < 1000) {
            bonus_score = number * 0.2;
        }else if (number > 1000){
            bonus_score = number * 0.1;
        }

        if (number % 2 == 0) {
            bonus_score++;
        }else if (number % 5 == 0) {
            bonus_score+=2;
        }
        System.out.println(bonus_score);
        System.out.println(number + bonus_score);
    }
}
