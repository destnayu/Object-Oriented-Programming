import java.util.*;

public class utama {

    
    public static void main(String[] args) {
        String nama;
        int pz,pp,pu;
        pizza p = new pizza();
        Scanner a = new Scanner(System.in);
        
        System.out.println("---------------------------------------------------");
        System.out.println("                   PIZZA MOTARU                    ");
        System.out.println("            Terkenal Sejak Tahun 1988              ");
        System.out.println("---------------------------------------------------");
        
        System.out.println("Input Data Pemesanan");
        System.out.print("Masukan Nama Anda : ");
        nama = a.nextLine();
        
        System.out.println("");
        System.out.println("Daftar Toping / Rasa Pizza");
        System.out.println("1. Meat Lovers (Rp.84000)");
        System.out.println("2. Super Supreme (Rp.84000)");
        System.out.println("3. American Favourite (Rp.74000)");
        System.out.print("Toping Pilihan Anda = ");
        pz = a.nextInt();
        
        System.out.println("");
        System.out.println("Daftar Pinggiran Pizza");
        System.out.println("1. Original Chrust (+Rp.0)");
        System.out.println("2. Stuffed Chrust (+Rp.22000)");
        System.out.println("3. Sausage Chrust (+Rp.22000)");
        System.out.println("4. Cheezy Bites (+Rp.32000)");
        System.out.print("Pinggiran Pilihan Anda = ");
        pp = a.nextInt();
        
        System.out.println("");
        System.out.println("Daftar Ukuran Pizza");
        System.out.println("1. Reguler 8 Slices (+Rp.0)");
        System.out.println("2. Jumbo 10 Slices (+Rp.40000)");
        System.out.print("Ukuran Pilihan Anda = ");
        pu = a.nextInt();
        
        System.out.println("================== Data Pesanan ===================");
        p.cetakData(nama);
        p.cetakTotal(pz, pp, pu);
        System.out.println("===================================================");
    }
}