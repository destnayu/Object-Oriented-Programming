import java.util.Scanner;
class nilaimhs{
    Scanner input=new Scanner(System.in);
    int n;
    
    public void nilai(){
    System.out.print("Nilai     : ");
    n=input.nextInt();
    if(n>=71){
        System.out.println("Memenuhi Syarat Lulus");
        System.out.println("==========");
    }else if(n<=61){
         System.out.println("Tidak Memenuhi Syarat Lulus");
         System.out.println("==========");
    }
        
}
    }