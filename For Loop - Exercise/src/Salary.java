import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tabsCount = Integer.parseInt(sc.nextLine());
        int salary = Integer.parseInt(sc.nextLine());


        for (int i = 0; i < tabsCount; i++){
            String site = sc.nextLine();
            if (site.equals("Facebook")){
                salary -= 150;
            } else if (site.equals("Instagram")){
                salary -= 100;
            } else if (site.equals("Reddit")){
                salary -= 50;
            }
            if (salary <= 0){
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary > 0) {
            System.out.printf("%d", salary);
        }

    }
}
