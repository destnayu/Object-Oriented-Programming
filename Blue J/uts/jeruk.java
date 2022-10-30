import java.util.Scanner;  
class jeruk{
    Scanner input = new Scanner(System.in);
    String nama_buah;
    int total,jml,pilih;
    int harga=0;
    int j1=5000,j2=10000, j3=50000;
    public  void menu_jeruk() {
            System.out.println("\tJenis Buah Jeruk");
            System.out.println("-------------------------");
            System.out.println("1. Jeruk Nipis \tRp. 5.000");
            System.out.println("2. Jeruk Manis \tRp. 10.000");
            System.out.println("3. Jeruk Bali \tRp. 50.000");
            System.out.println("9. Check Out");
    }
    public void getTotal() {
         for(int i=0; i<=1;){
        System.out.print("Pilihan Anda : ");
        pilih=input.nextInt();
        if(pilih==1){
            nama_buah=("Jeruk Nipis");
            System.out.print("Banyaknya buah yang dibeli : ");
            jml=input.nextInt();
            
            harga=harga+j1;
            total=harga*jml;
            System.out.println("Berhasil ditambahkan");
            }
        else if(pilih==2){
            nama_buah=("Jeruk Manis");
            System.out.print("Banyaknya buah yang dibeli : ");
            jml=input.nextInt();
            
            harga=harga+j2;
            total=harga*jml;
            System.out.println("Berhasil ditambahkan");
            }
        else if(pilih==3){
            nama_buah=("Jeruk Bali");
            System.out.println("Banyaknya buah yang dibeli : ");
            jml=input.nextInt();
            
            harga=harga+j3;
            total=harga*jml;
            System.out.print("Berhasil ditambahkan");
            }
        else{
            System.out.println("Mohon maaf anda salah memilih");
            }
            System.out.print("Pilihan Anda : ");
            i = input.nextInt();

        }
       
            System.out.println("--------------------");
            System.out.println("-----Struk Pembelian-----");
            System.out.println("\n\tYang Dibeli");
            System.out.println("Buah \t\tBanyaknya Buah");
            System.out.print(""+nama_buah);
            System.out.println("\t\t"+jml);
            
            
            System.out.println("\nTotal yang harus dibayar : Rp "+total);
    }
}