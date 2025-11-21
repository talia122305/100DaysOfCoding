public class Day76Method {
    public static void main(String[] args) {

        String teks1 = "Belajar Java";
        String teks2 = "belajar java";
        String kosong = "";

        System.out.println("=== Pengecekan String ===");

        // 1. equals() → membandingkan teks (harus sama persis)
        System.out.println("equals()          : " + teks1.equals(teks2));

        // 2. equalsIgnoreCase() → membandingkan teks tanpa memperhatikan huruf besar kecil
        System.out.println("equalsIgnoreCase(): " + teks1.equalsIgnoreCase(teks2));

        // 3. contains() → mengecek apakah teks mengandung kata tertentu
        System.out.println("contains(\"Java\") : " + teks1.contains("Java"));

        // 4. isEmpty() → mengecek apakah string kosong
        System.out.println("isEmpty() pada variabel 'kosong': " + kosong.isEmpty());
    }
}
