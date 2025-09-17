public class Day10 {
    public static final double PI = 3.14;
    public static final int MAX_USER = 100;

    public static void main(String[] args) {
        double radius = 5;
        int currentUser = 85;

        double luas = PI * radius * radius;
        System.out.println("Luas lingkaran: " + luas);

        if (currentUser >= MAX_USER)
            System.out.println("User penuh!");
        else
            System.out.println("Sisa slot user: " + (MAX_USER - currentUser));
    }
}
