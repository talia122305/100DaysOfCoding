 import java.util.Scanner;

public class day43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM MENENTUKAN PREDIKAT NILAI ===");
        System.out.print("Masukkan nilai Anda: ");
        int nilai = input.nextInt();
        String predikat;

        if (nilai >= 85) {
            predikat = "A";
        } else if (nilai >= 70) {
            predikat = "B";
        } else if (nilai >= 55) {
            predikat = "C";
        } else {
            predikat = "D";
        }

        System.out.println("\n=== HASIL ===");
        System.out.println("Nilai Anda   : " + nilai);
        System.out.println("Predikat Anda: " + predikat);

       
    }
}


