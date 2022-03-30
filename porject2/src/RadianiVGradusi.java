import java.util.Scanner;
public class RadianiVGradusi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double angle = Double.parseDouble(scan.nextLine());
        double gradus = angle * 180 / Math.PI;
        System.out.println(gradus);

    }
}
