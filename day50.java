
import java.util.Scanner;

    public class day50 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("=== Program Kalkulator Sederhana ===");
            System.out.print("Masukkan angka pertama: ");
            double angka1 = input.nextDouble();

            System.out.print("Masukkan angka kedua: ");
            double angka2 = input.nextDouble();

            System.out.println("\nPilih operasi:");
            System.out.println("1. Penjumlahan (+)");
            System.out.println("2. Pengurangan (-)");
            System.out.println("3. Perkalian (*)");
            System.out.println("4. Pembagian (/)");
            System.out.print("Masukkan pilihan (1-4): ");
            int pilihan = input.nextInt();

            double hasil;

            switch (pilihan) {
                case 1:
                    hasil = angka1 + angka2;
                    System.out.println("Hasil Penjumlahan = " + hasil);
                    break;
                case 2:
                    hasil = angka1 - angka2;
                    System.out.println("Hasil Pengurangan = " + hasil);
                    break;
                case 3:
                    hasil = angka1 * angka2;
                    System.out.println("Hasil Perkalian = " + hasil);
                    break;
                case 4:
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                        System.out.println("Hasil Pembagian = " + hasil);
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }


        }
    }
