public class Day19 {
    public static void main(String[] args) {
        // Tipe data besar: int
        int nilaiInt = 130;

        // Konversi paksa (manual) ke tipe data kecil: byte
        byte nilaiByte = (byte) nilaiInt;

        // Tipe data besar: double
        double nilaiDouble = 123.456;

        // Konversi paksa ke tipe data kecil: int
        int nilaiIntDariDouble = (int) nilaiDouble;

        // Output hasil konversi
        System.out.println("=== Konversi Manual / Paksa ===");
        System.out.println("Nilai int: " + nilaiInt);
        System.out.println("Nilai byte (setelah konversi): " + nilaiByte);  // Akan overflow
        System.out.println("Nilai double: " + nilaiDouble);
        System.out.println("Nilai int (dari double): " + nilaiIntDariDouble); // Desimal hilang
    }
}
