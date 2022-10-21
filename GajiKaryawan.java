public class GajiKaryawan
{
   public static void main(String[] args){
       quizPBO3 datakar = new quizPBO3();
       datakar.DataKaryawan();
       System.out.println();
       System.out.println("=====================================");
       System.out.println("~~~~~ Rekap Gaji Selama Sebulan ~~~~~");
       System.out.println("=====================================");
       System.out.println("Gaji Pokok  : "+datakar.gapok);
       System.out.println("Tunjangan   : "+datakar.tj);
       System.out.println("Gaji Bersih : "+datakar.total);
    }
}

