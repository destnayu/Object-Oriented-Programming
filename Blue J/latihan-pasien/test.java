import java.util.*;
public class test{
    public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    String jurusan;
    int nilai;
    System.out.print("Jurusan : ");
    jurusan=input.nextLine();
    System.out.print("Nilai : ");
    nilai=input.nextInt();
    if (jurusan.equalsIgnoreCase("IPA")){
        if (nilai>=83){
            System.out.println("Anda Lulus");
        }else if(nilai<=82){
            System.out.println("Tidak Lulus");
        }
    }else if(jurusan.equalsIgnoreCase("Bahasa")){
        if (nilai>=75){
            System.out.println("Dapat Beasiswa");
        }else if(nilai<=74){
            System.out.println("Tidak Dapat Beasiswa");
        }
    }
}
}