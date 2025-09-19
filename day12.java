import java.util.Scanner;

public class day12{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data dari user
        System.out.print("Masukkan nama lengkap: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();
        input.nextLine(); // membersihkan newline

        System.out.print("Masukkan alamat: ");
        String alamat = input.nextLine();

        System.out.print("Masukkan hobi: ");
        String hobi = input.nextLine();

        // Output data
        System.out.println("\n=== BIODATA DIRI ===");
        System.out.println("Nama   : " + nama);
        System.out.println("Umur   : " + umur);
        System.out.println("Alamat : " + alamat);
        System.out.println("Hobi   : " + hobi);

        input.close();
    }
}
