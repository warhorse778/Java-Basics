import java.util.Scanner;

public class Time_Plus15Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int hour = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        minutes+=15;

        if (minutes > 59){
            hour++;
            minutes=minutes%60;
        }
        if (hour > 23){
            hour = 0;
        }
        if (minutes < 10){
            System.out.printf("%d:0%d", hour, minutes);
        }else {
            System.out.printf("%d:%d", hour , minutes);
        }


    }
}
