package com.tutorial;

public class Herostrenght extends Hero{
    String nama = "Class herostrenght";

    //Overloading
    void cetak(){
        System.out.println("ini adalah :" + this.nama);
        this.dummyMethod();
        //super.dummyMethod();

    }
    
//Overloading Method Dummy
void dummyMethod(){
    System.out.println("ini adalah Method subclass");

  }
  
}