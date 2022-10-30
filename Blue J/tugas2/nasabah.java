import java.util.Scanner;
class nasabah extends tabungan{
    Scanner a=new Scanner(System.in);
    String nama, alamat, jns_tabungan;
    int no_hp;
    
    public void data(String nama, String alamat, int no_hp){
    System.out.println("------------------------------");
    System.out.print("Nama Nasabah: ");
    nama=a.nextLine();
    System.out.print("Alamat Nasabah: ");
    alamat=a.nextLine();
    System.out.print("No. HP: ");
    no_hp=a.nextInt();
    }
    public void info(int no_rek, String jns_tabungan){
    System.out.println("------------------------------");
    System.out.print("No. Rekening: ");
    no_rek=a.nextInt();
    System.out.print("Jenis Tabungan: ");
    jns_tabungan=a.nextLine();
    System.out.print("Jenis Tabungan: ");
    jns_tabungan=a.nextLine();
    }
    
}