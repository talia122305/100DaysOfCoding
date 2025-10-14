import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input usia
        System.out.print("Masukkan usia kamu: ");
        int usia = scanner.nextInt();

        // Input status tiket
        System.out.print("Apakah kamu memiliki tiket? (true/false): ");
        boolean memilikiTiket = scanner.nextBoolean();

        // Logika nested if
        if (usia >= 21) {
            if (memilikiTiket) {
                System.out.println("Selamat, kamu diizinkan masuk ke acara.");
            } else {
                System.out.println("Kamu memerlukan tiket untuk dapat masuk.");
            }
        } else {
            System.out.println("Kamu harus berusia minimal 21 tahun untuk dapat masuk.");
        }
    }
}
