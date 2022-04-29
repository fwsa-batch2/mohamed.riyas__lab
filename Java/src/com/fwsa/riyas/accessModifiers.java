package com.fwsa.riyas;

import com.fwsa.*;
class rough {
    public int myNum = 10;
    private String name = "Dhoni";
    protected char letter = 'D';
    int age = 20;
}

public class accessModifiers extends rough {
    public static void main(String[] args) {
        rough myobj = new rough();
        System.out.println(myobj.letter);
        System.out.println(myobj.myNum);
        System.out.println(myobj.age);
    }
}

class riyas extends encapsulation {
    public static void main(String[] args) {
        rough myobj = new rough();
        riyas obj2=new riyas();
        System.out.println(myobj.myNum);
        System.out.println(myobj.letter);
        System.out.println(myobj.age);
        System.out.println(obj2.a);
    }
}