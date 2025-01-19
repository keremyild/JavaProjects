package org.example;

// BASIC ARITHMETICS  abstract
//a)       Write an abstract class that has 2 integer variables: a,b
//b)       a method named Add with no parameters
//c)       “Add” method returns an int value by adding 2 variables of the class : a+b

// 2- Create a class named “Calculations” which inherits from “Arithmetics” in Q1
//a)       Create a constructor that takes 2 integers to set parent class variables : a, b
//b)       Include a method returning an integer value by multiplying 2 integers defined in parent class : a*b
//c)       Alter “Add” method so that it will return a+b+5
//d)       Polymorph “Add” method to get a parameter : c and return a+b+c
//

public abstract class BasicArithmetics {
    int a;
    int b;

    public int Add ()
    {
        return a+b;
    }



}
