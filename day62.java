import java.util.Scanner;

public class Day62 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        int jumlah = 0;

        // Proses penjumlahan 1 sampai N
        for (int i = 1; i <= N; i++) {
            jumlah += i;
        }

        System.out.println("Hasil penjumlahan dari 1 sampai " + N + " adalah: " + jumlah);

       
    }
}
