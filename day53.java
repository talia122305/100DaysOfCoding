
    public class day53 {
        public static void main(String[] args) {
            System.out.println("=== Contoh Program Keyword break ===");

            for (int i= 1; i<= 10; i++) {
                if (i== 5) {
                    System.out.println("Perulangan dihentikan pada i = " + i);
                    break; // menghentikan perulangan saat i = 5
                }
                System.out.println("Nilai i = " + i);
            }

            System.out.println("Program selesai dijalankan.");
        }
    }
