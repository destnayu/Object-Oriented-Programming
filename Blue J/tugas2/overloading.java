public class overloading{
   public void jumlah(int a, int b){
       System.out.println("Jumlah a+b = "+(a+b));
    }
   public void jumlah(int c, double d){
       System.out.println("Jumlah c+d = "+(c+d));
    } 
   public void jumlah(int a, int b, int c){
       System.out.println("Jumlah a+b+c = "+(a+b+c));
    }
   public void jumlah(int a, String b){
       System.out.println("Nilai a= "+a);
       System.out.println("Nilai b= "+b);
    }
   public void jumlah(String b, int a){
       System.out.println("Nilai a= "+a);
       System.out.println("Nilai b= "+b);
    }
   public void jumlah(){
       System.out.println("Trims.");
    }
    
   public static void main(String[]args){
       overloading co=new overloading();
       co.jumlah(20,30);
       co.jumlah(20,30,40);
       co.jumlah(20,"30");
       co.jumlah("20",30);
       co.jumlah();
    }
}
