import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String city = sc.nextLine();
        double sells = Double.parseDouble(sc.nextLine());
        double commission = 0;
        boolean isInvalid = false;

        switch (city){
            case "Sofia":
                if (sells >= 0 && sells <= 500){
                    commission = sells* 0.05;
                }else if (sells >= 500 && sells <= 1000){
                    commission = sells * 0.07;
                }else if (sells >= 1000 && sells <= 10000){
                    commission = sells * 0.08;
                }else if (sells >= 10000){
                    commission = sells * 0.12;
                }else{
                    isInvalid = true;
                }break;
            case "Varna":
                if (sells >= 0 && sells <= 500){
                    commission = sells * 0.045;
                }else if (sells >= 500 && sells <= 1000){
                    commission = sells * 0.075;
                }else if (sells >= 1000 && sells <= 10000){
                    commission = sells * 0.10;
                }else if (sells >= 10000){
                    commission = sells * 0.13;
                }else{
                    isInvalid = true;
                }
                break;
            case "Plovdiv":
                if (sells >= 0 && sells <= 500){
                    commission = sells * 0.055;
                }else if (sells >= 500 && sells <= 1000){
                    commission = sells * 0.08;
                }else if (sells >= 1000 && sells <= 10000){
                    commission = sells * 0.12;
                }else if (sells >= 10000){
                    commission = sells * 0.145;
                }else{
                    isInvalid = true;
                }
                break;
            default:
                isInvalid = true;
                break;
        }
        if (isInvalid){
            System.out.println("error");
        }else {
            System.out.printf("%.2f", commission);
        }
    }
}
