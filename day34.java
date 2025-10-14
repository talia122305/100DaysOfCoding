import java.util.Scanner;
public class day34 {
        public static void main(String[] args) {
            Scanner input =new Scanner(System.in);
            System.out.println("masuka nilai :");
            int N = input.nextInt();

            int A = 0;
            int B = 0;
            int C = 0;
            int D = 0;

            for (int i = 1; i <= N; i++) {
                if (i % 2 == 1) {
                    A += i; // tambah angka ganjil
                } else if (i % 2 == 0) {
                    B += i; // tambah angka genap
                }

                if (i % 4 == 0 && i % 6 == 0) { // diubah dari 3 dan 5
                    C += i;
                }

                if (i % 4 == 0 || i % 6 == 0) { // diubah dari 3 atau 5
                    D += i;
                }
            }

            System.out.println("\nA. total angka ganjil = " + A);
            System.out.println("B. total angka genap = " + B);
            System.out.println("C. total angka habis dibagi 4 dan 6 = " + C);
            System.out.println("D. total angka habis dibagi 4 atau 6 = " + D);

            // operator aritmatika — semua diubah
            int hasil1 = A + B;
            int hasil2 = C * D;
            int hasil3 = (A + C) / 2;
            int hasil4 = (B - D) * 3;
            int hasil5 = (C % B) + 7;

            System.out.println("\n1. A + B = " + hasil1);
            System.out.println("2. C * D = " + hasil2);
            System.out.println("3. (A + C) / 2 = " + hasil3);
            System.out.println("4. (B - D) * 3 = " + hasil4);
            System.out.println("5. (C % B) + 7 = " + hasil5);

            // kondisi if juga diubah
            if (hasil1 < 50) {
                System.out.println("\n💬 Nilai kecil banget!");
            } else if (hasil1 <= 100) {
                System.out.println("\n💬 Nilai sedang nih!");
            } else {
                System.out.println("\n💬 Nilai besar banget!");
            }
        }
    }
