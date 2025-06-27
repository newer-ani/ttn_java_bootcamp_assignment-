package com.functionalinterfaces;

public class Q1 {
    public static void main(String[] args) {

        NumberCompare nb = (a, b)-> a>b;
        System.out.println("10>6 is "+ nb.isGreater(10,6));

        Increment in = (a)->a+1;
        System.out.println("number : "+in.incrementByOne(10));

        Concatination con = (s1,s2)->s1+s2;
        System.out.println("strings after concatination is: "+con.concat("hard","work"));

        ConvertToUpperCase upper = (s)->s.toUpperCase();
        System.out.println("connverted to uppercase : " +upper.toUpperCase("rahul"));
    }
}
