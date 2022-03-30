package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inch = 2.54;
        double b = Integer.parseInt(scanner.nextLine());
        double cmininch = inch * b;
        System.out.println(cmininch);
    }
}
