
import java.util.Scanner;

    public class day45 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("=== MENU MAKANAN & MINUMAN ===");
            System.out.println("1. Nasi Goreng");
            System.out.println("2. Mie Ayam");
            System.out.println("3. Ayam Geprek");
            System.out.println("4. Es Teh");
            System.out.println("5. Kopi Hitam");
            System.out.print("Pilih menu (1-5): ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Anda memilih: Nasi Goreng");
                    System.out.println("Harga: Rp15.000");
                    break;
                case 2:
                    System.out.println("Anda memilih: Mie Ayam");
                    System.out.println("Harga: Rp12.000");
                    break;
                case 3:
                    System.out.println("Anda memilih: Ayam Geprek");
                    System.out.println("Harga: Rp17.000");
                    break;
                case 4:
                    System.out.println("Anda memilih: Es Teh");
                    System.out.println("Harga: Rp5.000");
                    break;
                case 5:
                    System.out.println("Anda memilih: Kopi Hitam");
                    System.out.println("Harga: Rp8.000");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih antara 1 sampai 5.");
            }


        }
    }

