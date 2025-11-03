
    public class day57 {
        public static void main(String[] args) {
            // Nested Loop untuk membentuk segitiga bintang
            for (int i = 1; i <= 5; i++) { // perulangan baris (luar)
                for (int j = 1; j <= i; j++) { // perulangan kolom (dalam)
                    System.out.print("* ");
                }
                System.out.println(); // pindah ke baris baru
            }
        }
    }

