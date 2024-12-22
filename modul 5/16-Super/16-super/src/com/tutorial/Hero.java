package com.tutorial;

public class Hero {
    //Atribut
    String nama = "class hero";

    //methode
    void cetak(){
        System.out.println("ini adalah :" + this.nama);
        this.dummyMethod();
    }

    //Method
    void dummyMethod(){
        System.out.println("ini adalah Method superclass");
    }
    
}
