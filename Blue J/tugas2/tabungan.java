import java.util.Scanner; 
class tabungan{
    Scanner a=new Scanner(System.in);
    menu m=new menu();
    String bank,nama;
    public int pin, jml_tf, no_rek,pilih;
    public double nabung, penarikan, saldo;
    
    public void saldo(){
        System.out.print("No. Rekening: ");
        no_rek=a.nextInt();
        System.out.print("Sisa Saldo: Rp");
        saldo=a.nextInt();
    }
    public void transaksi(){
    System.out.println("Masukan PIN ");
    System.out.print("--->>>");
    pin=a.nextInt();
    System.out.println("------------------------------");
    System.out.println("Pilih Menu");
    System.out.println("1. Menabung");
    System.out.println("2. Transfer");
    System.out.println("3. Info Transaksi");
    System.out.println("0. Keluar");
    System.out.print("Pilih: ");
    pilih=a.nextInt();
    switch (pilih){
        case 1: 
        System.out.println("------------------------------");
        System.out.println("MENABUNG"); 
        System.out.println("------------------------------");
        System.out.println("Masukan Data");
        System.out.print("");
        System.out.print("");
        System.out.println("");
        System.out.print("Nama Nasabah: ");
        nama=a.nextLine();
        System.out.print("Nama Nasabah: ");
        nama=a.nextLine();
        System.out.print("No. Rekening: ");
        no_rek=a.nextInt();
        System.out.print("Jumlah yang ingin ditabung: Rp");
        nabung=a.nextDouble();
        System.out.println("------------------------------");
        System.out.println("Tekan Enter");
        m.utama1();
        //kembali=0;
        break;
        
        case 2:
        System.out.println("------------------------------");
        System.out.println("TRANSFER");
        System.out.println("------------------------------");
        System.out.print("No. Rekening Tujuan: ");
        no_rek=a.nextInt();
        System.out.print("Atas Nama: ");
        nama=a.nextLine();
        System.out.print("Jumlah Transfer: ");
        jml_tf=a.nextInt();
        for (int i=0; i<=1; i++){
            System.out.print("PIN: ");
            pin=a.nextInt();
        }
            if (pin==pin){
                System.out.println(">>>PIN OK<<<");
            }
            else{
                System.out.println(">>>PIN SALAH<<<");
            }
            if (jml_tf<=(saldo-50000)){
            System.out.println(">>>SALDO OK<<<");
            }
            else{
            System.out.println("SALDO TIDAK CUKUP");
            }
        if (no_rek==no_rek){
            System.out.println(">No. Rekening: "+no_rek);
            System.out.println(">Atas Nama: ");
            System.out.println(">Jumlah Transfer: Rp"+jml_tf);
            System.out.println(">Sisa Saldo : Rp"+(saldo-jml_tf));
            System.out.println(">>>BERHASIL<<<");
        }
        else{
            System.out.println("No. Rekening tidak terdaftar");
            System.out.println("------Transfer GAGAL------");
        }
        m.utama1();
        break;
        
        case 3:
        System.out.println("------------------------------");
        System.out.println("INFO TRANSAKSI");
        System.out.println("------------------------------");
        System.out.println("Transaksi Terakhir");
        System.out.println("Penarikan Uang: Rp"+penarikan);
        System.out.println("Transfer Uang: Rp"+jml_tf);
        saldo=nabung-penarikan-jml_tf;
        System.out.println("Saldo Akhir: Rp"+saldo);
        m.utama1();
        break;}
    
        
        System.out.println("*********TERIMA KASIH*********");
        System.out.print("[1] Keluar [2] Menu");
        int pilih=a.nextInt();
        if(pilih==1){
            System.exit(0);
        }else if(pilih==2){
            m.utama1();}
    
}
}
