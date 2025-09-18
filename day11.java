import java.util.Scanner;

public class InputSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();

        System.out.println("Halo, " + nama + "!");
        
        input.close();
    }
}
