import java.util.Scanner;
public class datamhs{
public static void datamhs(String[]n){
    Scanner input=new Scanner(System.in);
    nilaimhs nilai=new nilaimhs();
    jurusan j=new jurusan();
    
    String nama;
    int npm,pilih; 
    
    System.out.print("Nama Mhs  : ");
    nama=input.nextLine();
    System.out.print("NPM       : ");
    npm=input.nextInt();
    System.out.println("==========");
    System.out.println("Pilih Jurusan : \n1. Informatika \n2. Industri \n3. Arsitektur");
    pilih=input.nextInt();
    for(int i=0;i<=1;){
    System.out.println("==========");
    if (pilih==1){
        jrs.infor();
    }else if(pilih==2){
        jrs.indus();
    }else if(pilih==3){
        jrs.arsi();
    }else{
        System.out.println("Salah Input");
    }System.out.println("Pilih Jurusan : \n1. Informatika \n2. Industri \n3. Arsitektur");
    i=input.nextInt();}
}
}