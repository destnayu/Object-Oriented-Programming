class delta extends charlie{
    private int c=9;
    public void info(){
        System.out.println("Dipanggil pada= "+this.getClass().getName());
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("c= "+c);
    }
    public static void main(String[]n){
        charlie c =new charlie();
        c.info();
        delta d=new delta();
        d.info();
    }
}