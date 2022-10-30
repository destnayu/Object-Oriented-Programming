import java.util.Scanner;
class daftar {
    public static void main (String [] xx ) {
        int plh;
        Scanner input = new Scanner (System.in);
       System.out.println("\t| Menu Utama Klinik [Mail] |");
       System.out.println("\t<<==========================");
       System.out.println();
       System.out.println("1. IDENTITAS PASIEN");
       System.out.println("2. INFO DOKTER ");
       System.out.println("3. Keluar ");
       System.out.println("\n Menu Pilihan Anda : ");
       plh = input.nextInt();
       switch (plh){
       case 1 : 
       pendaftaran data = new pendaftaran();
       data.identitas ();
       data.tujuan();
       break; 
       case 2 :
       info data2 = new info ();
       data2.dokter();
       break;
       case 3:
       System.exit(0);
    }
}
}