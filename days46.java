import java.util.Scanner;

public class latihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" masukan nilai s:");

        int s = sc.nextInt();
        System.out.println(" masukan  nilai  :");
        int l = sc.nextInt();

        int selesai = (s + l) % 24;
        int bangun = 9 - selesai;
        System.out.println(" keluar :" + bangun + "jam ");

    }

}


