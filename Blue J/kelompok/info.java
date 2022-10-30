import java.util.Scanner;
public class info {
    int poli,plh ;
    String kembali ;
    Scanner input= new Scanner (System.in);
    public void dokter () {
         System.out.println("==============================");
             System.out.println("\t*Pilih Dokter*");
             System.out.println("1. Dokter Umum");
             System.out.println("2. Dokter Gigi");
             System.out.println("3. Dokter Anak");
             System.out.print("Masukkan Info Dokter Pilihan Anda.. :"); 
             poli = input.nextInt();
           if (poli==1){
                  System.out.println("\n\tDaftar Dokter Umum");
                  System.out.println("\t------------------------\n");
                  System.out.println("1. dr. Arum Puspa Khinanthi");
                  System.out.println("   - Waktu Praktek    : Senin-Rabu, 08.00 - 17.00");
                  System.out.println("   - Telp             : 089685218566\n");
                  System.out.println("2. dr. Destiana Ayu Aulia");
                  System.out.println("   - Waktu Praktek    : Kamis-Sabtu, 08.00 - 17.00");
                  System.out.println("   - Telp             : 0890887894567\n");
                  System.out.println();
                }
                if (poli==2){
                  System.out.println("\n\tDaftar Dokter Gigi");
                  System.out.println("\t------------------------\n");
                  System.out.println("1. drg. Irma Wahyuni");
                  System.out.println("   - Waktu Praktek    : Senin-Rabu, 08.00 - 17.00");
                  System.out.println("   - Telp             : 081786578908\n");
                  System.out.println("2. dr. Nuriana Salamah");
                  System.out.println("   - Waktu Praktek    : Kamis-Sabtu, 08.00 - 17.00");
                  System.out.println("   - Telp             : 085897234546\n");
                  System.out.println();
                }
                if (poli==3){
                  System.out.println("\n\tDaftar Dokter Anak ");
                  System.out.println("\t------------------------\n");
                  System.out.println("1. dr. Dwi Wahyuningtyas Sp.An");
                  System.out.println("   - Waktu Praktek    : Selasa-Jum'at, 08.00 - 17.00");
                  System.out.println("   - Telp             : 089893567899\n");
                  System.out.println("1. dr. Melpi Dwi Lestari Sp.An");
                      System.out.println("   - Waktu Praktek    : Rabu-sabtu, 08.00 - 17.00");
                  System.out.println("   - Telp             : 089893683939\n");
                  System.out.println();
                }
                  
                
        }
        
    }