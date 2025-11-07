import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM KELIPATAN M DARI 1 SAMPAI N ===");

        // Input batas atas (N) dan kelipatan (M)
        System.out.print("Masukkan nilai N (batas atas): ");
        int N = input.nextInt();

        System.out.print("Masukkan nilai M (kelipatan): ");
        int M = input.nextInt();

        System.out.println("\nBilangan kelipatan " + M + " dari 1 sampai " + N + " adalah:");

        // Perulangan untuk mencari kelipatan M
        for (int i = 1; i <= N; i++) {
            if (i % M == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n=== Selesai ===");
   
    }
}
