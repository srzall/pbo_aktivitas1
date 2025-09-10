import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean jalan = true;

        while (jalan) {
            System.out.print("\nMasukkan angka pertama: ");
            int a = input.nextInt();

            System.out.print("Masukkan angka kedua: ");
            int b = input.nextInt();

            System.out.println("\nPilih operasi:");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan (1-5): ");
            int choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Hasil Penjumlahan: " + (a + b));
            } else if (choice == 2) {
                System.out.println("Hasil Pengurangan: " + (a - b));
            } else if (choice == 3) {
                System.out.println("Hasil Perkalian: " + (a * b));
            } else if (choice == 4) {
                if (b == 0) {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                } else {
                    System.out.println("Hasil Pembagian: " + (a / b));
                }
            } else if (choice == 5) {
                System.out.println("Program selesai. Terima kasih!");
                jalan = false; // keluar dari loop
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }

        input.close();
    }
}
