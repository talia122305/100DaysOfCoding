public class Day54 {
    public static void main(String[] args) {
        System.out.println("=== Program Keyword 'continue' (Day54) ===");

        // Perulangan dari 1 sampai 10
        for (int i = 1; i <= 10; i++) {
            // Jika angka genap, lewati iterasi ini
            if (i % 2 == 0) {
                continue; // lanjut ke perulangan berikutnya
            }
            // Hanya angka ganjil yang akan ditampilkan
            System.out.println("Angka ganjil: " + i);
        }
        System.out.println("\nProgram selesai!");
    }
}
