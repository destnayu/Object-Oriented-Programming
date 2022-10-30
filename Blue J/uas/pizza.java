import java.util.*;

public class pizza extends resto {
    
    private int biaya, ht, hp, hu;
    private String nama, top, ping, uk;
    private String toping[] = {"Meat Lovers", "Super Supreme", "American Favourite"};
    private int htoping[] = {84000, 84000, 74000};
    private String pinggiran[] = {"Original Chrust", "Stuffed Chrust", "Sausage Chrust", "Cheezy Bites"};
    private int hpinggiran[] = {0, 22000, 22000, 32000};
    private String ukuran[] = {"Reguler 8 Slice", "Jumbo 10 Slice"};
    private int hukuran[] = {0, 40000};
    private int pz[] = {1, 2, 3};
    private int pp[] = {1, 2, 3, 4};
    private int pu[] = {1, 2};

    @Override
    public void toping() {
        
    }

    @Override
    public void ukuran() {
        
    }

    @Override
    public void pinggiran() {
        
    }

    @Override
    public void cetakData(String nama) {
        this.nama = nama;
        System.out.println("Nama Pemesan = "+this.nama);
    }

    @Override
    public void cetakTotal(int pz, int pp, int pu) {
        for(int i = 0; i < this.pz.length; i++){
            if(pz == this.pz[i]){
                top = toping[i];
                ht = htoping[i];
            }
        }
        for(int i = 0; i < this.pu.length; i++){
            if(pu == this.pu[i]){
                uk = ukuran[i];
                hu = hukuran[i];
            }
        }
        for(int i = 0; i < this.pp.length; i++){
            if(pp == this.pp[i]){
                ping = pinggiran[i];
                hp = hpinggiran[i];
            }
        }
        System.out.println("Pizza yang dipesan = "+top+" / "+ping+" / "+uk);
        biaya = ht + hp + hu;
        System.out.println("Total Biaya = Rp."+biaya);
    }
}