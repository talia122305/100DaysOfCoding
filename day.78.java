public class Day78MethodString {
    public static void main(String[] args) {

        String teks = "   Belajar Java   ";
        String kosong = "";

        System.out.println("Panjang      : " + teks.length());
        System.out.println("Uppercase    : " + teks.toUpperCase());
        System.out.println("Lowercase    : " + teks.toLowerCase());
        System.out.println("Substring    : " + teks.substring(3, 10));
        System.out.println("Replace      : " + teks.replace("Java", "Python"));
        System.out.println("Trim         : \"" + teks.trim() + "\"");
        System.out.println("Equals       : " + teks.trim().equals("Belajar"));
        System.out.println("IgnoreCase   : " + teks.trim().equalsIgnoreCase("belajar java"));
        System.out.println("Contains     : " + teks.contains("Java"));
        System.out.println("isEmpty      : " + kosong.isEmpty());
    }
}
