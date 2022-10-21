import java.util.Scanner;
public class quizPBO3
{
   public static String nokar, namkar, jenis;
   public static double tj, gapok, total;
   
    public void DataKaryawan(){
          Scanner scan = new Scanner(System.in);
          
       System.out.println("======================================");
       System.out.println("~~~~~ Gaji Karyawan Hotel Sultan ~~~~~");
       System.out.println("======================================");
       
       System.out.print("No Karyawan : ");
       nokar=scan.nextLine();
       System.out.print("Nama Karyawan : ");
       namkar=scan.nextLine();
       System.out.print("Gaji Pokok : ");
       gapok=scan.nextDouble();
       System.out.print("Jenis Pekerjaan : ");
       if((jenis=scan.nextLine()).equalsIgnoreCase("Waiters")){
           tj= 250000;
        }
        else if((jenis=scan.nextLine()).equalsIgnoreCase("Cleaning Service")){
           tj= 255000;
        }
        else if((jenis=scan.nextLine()).equalsIgnoreCase("Juru Masak")){   
           tj= 500000;
        }
        else if((jenis=scan.nextLine()).equalsIgnoreCase("Front Office")){
           tj= 350000;
        }  
        else{
            tj=100000;
        }
       total=gapok+tj;
    }
}
           