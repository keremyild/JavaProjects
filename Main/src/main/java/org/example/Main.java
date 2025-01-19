package org.example;


// BASIC ARITHMETICS  abstract
//a)       Write an abstract class that has 2 integer variables: a,b
//b)       a method named Add with no parameters
//c)       “Add” method returns an int value by adding 2 variables of the class : a+b
//
public class Main {
    public static void main(String[] args) {
        Calculations cal = new Calculations(5,7);

        cal.Add();
        cal.MultiplyMethod();
        cal.Add(9);

        System.out.println(cal.Add());
        System.out.println(cal.MultiplyMethod());
        System.out.println(cal.Add(9));

    }

}