import javax.swing.*;
class overloading{
    String nama_pasien, nama_dokter, alamat, poli, jam_praktek, nama_obat, jenis_obat;
    int no_hp, jumlah_obat;
    
    public void pasien(){
        
        System.out.print("Nama  : "+this.nama_pasien);
        System.out.print("Alamat : "+this.alamat);
        System.out.print("No. HP : "+this.no_hp);
    }
    public void dokter(){
        
        System.out.println("Nama  : "+this.nama_dokter);
        System.out.println("Poli : "+this.poli);
        System.out.println("Jam Praktek : "+this.jam_praktek);
    }
    public void obat(){
        
        System.out.println("Nama Obat  : "+this.nama_obat);
        System.out.println("Jenis Obat : "+this.jenis_obat);
        System.out.println("Jumlah Obat : "+this.jumlah_obat);
    }
    public class overloading{
        public static void main(String[]args){
        overloading over=new overloading();
        over.pasien();
        over.dokter();
        over.obat();
        System.exit(0);
    }
}

}