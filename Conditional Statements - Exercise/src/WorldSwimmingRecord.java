import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double Record = Double.parseDouble(scan.nextLine());
        double meters = Double.parseDouble(scan.nextLine());
        double seconds = Double.parseDouble(scan.nextLine());

        seconds= seconds*meters;
        seconds = (seconds + (Math.floor(meters/15)*12.5));


        if( seconds < Record){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", seconds);
        }else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(Record - seconds));
        }
    }
}
