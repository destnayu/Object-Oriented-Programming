import java.util.*;
import java.io.*;
import java.util.Scanner;
public class menu{
    public static void main(String[]args) {
    pasien();}
    
    static void ulang() {
    Scanner input=new Scanner(System.in);
    System.out.print("Input Pasien [y/t]");
    String pil=input.nextLine();
        if(pil.equalsIgnoreCase("y")){
            {pasien();}}
        else if(pil.equalsIgnoreCase("t"))
        System.out.println("Trims");
        System.exit(0);}
    
    static void pasien() {
    BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
    Scanner masukan=new Scanner(System.in);
    Scanner pilih=new Scanner(System.in);
    String nama,jnspenyakit;
    int i, jnslayanan, biayaobat,totbiaya,
        umum=30000,
        spesialis=70000;
    System.out.print("Banyak Data : ");
        int input=Integer.parseInt(br.readLine());
        for (int i=1; i<=input; i++){
        System.out.println("Data ke-"+i);
    System.out.print("Nama Pasien : ");
    nama=br.readLine();
    System.out.print("Jenis Layanan [1. Umum | 2. Spesialis : ");
    jnslayanan=masukan.nextInt();
        if (jnslayanan==1)
            System.out.println("30000");
        else if (jnslayanan==2)
            System.out.println("70000");
    System.out.print("Jenis Penyakit : ");
    jnspenyakit=masukan.nextLine();
    System.out.print("Biaya Obat : ");
    biayaobat=masukan.nextInt();
    System.out.println();
        if (1 > 2)
            System.out.println("Total Biaya : "+(30000+biayaobat));
        else if (1 < 2)
            System.out.println("Total Biaya : "+(70000+biayaobat));
        
}
}
    static void menu() throws IOException{
    Scanner input=new Scanner(System.in);
    System.out.println("1. Input Data");
    System.out.println("2. Keluar");
    int pil=input.nextInt();
    if(pil==1){
        pasien();
        ulang();}
    else if(pil==2){
        System.out.println("Trims");
        System.out.println();
        System.exit(0);}
    else {
        System.out.println("Pilih lagi");
        ulang();}
}
}



    
    