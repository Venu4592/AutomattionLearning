package com.sg.testing.methodTest.classtest;
class Demo1{
    byte[] arrays(){
        byte[] a={12,13,14,15};
        return a;
    }
}
public class ByteArray {
    public static void main(String[] args) {
        Demo1 d1=new Demo1();
        for(byte i:d1.arrays()) {
            System.out.print(i+" ");
        }
    }
}
