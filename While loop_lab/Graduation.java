import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        double avgrades = 0;
        int classes = 1;
        int badgrades = 0;
        boolean isExcluded = false;

        while (classes <= 12){
            if(badgrades == 2) {
                isExcluded = true;
                break;
            }

            double input = Double.parseDouble(sc.nextLine());

            if(input < 4){
                badgrades++;
                continue;
            }

            classes++;
            avgrades = avgrades + input;

        }

        if (isExcluded){
            System.out.printf("%s has been excluded at %d grade", name, classes);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", name, avgrades / 12);

        }

    }
}
