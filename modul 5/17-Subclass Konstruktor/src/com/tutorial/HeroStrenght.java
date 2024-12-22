package com.tutorial;


public class HeroStrenght extends Hero {
    String attribute = "Strength";
    
    //subclass konstruktor
    HeroStrenght(String name, double defence, double attack ){
        super(name, defence, attack);

    
    }
    // Overriding cetak
    void cetak(){
        System.out.println("Hero : " + this.attribute);
        super.cetak();

    
        
    }
}
