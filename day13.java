import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
       Scanner  sc =  new Scanner(System.in );
       String nama = "lestrai" ;
       final String nim = "D12345";
       String prongramstudiy = "informatika";
       String alamat = "majene";

       double tinggibadan = 149.7;
       float bb = 40.6f;
       byte usia = 21;
       long ukt = 50000 ;
       char golongandarah = 'z';
       boolean keaktifanmahasiawa = false;
       int jarakrumahkekampus = 13;
       short jumlahsks = 20;

       System.out.println("nama              :" + nama);
       System.out.println("nim               :" + nim);
       System.out.println("prongramstudiy    :" + prongramstudiy);
       System.out.println("alamat            :" + alamat);
       System.out.println("tinggibadan       :" + tinggibadan);
       System.out.println("bb                :" + bb);
       System.out.println("usia              :" + usia);
       System.out.println("ukt               :" + ukt);
       System.out.println("golongandarah     :" + golongandarah);
       System.out.println("keaktifanmahasiawa:" + keaktifanmahasiawa);
       System.out.println("jarakrumahkekampus:" + jarakrumahkekampus+ "KM");
       System.out.println("jumlahsks         :" + jumlahsks) ;



       System.out.print( " masukan nama    : ");
       nama = sc.nextLine();

       System.out.print(" masukan alamat: ");
       alamat= sc.nextLine();

       System.out.print(" tinggi badan:");
       tinggibadan = sc.nextDouble();

       System.out.print ("jarak:");
       jarakrumahkekampus = sc.nextInt();

       System.out.print ( "golongan arah:");
       golongandarah = sc.next().charAt(0) ;

       System.out.println("biodata setelah diupdate:"+
                       "\n nama               :"+ nama +
                       "\n nim                :"+ nim +
                       "\n prongram studiy    :"+ prongramstudiy +
                       "\n alamat             :"+ alamat +
                       "\n tinggi bada        :"+ tinggibadan +
                       "\n jarak              :"+ jarakrumahkekampus +
                       "\n golongan darah     :"+ golongandarah +
                       "\n jumlah sks         :"+ jumlahsks );


    }}
