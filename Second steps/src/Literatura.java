import java.util.Scanner;

public class Literatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number_of_pages = Integer.parseInt(scan.nextLine());
        int pages_perHour = Integer.parseInt(scan.nextLine());
        int broqt_na_dnite = Integer.parseInt(scan.nextLine());
        int hours = 0;
        int hours_per_day = 0;

        hours = number_of_pages/pages_perHour;
        hours_per_day = hours / broqt_na_dnite;

         System.out.println("Общо време за четене на книгата:" + hours);
        System.out.println("Необходимите часове на ден:" + hours_per_day);

    }
}
