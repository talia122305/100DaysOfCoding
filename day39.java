import java.util.Scanner;
public class Day39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Sate Ayam");
        System.out.print("Pilih makanan (1-3): ");

        int pilih = input.nextInt();

        System.out.print("Menu yang dipilih: ");
        if (pilih == 1) {
            System.out.println("Nasi Goreng 🍛");
        }
        else if (pilih == 2) {
            System.out.println("Mie Ayam 🍜");
        }
        else if (pilih == 3) {
            System.out.println("Sate Ayam 🍢");
        }
        else {
            System.out.println("Pilihan tidak valid!");
        }
    }
}
