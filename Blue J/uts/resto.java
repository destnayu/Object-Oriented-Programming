import java.util.*; 

abstract class resto {
    String toping,ukuran,nama,pinggiran;
    int biaya, pz, pp, pu;
    public abstract void toping();      
    public abstract void ukuran();
    public abstract void pinggiran();
    public abstract void cetakData(String nama);
    public abstract void cetakTotal(int pz, int pp, int pu); 
}