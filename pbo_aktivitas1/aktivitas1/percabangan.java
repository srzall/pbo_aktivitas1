import java.util.Scanner;

class Percabangan {
  public static void main(String[] args) {
    int Nilai;

    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan Nilai: ");
    Nilai = input.nextInt();
    if (Nilai >= 85 && Nilai <= 100) {
      System.out.println("Grade A d");
    } else if (Nilai >= 70 && Nilai < 85) {
      System.out.println("Grade B");
    } else if (Nilai >= 60 && Nilai < 70) {
      System.out.println("Garde C");
    } else if (Nilai >= 50 && Nilai < 60) {
      System.out.println("Garde D");
    } else if (Nilai >= 0 && Nilai < 50) {
      System.out.println("Grade E");
    } else {
      System.out.println("Nilai Invalid");
    }
    
    if (Nilai >= 60) {
      System.out.println("Lulus");
    } else {
      System.out.println("Tidak Lulus");
    }
    
    input.close();  
    }
}