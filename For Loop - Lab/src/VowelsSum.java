import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        int sum = 0;

        for(int i = 0; i < word.length(); i++){
            char letter = word.charAt(i);
            if (letter == 'a'){
             sum += 1;
            }else if(letter == 'e'){
                sum += 2;
            }else if(letter == 'i'){
                sum += 3;
            }else if(letter == 'o'){
                sum += 4;
            }else if(letter == 'u'){
                sum += 5;
            }
        }
        System.out.println(sum);
    }
}
