public class panggil{
    public static void main(String []n){
        ekspresi eks=new ekspresi();
        senang sen=new senang();
        bete bt=new bete();
        sedih sed=new sedih();
        
        String panggil=" ";
        
        panggil=eks.respon();
        System.out.println("Coba "+panggil);
        panggil=sen.respon();
        System.out.println("Ekspresi: "+panggil);
        panggil=bt.respon();
        System.out.println("Ekspresi: "+panggil);
        panggil=sed.respon();
        System.out.println("Ekspresi: "+panggil);
    }
}
        