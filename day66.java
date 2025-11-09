import java.util.Scanner;

public class Day66 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata atau angka: ");
        String teks = input.nextLine();

        System.out.println("\nPola Vertikal:");
        for (int i = 0; i < teks.length(); i++) {
            System.out.println(teks.charAt(i)); // mencetak karakter satu per satu ke bawah
        }


    }
}
