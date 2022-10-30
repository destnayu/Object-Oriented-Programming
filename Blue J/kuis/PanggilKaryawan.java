import java.util.Scanner;
class  PanggilKaryawan{
    public static void data_karyawan(String[]args) {
        
    Scanner input=new Scanner (System.in);
    IdentitasKaryawan y=new IdentitasKaryawan();
    System.out.print("No Karyawan       : ");
    y.no_karyawan=input.nextInt();
    System.out.print("Nama Karyawan     : ");
    y.nama_karyawan=input.nextLine();
    System.out.print("Golongan Karyawan :");
    y.golongan=input.nextLine();
    
    if (y.golongan.equalsIgnoreCase("A")){
        System.out.println("Tunjangan Golongan A Rp 500000");
        y.tunjangan_golongan=input.nextInt();
    }else if (y.golongan.equalsIgnoreCase("B")){
        System.out.println("Tunjangan Golongan B Rp 250000");
        y.tunjangan_golongan=input.nextInt();
    }else {
        System.out.println("Tunjangan Golongan Lainnya Rp 100000");
        y.tunjangan_golongan=input.nextInt();
    }
    System.out.print("Gaji Karyawan \t ");
    y.gaji_pokok=input.nextInt();
    
        
    y.total_gaji_karyawan();
}
}