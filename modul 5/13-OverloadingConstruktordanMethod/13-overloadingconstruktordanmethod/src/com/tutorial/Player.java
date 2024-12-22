package com.tutorial;

public class Player {
    // Atribut
    private String name;

    // Atribut Static 
    private static int jumlahpalyer;

    //Konstruktor opsi 1
    Player (String name){
        Player.jumlahpalyer++;
        this.name = name ;

    }
    
    // overloading konstruktor opsi 2
    Player(){
        Player.jumlahpalyer++;
        this.name = "player" + Player.jumlahpalyer++;

    }
    
    //cetak
    void cetak(){
        System.out.println("name :" + this.name );
    }

}
