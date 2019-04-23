package Manusia;

public class namateam extends Manusia {

    String game;

    void game() {
        System.out.print("jenis game \t: ");
        game = manss.next();
        System.out.print("game favorit \t:  ");
        game = manss.next();
        
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