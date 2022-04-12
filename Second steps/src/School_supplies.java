import java.util.Scanner;

public class School_supplies {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       double paket_himikali = 5.80;
       double paket_markeri = 7.20;
       double preparat = 1.20;
       double suma = 0;
        double br_p_himikali=Integer.parseInt(scan.nextLine());
        double br_p_markeri=Integer.parseInt(scan.nextLine());
        double litri_preparat=Integer.parseInt(scan.nextLine());
        double procent_namalenie=Integer.parseInt(scan.nextLine());

       procent_namalenie = procent_namalenie/100;

suma= ((br_p_himikali*5.80)+(br_p_markeri*7.20)+(litri_preparat*1.20));
System.out.println(suma-(suma*procent_namalenie));

    }
}
