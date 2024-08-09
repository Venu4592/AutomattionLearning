package com.sg.testing.methodTest.encaps;
class StaticOver{
    static void display(String Str){
        System.out.println("name: "+Str);
    }
    static void display(int Age){
        System.out.println("Age: "+Age);
    }
}
public class OverloadStaticmeth {
    public static void main(String[] args) {
        StaticOver.display(20);
        StaticOver.display("Velankanni");
    }
}
