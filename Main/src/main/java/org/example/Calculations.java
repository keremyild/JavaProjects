package org.example;
// 2- Create a class named “Calculations” which inherits from “Arithmetics” in Q1
//a)       Create a constructor that takes 2 integers to set parent class variables : a, b
//b)       Include a method returning an integer value by multiplying 2 integers defined in parent class : a*b
//c)       Alter “Add” method so that it will return a+b+5
//d)       Polymorph “Add” method to get a parameter : c and return a+b+c
//

public class Calculations extends BasicArithmetics {

    public Calculations(int a, int b) {
        this.a = a;
        this.b = b;


    }

    public int MultiplyMethod(){
        return a * b;
    }


    public int Add(){
        return a + b + 5;

    }

    public int Add(int c){
        return a + b + c;

    }



}
