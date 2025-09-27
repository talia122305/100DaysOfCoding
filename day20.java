public class Day20 {
    public static void main(String[] args) {
        // Deklarasi tipe data primitif
        int angkaInt = 42;
        double angkaDouble = 3.14;
        boolean nilaiBoolean = true;
        char karakter = 'A';

        // Konversi ke String
        String strInt = Integer.toString(angkaInt);
        String strDouble = Double.toString(angkaDouble);
        String strBoolean = Boolean.toString(nilaiBoolean);
        String strChar = Character.toString(karakter);

        // Menampilkan hasil konversi
        System.out.println("Integer ke String: " + strInt);
        System.out.println("Double ke String: " + strDouble);
        System.out.println("Boolean ke String: " + strBoolean);
        System.out.println("Char ke String: " + strChar);
    }
}
