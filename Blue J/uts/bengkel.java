import java.util.Scanner; 

public class bengkel {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String kodeTransaksi, kodebarang, namabarang, jmlbarang, hargabarang, kodepelanggan, namapelanggan, nope, totalharga, def="Masukan "; 
        
        System.out.println("           Bengkel We Are One         ");
        System.out.println("======================================");
        System.out.println("Transaksi Penjualan");
        System.out.print("Kode Transaksi  : " );
        kodeTransaksi = input.nextLine(); 
        System.out.print("Kode Barang     : " );
        kodebarang = input.nextLine();
        System.out.print("Nama Barang     : " );
        namabarang = input.nextLine();
        System.out.print("Jumlah Barang   : " );
        jmlbarang = input.nextLine();
        System.out.print("Harga Barang    : " );
        hargabarang = input.nextLine();
        System.out.print("Kode Pelanggan  : " );
        kodepelanggan = input.nextLine();
        System.out.print("Nama Pelanggan  : " );
        namapelanggan = input.nextLine();
        System.out.print("Nomor Handphone : " );
        nope = input.nextLine();
        System.out.print("Total Harga     : " );
        totalharga = input.nextLine();

        System.out.println("");
        System.out.println("------------------------------------------");
        System.out.println("Kode Transaksi : " + kodeTransaksi);
        System.out.println("Kode Barang    : " + kodebarang);
        System.out.println("Nama Barang    : " + namabarang);
        System.out.println("Jumlah Barang  : " + jmlbarang);
        System.out.println("Harga Barang   : " + hargabarang);
        System.out.println("Kode Pelanggan : " + kodepelanggan);
        System.out.println("Nama Pelanggan : " + namapelanggan);
        System.out.println("Nomor HP       : " + nope);
        System.out.println("Total Harga    : " + totalharga);
    }
}