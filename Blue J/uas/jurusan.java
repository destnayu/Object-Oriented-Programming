import java.util.*;
abstract class jurusan{
    nilaimhs n=new nilaimhs();
    private String matkul;
    
    public void infor(){
        System.out.println("Informatika");
        this.matkul="Pemrograman Berorientasi Objek";
        System.out.println("Mata Kuliah: "+this.matkul);
        n.nilai();
    }
    public void indus(){
        System.out.println("Industri");
        this.matkul="Pemodelan Sistem";
        System.out.println("Mata Kuliah: "+this.matkul);
        n.nilai();
    }
    public void arsi(){
        System.out.println("Arsitektur");
        this.matkul="Pranata Pembangunan";
        System.out.println("Mata Kuliah: "+this.matkul);
        n.nilai();
    }
}