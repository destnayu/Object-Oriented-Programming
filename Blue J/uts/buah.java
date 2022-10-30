import java.util.Scanner;
public class buah {
        public static void main(String[]args) {
            String nama, nama_buah;
            int telp,pilihan,pilih,jml,harga,total;
            Scanner input = new Scanner(System.in);
            
            jeruk jrk = new jeruk();
            mangga mgg = new mangga();
            
            System.out.println("============SELAMAT DATANG di TOKO BUAH HOTARU========");
            System.out.println("------------------------------------------------------");
            System.out.print("Masukkan Nama Pelanggan : ");
            nama=input.nextLine();
            System.out.print("Masukkan No Telp : ");
            telp=input.nextInt();
            System.out.println("Jenis buah yang ingin dibeli : \n1. Jeruk \n2. Mangga");
            System.out.print("Pilihan : ");
            pilihan=input.nextInt();
            if(pilihan==1){
            jrk.menu_jeruk();
            jrk.getTotal();
            }
            else if(pilihan==2){
            mgg.menu_mangga();
            mgg.getTotal();
            }
            
            System.out.println("------------------------------");
            System.out.println("Terima Kasih Telah Berbelanja "+nama+"\nJangan Lupa Datang Kembali");
            
           
      }
}