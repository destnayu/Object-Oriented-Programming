import javax.swing.* ;
class segitigapbo {
private float a,t,L ;
public void inputData (){
String teks1 =JOptionPane.showInputDialog ("Masukan Alas:");
a = Float.parseFloat (teks1);
String teks2 =JOptionPane.showInputDialog ("Masukan Tinggi:"); 
t = Float.parseFloat (teks2); 
}
double luassegitiga () {
return L= (a*t/2); }
public void panggilData () {
System.out.println ("Alas   ="+this.a);
System.out.println ("Tinggi ="+this.t);
System.out.println ("Luas   ="+this.L); 
}
}