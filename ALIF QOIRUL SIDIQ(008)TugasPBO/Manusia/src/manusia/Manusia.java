package Manusia;
import java.util.Scanner;
public class Manusia {
    Scanner manss = new Scanner(System.in);
    String nama, umur,jeniskelamin;
    void identitas(){
        System.out.print("Nama \t:   ");
        nama = manss.next();
       System.out.print("umur \t:   ");
        umur = manss.next();
        System.out.print("Jenis Kelamin \t:   ");
        jeniskelamin = manss.next();
    }
   
}
