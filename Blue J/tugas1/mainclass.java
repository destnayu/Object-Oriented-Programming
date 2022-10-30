public class mainclass{
    public static void main(String args[]){
        System.out.println("Data Pegawai");
        data data1=new data();
        data1.nama="Dimas";
        data1.jk="Laki-laki";
        data1.hp="089399750921";
        data1.datapgw();
        
        data data2=new data();
        data2.alamat="Jl. Anggrek No. 12 Jakarta Barat";
        data2.pendidikan="SMK";
        data2.kursus="Pentar Teknik";
        data2.datapgw2();
        
        System.out.println();
        System.out.println("Absensi");
        absensi absensi1=new absensi();
        absensi1.nama="Dimas";
        absensi1.tgl="12-09-2020";
        absensi1.jamdtg="07.30";
        absensi1.absensi();
        
        absensi absensi2=new absensi();
        absensi2.jamplg="17.00";
        absensi2.gaji=3000000;
        absensi2.bonus=500000;
        absensi2.absensijm();
        
        System.out.println();
        System.out.println("Laporan");
        laporan laporan1=new laporan();
        laporan1.nama="Dimas";
        laporan1.hp="089399750921";
        laporan1.ket="Ganti Freon + Cuci AC";
        laporan1.laporan();
        
        laporan laporan2=new laporan();
        laporan2.namaplgn="Tio";
        laporan2.alamatplgn="Jl. Nanas No. 14 Jakarta Utara";
        laporan2.jmlservice=2;
        laporan2.biaya=400000;
        laporan2.laporan2();
    }
}