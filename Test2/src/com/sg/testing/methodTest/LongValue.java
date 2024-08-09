package com.sg.testing.methodTest;
class ReturnLong{
    static long mylong(long val){
        long res=val;
        return res;
    }
}
public class LongValue {
    public static void main(String[] args) {
        System.out.println(ReturnLong.mylong(123976));
    }
}
