import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String text = sc.nextLine();
        int length = text.length();

        for (int i = 0; i < length;i+=1){
            char letter = text.charAt(i);
            System.out.println(letter);
        }
    }
}
