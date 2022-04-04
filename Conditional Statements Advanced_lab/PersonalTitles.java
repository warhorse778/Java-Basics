import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double age = Double.parseDouble(scan.nextLine());
        String sex = scan.nextLine();

        if (age >= 16){
            if (sex.equals("m")){
                System.out.println("Mr.");
            }else if (sex.equals("f")){
                System.out.println("Ms.");
            }
        }else{
            if (sex.equals("m")){
                System.out.println("Master");
            }else if (sex.equals("f")){
                System.out.println("Miss");
            }
        }
    }
}
