import java.util.Scanner;
public class pendaftaran {
    String nama,alamat,golda,jk,ttl,umur,tlp,waktu;
    int plh,tng, brt; 
    Scanner input = new Scanner(System.in);
public void identitas () {
      System.out.println("\tIDENTITAS PASIEN");
       System.out.println("\t==========================");
       System.out.println("\n\t*Isikan Identitas Pasien di bawah ini **\n");
       System.out.print("Nama             :");
       nama=input.next();
       System.out.print("Alamat           :");
       alamat=input.next();
       System.out.print("TTL              :");
       ttl=input.next();
       System.out.print("Umur             :");
       umur=input.next();
       System.out.print("Jenis Kelamin    :");
       jk=input.next();
       System.out.print("Golongan Darah   :");
       golda=input.next();
       System.out.print("Tinggi Badan     :");
       tng=input.nextInt();
       System.out.print("Berat Badan      :");
       brt=input.nextInt();
       System.out.print("No.Telepon       :");
       tlp=input.next();
       System.out.print("Waktu Kunjungan  :");
      waktu=input.next();
    } 
      public void tujuan () {
      System.out.println("\tTujuan Poli ");
       System.out.println("\t==========================");
       System.out.println("1. Poli Gigi | 2. Poli Umum |3. Poli Anak");
       System.out.println("Masukkan Pilihan Anda : ");
       plh= input.nextInt();
       switch  (plh) {
           case 1 : 
           System.out.println(nama+"Ingin ke Poli Gigi.Silahkan Tunggu di ruang tunggu poli gigi");
           break ;
           case 2 :
            System.out.println(nama+"Ingin ke Poli Umum.Silahkan Tunggu di ruang tunggu poli umum");
            break;
            case 3 :
            System.out.println(nama+"Ingin ke Poli Anak.Silahkan Tunggu di ruang tunggu poli anak");
            break ; 
        }
    }
}