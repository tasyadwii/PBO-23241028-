package com.tutorial;

public class Hero {
    // atribut
    String name;
    double defencePower;
    double attackPower;

    // construktor
    Hero (String name, double defencePower , double attacckPower ){
        this.name = name;
        this.defencePower = defencePower;
        this.attackPower = attacckPower;
    }

        //method
    void cetak(){
        System.out.println("/nName : " + this.name);
        System.out.println("Defence power : " + this.defencePower);
        System.out.println("Attack power : " + this.attackPower);
    
    }
}
