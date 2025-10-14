
import java.util.Scanner;
    public class day35 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan nilai Anda: ");
            int nilai = input.nextInt();

            // Percabangan if
            if (nilai >= 60) {
                System.out.println("Selamat! Anda LULUS.");
            } else {
                System.out.println("Maaf, Anda BELUM LULUS.");
            }

        }
    }

