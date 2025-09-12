public class TipeDataNumerik {
    public static void main(String[] args) {

        // Deklarasi dan inisialisasi tipe data bilangan bulat
        byte angkaByte = 100;              // range: -128 s/d 127
        short angkaShort = 20000;          // range: -32,768 s/d 32,767
        int angkaInt = 1500000000;         // range: -2,147,483,648 s/d 2,147,483,647
        long angkaLong = 9000000000L;      // range: -9,223,372,036,854,775,808 s/d 9,223,372,036,854,775,807

        // Menampilkan hasilnya
        System.out.println("Nilai byte  : " + angkaByte);
        System.out.println("Nilai short : " + angkaShort);
        System.out.println("Nilai int   : " + angkaInt);
        System.out.println("Nilai long  : " + angkaLong);
    }
}
