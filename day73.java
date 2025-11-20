import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Desi Natalia");
            System.out.println("2. Semester");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            pilih = in.nextInt();

            if (pilih == 1) {
                System.out.println("Halo Desi Natalia");
            } else if (pilih == 2) {
                System.out.println("Kamu sekarang semester 3");
            }
            System.out.println();
        } while (pilih != 3);

        System.out.println("Selesai.");
    }
}
