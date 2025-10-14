public class day26 {
    public static void main(String[] args) {
        // Operator penugasan

        int angka = 10;
        angka += 2;
        System.out.println("nilai angka : " + angka); // hasilnya 12
        angka -= 2;
        System.out.println("nilai angka : " + angka); // hasilnya 10
        angka *= 2;
        System.out.println("nilai angka : " + angka); // hasilnya 20
        angka /= 2;
        System.out.println("nilai angka : " + angka); // hasilnya 10
        angka %= 2;
        System.out.println("nilai angka : " + angka); // hasilnya 0
    }
}
