class utama2{
    public static void main(String [] aa){
        persegipanjang1 pp1=new persegipanjang1 (5,10);
        balok1 b1=new balok1(5,10,5);
        System.out.println(pp1.getLuas());
        pp1.panjang=7;
        System.out.println(pp1.getLuas());
        System.out.println(pp1.getKel());
        System.out.println(b1.getVolume());
        pp1.getJenis();
    }
}