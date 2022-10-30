import java.util.Scanner;
class mangga{
    Scanner input = new Scanner(System.in);
    String nama_buah;
    int total,jml,pilih;
    int harga=0;
    int m1=15000,m2=20000, m3=30000;
    public  void menu_mangga() {
            System.out.println("\tJenis Buah Mangga");
            System.out.println("-------------------------");
            System.out.println("1. Mangga Harum Manis \tRp. 15.000");
            System.out.println("2. Mangga Indramayu \tRp. 20.000");
            System.out.println("3. Mangga Simanalagi \tRp. 30.000");
            System.out.println("9. Check Out");
    }
    public void getTotal() {
        for(int i=0; i<=1;){
       System.out.print("Pilihan Anda : ");
        pilih=input.nextInt();
        if(pilih==1){
            nama_buah=("Mangga Harum Manis");
            System.out.print("Banyaknya buah yang dibeli : ");
            jml=input.nextInt();
            
            harga=harga+m1;
            total=harga*jml;
            System.out.println("Berhasil ditambahkan");
            }
            else if(pilih==2){
            nama_buah=("Mangga Indramayu");
            System.out.print("Banyaknya buah yang dibeli : ");
            jml=input.nextInt();
            
            harga=harga+m2;
            total=harga*jml;
            System.out.println("Berhasil ditambahkan");
            }
            else if(pilih==3){
            nama_buah=("Mangga Simanalagi");
            System.out.print("Banyaknya buah yang dibeli : ");
            jml=input.nextInt();
            
            harga=harga+m3;
            total=harga*jml;
            System.out.println("Berhasil ditambahkan");
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
            System.out.println("Buah \t\t\tBanyaknya Buah");
            System.out.print(""+nama_buah);
            System.out.println("\t\t"+jml);
            
            
            System.out.println("\nTotal yang harus dibayar : Rp "+total);
    }
}