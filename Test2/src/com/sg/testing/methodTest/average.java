package com.sg.testing.methodTest;
class Avg{
    int averageofNums(int a,int b,int c){
        int avg=(a+b+c)/3;
        return avg;
    }
}
public class average {
    public static void main(String[] args) {
        Avg obj=new Avg();
       int res= obj.averageofNums(10,20,30);
        System.out.println(res);
    }

}
