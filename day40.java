import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== KALKULATOR SEDERHANA ===");
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        System.out.println("\nPilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = input.nextInt();

        double hasil = 0;

        if (pilihan == 1) {
            hasil = angka1 + angka2;
            System.out.println("Hasil penjumlahan = " + hasil);
        } 
        else if (pilihan == 2) {
            hasil = angka1 - angka2;
            System.out.println("Hasil pengurangan = " + hasil);
        } 
        else if (pilihan == 3) {
            hasil = angka1 * angka2;
            System.out.println("Hasil perkalian = " + hasil);
        } 
        else if (pilihan == 4) {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
                System.out.println("Hasil pembagian = " + hasil);
            } else {
                System.out.println("Tidak bisa dibagi dengan nol!");
            }
        } 
        else {
            System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }
}
