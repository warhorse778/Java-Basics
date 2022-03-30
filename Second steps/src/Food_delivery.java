import java.util.Scanner;

public class Food_delivery {
    public static void main(String[] args) {
      double pileshko_menu = 10.35;
      double fish_menu = 12.40;
      double vegetarian = 8.15;
      double delivery = 2.50;
        Scanner scan = new Scanner(System.in);
        int broi_pil = Integer.parseInt(scan.nextLine());
        int broi_fish = Integer.parseInt(scan.nextLine());
        int broi_veg= Integer.parseInt(scan.nextLine());
        double cena;

        cena = (broi_pil*pileshko_menu)+(broi_fish*fish_menu)+(broi_veg*vegetarian);
        System.out.println(cena+(cena*20/100)+delivery);

    }
}
