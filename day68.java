[20.23, 7/11/2025] Desi Natalia: https://github.com/talia122305/100DaysOfCoding/blob/main/day61.java
[20.23, 7/11/2025] Desi Natalia: import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM KELIPATAN M DARI 1 SAMPAI N ===");

        // Input batas atas (N) dan kelipatan (M)
        System.out.print("Masukkan nilai N (batas atas): ");
        int N = input.nextInt();

        System.out.print("Masukkan nilai M (kelipatan): ");
        int M = input.nextInt();

        System.out.println("\nBilangan kelipatan " + M + " dari 1 sampai " + N + " adalah:");

        // Perulangan untuk mencari kelipatan M
        for (int i = 1; i <= N; i++) {
            if (i % M == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n=== Selesai ===");
   
    }
}
[19.18, 8/11/2025] Desi Natalia: https://github.com/talia122305/100DaysOfCoding/blob/main/day62.java
[19.18, 8/11/2025] Desi Natalia: import java.util.Scanner;

public class Day62 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        int jumlah = 0;

        // Proses penjumlahan 1 sampai N
        for (int i = 1; i <= N; i++) {
            jumlah += i;
        }

        System.out.println("Hasil penjumlahan dari 1 sampai " + N + " adalah: " + jumlah);

       
    }
}
[00.31, 9/11/2025] Desi Natalia: P
[01.20, 9/11/2025] Desi Natalia: P
[09.10, 9/11/2025] Desi Natalia: P
[18.38, 9/11/2025] Desi Natalia: P
[18.38, 9/11/2025] Desi Natalia: P
[21.01, 9/11/2025] Desi Natalia: P
[21.17, 9/11/2025] Desi Natalia: import java.util.Scanner;

public class day63 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        long hasil = 1; // gunakan long agar hasil tidak overflow

        for (int i = 1; i <= N; i++) {
            hasil *= i; // hasil = hasil * i
        }

        System.out.println("Hasil perkalian dari 1 sampai " + N + " adalah: " + hasil);

        input.close();
    }
}
[21.30, 9/11/2025] Desi Natalia: https://github.com/talia122305/100DaysOfCoding/blob/main/day63.java
[21.38, 9/11/2025] Desi Natalia: import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai M: ");
        int M = input.nextInt();

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        int hasil = 1;

        // perulangan untuk menghitung M pangkat N
        for (int i = 1; i <= N; i++) {
            hasil = hasil * M;
        }

        System.out.println(M + " pangkat " + N + " = " + hasil);

        input.close();
    }
}
[21.42, 9/11/2025] Desi Natalia: import java.util.Scanner;

public class Day65 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int n = input.nextInt();

        int faktorial = 1;

        // Perulangan untuk menghitung faktorial
        for (int i = 1; i <= n; i++) {
            faktorial = faktorial * i;
        }

        System.out.println("Faktorial dari " + n + " adalah: " + faktorial);

        input.close();
    }
}
[21.44, 9/11/2025] Desi Natalia: E
[21.44, 9/11/2025] Desi Natalia: import java.util.Scanner;

public class Day66 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata atau angka: ");
        String teks = input.nextLine();

        System.out.println("\nPola Vertikal:");
        for (int i = 0; i < teks.length(); i++) {
            System.out.println(teks.charAt(i)); // mencetak karakter satu per satu ke bawah
        }

        input.close();
    }
}
[21.46, 9/11/2025] Desi Natalia: import java.util.Scanner;

public class Day67 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata atau angka: ");
        String teks = input.nextLine();

        System.out.println("\nPola Horizontal:");
        for (int i = 0; i < teks.length(); i++) {
            System.out.print(teks.charAt(i) + " "); // mencetak karakter
[21.46, 9/11/2025] Desi Natalia: import java.util.Scanner;

public class Day67 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata atau angka: ");
        String teks = input.nextLine();

        System.out.println("\nPola Horizontal:");
        for (int i = 0; i < teks.length(); i++) {
            System.out.print(teks.charAt(i) + " "); // mencetak karakter sejajar
        }

        input.close();
    }
}
[21.48, 9/11/2025] Desi Natalia: import java.util.Scanner;

public class Day68 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan ukuran persegi: ");
        int n = input.nextInt();

        System.out.println("\nPola Persegi:");
        // perulangan baris
        for (int i = 1; i <= n; i++) {
            // perulangan kolom
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println(); // pindah ke baris baru
        }

       
    }
}
