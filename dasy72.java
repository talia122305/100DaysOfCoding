import java.util.Scanner;

public class Day72 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        int total = 0;

        while (true) {
            System.out.print("Masukkan angka (negatif untuk berhenti): ");
            int angka = input .nextInt();

            if (angka < 0) break;
            total += angka;
        }
        System.out.println("Total: " + total);
    }
}
