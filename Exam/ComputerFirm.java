import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nPcs = Integer.parseInt(sc.nextLine());
        double possSells = 0;
        double Sells = 0;
        double avgRating = 0;
        double allSells = 0;
        double rating = 0;

        for (int i = 0;i < nPcs; i++){
            double pc = Double.parseDouble(sc.nextLine());

            rating= pc % 10;
            possSells = Math.floor(pc / 10);
            if (rating == 2) {
                Sells = 0;
            } else if (rating == 3) {
                Sells = possSells * 0.50;
            } else if (rating == 4) {
                Sells = possSells * 0.70;
            } else if (rating == 5) {
                Sells = possSells * 0.85;
            } else if (rating == 6) {
                Sells = possSells;
            }

            allSells = allSells + Sells;
            avgRating = avgRating + rating;

        }
        System.out.printf("%.2f%n", allSells);
        System.out.printf("%.2f", avgRating / nPcs);
    }
}
