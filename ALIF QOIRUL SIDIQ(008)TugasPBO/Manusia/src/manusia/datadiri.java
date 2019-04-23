package Manusia;
import java.util.Scanner;
public class datadiri extends Manusia {
    Scanner baca = new Scanner(System.in);
    String game;
    void game(){
        System.out.print("pendidikan\t: ");
        game = baca.next();
        System.out.print("hoby \t:  ");
        game = baca.next();   
         System.out.print("prestasi \t:  ");
        game = baca.next();   
        
        
}
    @Override
    
    void identitas(){
        System.out.print("Nama \t:   ");
        nama = manss.next();
       System.out.print("umur \t:   ");
        umur = manss.next();
        System.out.print("Jenis Kelamin \t:   ");
        jeniskelamin = manss.next();
    }
   
}
