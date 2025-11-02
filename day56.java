
import java.util.Scanner;

    public class day56 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int angka;

            System.out.println("=== Program Perulangan do-while (Day56) ===");

            do {
                System.out.print("Masukkan angka (0 untuk berhenti): ");
                angka = input.nextInt();
                System.out.println("Kamu memasukkan angka: " + angka);
            } while (angka != 0); // perulangan berhenti jika angka = 0

            System.out.println("Program selesai. Terima kasih!");
        }
    }

