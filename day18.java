public class day18 {
      public static void main(String[] args) {
         byte nilaiByte = 10;
         short nilaiShort = nilaiByte; // byte ke short (otomatis)
         int nilaiInt = nilaiShort;    // short ke int (otomatis)
         long nilaiLong = nilaiInt;    // int ke long (otomatis)
         float nilaiFloat = nilaiLong; // long ke float (otomatis)
         double nilaiDouble = nilaiFloat; // float ke double (otomatis)

           System.out.println("Byte   : " + nilaiByte);
         System.out.println("Short  : " + nilaiShort);
         System.out.println("Int    : " + nilaiInt);
        System.out.println("Long   : " + nilaiLong);
        System.out.println("Float  : " + nilaiFloat);
        System.out.println("Double : " + nilaiDouble);
    }
}
