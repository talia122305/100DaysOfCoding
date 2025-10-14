import java.util.Scanner;

public class Day30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta dua angka dari pengguna
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        // Menggunakan operator <=
        if (angka1 <= angka2) {
            System.out.println("Angka pertama KURANG DARI atau SAMA DENGAN angka kedua (<=)");
        } else {
            System.out.println("Angka pertama LEBIH BESAR dari angka kedua");
        }

        // Menggunakan operator >=
        if (angka1 >= angka2) {
            System.out.println("Angka pertama LEBIH BESAR atau SAMA DENGAN angka kedua (>=)");
        } else {
            System.out.println("Angka pertama LEBIH KECIL dari angka kedua");
        }

        // Menampilkan hasil perbandingan secara langsung
        System.out.println("\nHasil perbandingan logika:");
        System.out.println("angka1 <= angka2 → " + (angka1 <= angka2));
        System.out.println("angka1 >= angka2 → " + (angka1 >= angka2));
    }
}
