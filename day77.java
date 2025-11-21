public class Day77Method {
    public static void main(String[] args) {

        String teks = "   Belajar Java   ";

        System.out.println("Teks asli   : \"" + teks + "\"");

        // substring()
        System.out.println("substring   : " + teks.substring(3, 10));

        // replace()
        System.out.println("replace     : " + teks.replace("Java", "Python"));

        // trim()
        System.out.println("trim        : \"" + teks.trim() + "\"");
    }
}
