class balok1 extends persegipanjang1{
    private int tinggi;
    public balok1 (int p, int l, int t){
        super(p,l);
        tinggi = t;
    }
    public int getTinggi(){
        return tinggi;
    }
    public int getVolume(){
        return(panjang * lebar)*tinggi;
    }
    void setTinggi(int t){
        tinggi = t;
    }
}