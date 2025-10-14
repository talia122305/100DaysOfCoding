import java.util.Scanner;

public class Day28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan dua angka dari pengguna
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        // Menggunakan operator perbandingan ==
        if (angka1 == angka2) {
            System.out.println("Kedua angka sama (==)");
        } else {
            System.out.println("Kedua angka tidak sama (!=)");
        }

        // Menampilkan hasil perbandingan secara langsung
        System.out.println("\nHasil perbandingan:");
        System.out.println("angka1 == angka2 → " + (angka1 == angka2));
        System.out.println("angka1 != angka2 → " + (angka1 != angka2));
    }
}
