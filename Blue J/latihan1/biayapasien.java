import java.util.Scanner;
class  biayapasien{
    public static void main(String[]xx) {
    
    Scanner test=new Scanner (System.in);
    harga a=new harga();
    System.out.print("Masukan Biaya Awal Masuk \t \t Rp");
    a.register=test.nextInt();
    System.out.print("Masukan Biaya Lama Inap \t \t Rp");
    a.inap=test.nextInt();
    System.out.print("Masukan Biaya Makanan Selama Inap \t Rp");
    a.konsumsi=test.nextInt();
    a.administrasi();
}
}