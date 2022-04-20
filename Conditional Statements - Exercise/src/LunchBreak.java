import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String tvSeriesName = scan.nextLine();
        int tvSeriesTime = Integer.parseInt(scan.nextLine());
        int breakInMinutes = Integer.parseInt(scan.nextLine());

        double lunchTime = breakInMinutes / 8.0;
        double relaxTime = breakInMinutes / 4.0;

        double breakTimeLeft = breakInMinutes - (lunchTime + relaxTime);
        double diff = Math.abs(breakTimeLeft - tvSeriesTime);

        if ( breakTimeLeft >= tvSeriesTime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", tvSeriesName, Math.ceil(diff));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", tvSeriesName, Math.ceil(diff));
        }
    }
}
