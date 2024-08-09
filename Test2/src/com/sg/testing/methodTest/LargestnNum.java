package com.sg.testing.methodTest;
class LargestNumbers{
    int largest(int num1,int num2){
        int large=num1+num2;
        if(num1>num2){
            large++;
        }
        return large;
    }
}
public class LargestnNum {
    public static void main(String[] args) {
        LargestNumbers obj=new LargestNumbers();
      int la=  obj.largest(100,200);
        System.out.println(la);
    }
}
