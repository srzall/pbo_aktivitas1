package week 3.input;

import java.util.Scanner;

public class input {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan teks atau angka: ");
        String a = scanner.nextLine();
        System.out.println("Input yang dimasukkan: " + a);
        scanner.close();
    }
}