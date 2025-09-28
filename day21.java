public class day21 {
    public static void main(String[] args) {
        int a = 12;
        int b = 30;

          System.out.println("Sebelum tukar, a bernilai " + a + ", dan b bernilai " + b);

        // Menukar nilai tanpa variabel sementara
         a = a + b;
         b = a - b;
          a = a - b;

        System.out.println("Setelah tukar, a bernilai " + a + ", dan b bernilai " + b);
    }
}
