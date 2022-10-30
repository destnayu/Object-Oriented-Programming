class persegipanjang1{
    int panjang,lebar;
    persegipanjang1(int p, int l){
        panjang = p;
        lebar = l;
    }
    public int getLuas(){
        return panjang * lebar;
    }
    public int getKel(){
        return 2 * (panjang + lebar);
    }
    public void getJenis(){
        System.out.println("Persegi Panjang");
    }
}