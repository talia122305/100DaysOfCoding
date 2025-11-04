
import java.util.Scanner;

    public class day58 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan nilai N: ");
            int N = input.nextInt();

            // Mencetak dari 1 sampai N
            System.out.println("\nAngka dari 1 sampai " + N + ":");
            for (int i = 1; i <= N; i++) {
                System.out.print(i + " ");
            }

            // Mencetak dari N sampai 1
            System.out.println("\n\nAngka dari " + N + " sampai 1:");
            for (int i = N; i >= 1; i--) {
                System.out.print(i + " ");
            }


        }
    }

