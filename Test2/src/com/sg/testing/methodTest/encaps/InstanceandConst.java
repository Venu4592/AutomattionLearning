package com.sg.testing.methodTest.encaps;
class InsConst{
    {
        System.out.println("This is Instance block ");
    }
    InsConst(String Name){
        System.out.println("Name: "+Name);
    }
}
public class InstanceandConst {
    public static void main(String[] args) {
        InsConst obj=new InsConst("Velankanni");
    }
}
