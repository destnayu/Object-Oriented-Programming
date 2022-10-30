import java.util.Scanner;
public class menu {
    public void utama1(){
    Scanner a=new Scanner(System.in);
     
    }
    
 public static void utama(String[]na){
     Scanner a=new Scanner(System.in);
     tabungan t=new tabungan();
     nasabah n=new nasabah();
     int pilih;
    
     System.out.println("------------------------------");
     System.out.println("-----------BANK IU------------");
     System.out.println("------------------------------");
     System.out.println("1. Tabungan");
     System.out.println("2. Nasabah");
     System.out.println("0. Keluar");
     System.out.print("Pilih: ");
     pilih=a.nextInt();
     if (pilih==1){
         t.saldo();
         t.transaksi();}
     else if(pilih==2){
         }
     System.out.println("------------------------------");
    }
}