import java.util.Scanner;
class lain{
 Scanner a=new Scanner(System.in);
 public int pilih, no, nominal;
 public String tipe, no_hp;
 
 public void pulsa(int pilih){
    System.out.println("Lainnya");
    System.out.println("1. Listrik");
    System.out.println("2. Pembayaran E-Commerce");
    pilih=a.nextInt();
    switch(pilih){
        case 1: 
        System.out.print("No. Pelanggan: ");
        no=a.nextInt();
        System.out.print("Nominal: :");
        nominal=a.nextInt();
        System.out.println("Pengisian Listrik dengan No. Pelanggan "+no+" Sejumlah "+nominal+" Berhasil");
        //transaksi(nominal);
        break;
        case 2:
        System.out.print("Kode Bayar: ");
        no=a.nextInt();
        System.out.print("Total Bayar: ");
        nominal=a.nextInt();
        System.out.println("Pembayaran dengan Kode "+no+" Berhasil");
       
    }
 public void transaksi(int no) {
    
    }
    }  
}
