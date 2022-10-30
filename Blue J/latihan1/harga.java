class harga{
    int register, inap, konsumsi, total;
    
    void administrasi(){
        
        total=register+inap+konsumsi;
        System.out.println("Total Biaya yang di Bayar Pasien \t Rp"+total);
    }
}