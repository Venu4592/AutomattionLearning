package com.sg.testing.methodTest;
class ReturnChar{
    static String concat1Darr(){
        char [] chars={'w','x','y','z'};
        String res="";
        for(char k:chars){
            res+=k+", ";
        }
        return res;
    }
}
public class Concat1DChararray {
    public static void main(String[] args) {
        System.out.println( ReturnChar.concat1Darr());
    }
}
