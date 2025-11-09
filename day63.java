import java.util.Scanner;

public class day63 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        long hasil = 1; // gunakan long agar hasil tidak overflow

        for (int i = 1; i <= N; i++) {
            hasil *= i; // hasil = hasil * i
        }

        System.out.println("Hasil perkalian dari 1 sampai " + N + " adalah: " + hasil);

       
    }
}
