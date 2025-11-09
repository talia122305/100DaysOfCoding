public class Day64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai M: ");
        int M = input.nextInt();

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        int hasil = 1;

        // perulangan untuk menghitung M pangkat N
        for (int i = 1; i <= N; i++) {
            hasil = hasil * M;
        }

        System.out.println(M + " pangkat " + N + " = " + hasil);

      
    }
}
