import java.util.Scanner;

public class Day72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan tinggi segitiga: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {

            // Spasi di depan
            for (int s = 0; s < n - i; s++) {
                System.out.print("  ");
            }

            // Bintang
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

     
    }
}
