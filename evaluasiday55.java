import java.util.Scanner;

public class Day55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Batas bawah : ");
        int bwh = sc.nextInt();
        System.out.println("Batas atas : ");
        int ats = sc.nextInt();
        System.out.println("Angka : ");
        int angka = sc.nextInt();

        if (angka > bwh && angka < ats) {
            System.out.println("DI DALAM BATAS");
        } else {
            System.out.println("DI LUAR BATAS");
        }
    }
}
