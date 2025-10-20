package Day44;

import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Switch Case Sederhana ===");
        System.out.println("1. Senin");
        System.out.println("2. Selasa");
        System.out.println("3. Rabu");
        System.out.println("4. Kamis");
        System.out.println("5. Jumat");
        System.out.println("6. Sabtu");
        System.out.println("7. Minggu");
        System.out.print("Masukkan angka (1-7): ");
        int hari = input.nextInt();

        switch (hari) {
            case 1:
                System.out.println("Hari ini adalah Senin");
                break;
            case 2:
                System.out.println("Hari ini adalah Selasa");
                break;
            case 3:
                System.out.println("Hari ini adalah Rabu");
                break;
            case 4:
                System.out.println("Hari ini adalah Kamis");
                break;
            case 5:
                System.out.println("Hari ini adalah Jumat");
                break;
            case 6:
                System.out.println("Hari ini adalah Sabtu");
                break;
            case 7:
                System.out.println("Hari ini adalah Minggu");
                break;
            default:
                System.out.println("Angka yang Anda masukkan tidak valid!");
        }

       
    }
}
