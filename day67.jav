import java.util.Scanner;

public class Day67 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata atau angka: ");
        String teks = input.nextLine();

        System.out.println("\nPola Horizontal:");
        for (int i = 0; i < teks.length(); i++) {
            System.out.print(teks.charAt(i) + " "); // mencetak karakter sejajar
        }

       
    }
}
