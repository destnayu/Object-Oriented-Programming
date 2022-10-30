import javax.swing.*;
class bola {
    double radius;
    
    void jari2(){
        String teks1=JOptionPane.showInputDialog("Masukkan nilai jari-jari bola =");
        radius=Float.parseFloat(teks1);
    }
    double phi(){
        return 3.14;
    }
    double vol (){
        return (4/3)*phi()*radius*radius*radius;
    }
    double luas (){
        return 4*phi()*radius*radius;
    }
     void tampil(){
       System.out.println("nilai volume :"+this.vol());
       System.out.println("nilai luas Permukaan :"+this.luas());
    }
}