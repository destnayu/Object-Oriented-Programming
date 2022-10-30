public class tugas2  {
    static int hitung(int x)
    {return x * 2;}
    static int hitung (int x, int y)
    {return 2 * x + y;}
    static void hitung (int x, int y, int z)
    {System.out.println(x+y+z);}
    static double hitung(double x, double y)
    {return(x + y)/2;}
    
public static void main(String[]args){
    int a=hitung(7);
    System.out.println(a);
    int b=hitung(4,7) + hitung(hitung(5,2));
    double c=hitung(3.5,5.5);
    hitung(3,4,5);
    hitung(a,b,(int) hitung(3.5,4));
    hitung(hitung(6),hitung(7,2),a);
    System.out.println(b);
    System.out.println(c);
}
}
