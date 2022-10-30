import javax.swing.*;
class kerucut  {
    double radius;
    double selimut,tinggi;
    
    void jari2(){
        String teks1=JOptionPane.showInputDialog("Masukkan nilai jari-jari kerucut =");
        radius=Float.parseFloat(teks1);
    }
    void selimut(){
         String teks1=JOptionPane.showInputDialog("Masukkan nilai Selimut =");
        selimut=Float.parseFloat(teks1);
    }
    void tinggi () {
         String teks1=JOptionPane.showInputDialog("Masukkan nilai tinggi=");
        tinggi=Float.parseFloat(teks1);
    }
    double phi(){
        return 3.14;
    }
    double vol(){
        return (1*phi()*radius*radius*tinggi)/3;
    }
    double luas(){
        return (phi()*radius)+(radius*selimut);
    }
   void tampil(){
        System.out.println("nilai Volume :"+this.vol());
        System.out.println("nilai luas Permukaan :"+this.luas());
    }
}

