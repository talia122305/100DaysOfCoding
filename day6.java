import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input dan hitung luas lingkaran
        System.out.print("Jari-jari lingkaran: ");
        float r = in.nextFloat();
        double luasLingkaran = 3.14 * r * r;
        System.out.println("Luas lingkaran: " + luasLingkaran);

        // Input dan hitung luas segitiga
        System.out.print("Alas segitiga: ");
        float alas = in.nextFloat();
        System.out.print("Tinggi segitiga: ");
        float tinggi = in.nextFloat();
        double luasSegitiga = 0.5 * alas * tinggi;
        System.out.println("Luas segitiga: " + luasSegitiga);

        in.close();
    }
}
