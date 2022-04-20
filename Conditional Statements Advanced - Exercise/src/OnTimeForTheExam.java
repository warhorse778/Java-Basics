import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int examHour = Integer.parseInt(sc.nextLine());
        int examMinutes = Integer.parseInt(sc.nextLine());
        int arrivedHour = Integer.parseInt(sc.nextLine());
        int arrivedMinutes = Integer.parseInt(sc.nextLine());

        int examTimeInMinutes = examHour * 60 + examMinutes;
        int arrivedTimeInMinutes = arrivedHour * 60 + arrivedMinutes;

        int diff = Math.abs(examTimeInMinutes - arrivedTimeInMinutes);


        if(examTimeInMinutes < arrivedTimeInMinutes){
            System.out.println("Late");
            if(diff >= 60){
                int hour = diff / 60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours after the start", hour, minutes);
            }else {
                System.out.printf("%d minutes after the start",  diff);
            }


        }else if(examTimeInMinutes == arrivedTimeInMinutes || diff <= 30){
           System.out.println("On time");
           if (diff >= 1 && diff <= 30){
               System.out.printf("%d minutes before the start",  diff);
           }


        }else{
            System.out.println("Early");
            if(diff >= 60){
                int hour = diff / 60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours before the start", hour, minutes);
            }else {
                System.out.printf("%d minutes before the start", diff);
            }
            }
    }
}