import java.util.*;
public class latihankar{
    public static void main(String[]nayu){
    Scanner input=new Scanner(System.in);
    int jasa,tb,gaji;
    double komisi;
    System.out.println("Pendapatan Karyawan");
    System.out.println("Gaji                   :Rp3100000");
    System.out.print("Total Barang di Jual    :Rp");
    tb=input.nextInt();
    if(tb==2000000){
        gaji=3100000;
        jasa=100000;
        komisi=0.10;
        System.out.println("Jasa                :Rp"+jasa);
        System.out.println("Komisi              :Rp"+komisi*tb);
        System.out.println("Pendapatan Total    :Rp"+ (gaji+jasa+(komisi*tb)));
    }else if(tb>=2000000){
        gaji=3100000;
        jasa=200000;
        komisi=0.15;
        System.out.println("Jasa                :Rp"+jasa);
        System.out.println("Komisi              :Rp"+komisi*tb);
        System.out.println("Pendapatan Total    :Rp"+ (gaji+jasa+(komisi*tb)));
    }else if(tb>=5000000){
        gaji=3100000;
        jasa=300000;
        komisi=0.25;
        System.out.println("Jasa                :Rp"+jasa);
        System.out.println("Komisi              :Rp"+komisi*tb);
        System.out.println("Pendapatan Total    :Rp"+ (gaji+jasa+(komisi*tb)));
    }
}
}