import java.util.Scanner;

public class biayaparkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean jalan = true;

        while (jalan) {
            System.out.print("\nMasukkan jumlah hari masuk kampus: ");
            int hari = input.nextInt();

            int total = 0;

            for (int i = 1; i <= hari; i++) {
                System.out.println("\nHari ke-" + i + " (motor/mobil):");
                System.out.println("1. Motor");
                System.out.println("2. Mobil");
                System.out.print("Pilih kendaraan: ");
                int jenis = input.nextInt();

                int tarif = 0;
                String kendaraan = "";

                if (jenis == 1) {
                    kendaraan = "Motor";
                    tarif = 2000;
                } else if (jenis == 2) {
                    kendaraan = "Mobil";
                    tarif = 5000;
                } else {
                    System.out.println("Jenis kendaraan tidak valid!");
                    i--; // ulangi input hari ini
                    continue;
                }

                System.out.println("Hari ke-" + i + " motor/mobil : " + kendaraan);
                total += tarif;
            }

            System.out.println("\nTotal Biaya Parkir: Rp" + total);

            System.out.print("\nApakah Anda ingin menghitung lagi? (y/n): ");
            char lagi = input.next().charAt(0);
            if (lagi != 'y' && lagi != 'Y') {
                jalan = false;
            }
        }

        input.close();
    }
}
