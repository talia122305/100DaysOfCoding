import java.util.Scanner;
public class Day30 {      
    public static void main(String[] args) {
        Scanner juni = new Scanner(System.in);  // membuat objek Scanner
        System.out.println("Masukkan bilangan : ");
        int bilangan = juni.nextInt();          // membaca input angka dari user

        // Mengecek apakah bilangan genap atau ganjil
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil");
        }
    }
}
