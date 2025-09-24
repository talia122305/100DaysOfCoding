import java.util.Scanner;

public class day17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input bilangan pertama
            System.out.print("Masukkan bilangan pertama: ");
            int angka1 = input.nextInt();

        // Input bilangan kedua
            System.out.print("Masukkan bilangan kedua: ");
            int angka2 = input.nextInt();

        // Hitung sisa bagi (modulus)
            int sisa = angka1 % angka2;

        // Tampilkan hasil
            System.out.println("Sisa dari " + angka1 + " dibagi " + angka2 + " adalah " + sisa);


    }
}
