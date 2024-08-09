package com.sg.testing.methodTest;
class Div5{
    int divcount(int StartNum){
        int count=0;
        for(int i=StartNum;i>=30;i-- )
        {
            if(i%5==0){
                count++;
            }
        }
        return count;
    }
}
public class DivisibleBy5 {
    public static void main(String[] args) {
        Div5 ob=new Div5();
        System.out.println(ob.divcount(50));
    }
}
