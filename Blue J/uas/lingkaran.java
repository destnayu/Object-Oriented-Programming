import javax.swing.*;
class lingkaran  {
    double radius;
    void jari2(){
  String teks1=JOptionPane.showInputDialog("Masukkan nilai jari-jari lingkaran=");
        radius=Float.parseFloat(teks1);  
    }
    double phi(){
        return 3.14;
    }
    double kel (){
        return 2*phi()*radius;
    }
    double luas (){
        return phi()*radius*radius;
    }
     void tampil(){
       System.out.println("nilai Keliling:"+this.kel());
       System.out.println("nilai luas  :"+this.luas());
    }
}