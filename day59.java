
import java.util.Scanner;

    public class day59 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Meminta input batas angka
            System.out.print("Masukkan nilai N: ");
            int N = input.nextInt();

            System.out.println("\nAngka Ganjil dari 1 sampai " + N + ":");
            for (int i = 1; i <= N; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }

            System.out.println("\n\nAngka Genap dari 1 sampai " + N + ":");
            for (int i = 1; i <= N; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }


        }
    }

