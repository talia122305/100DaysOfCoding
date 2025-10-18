import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM MENGHITUNG GAJI BERSIH ===");
        System.out.print("Masukkan gaji pokok   : ");
        double gajiPokok = input.nextDouble();
        System.out.print("Masukkan tunjangan    : ");
        double tunjangan = input.nextDouble();
        System.out.print("Masukkan potongan     : ");
        double potongan = input.nextDouble();
        double gajiBersih = gajiPokok + tunjangan - potongan;

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Gaji Pokok   : Rp " + gajiPokok);
        System.out.println("Tunjangan    : Rp " + tunjangan);
        System.out.println("Potongan     : Rp " + potongan);
        System.out.println("-----------------------------");
        System.out.println("Gaji Bersih  : Rp " + gajiBersih);

    }
}
