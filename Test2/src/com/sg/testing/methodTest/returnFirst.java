package com.sg.testing.methodTest;
class ReturnMyfirst{
   int MyFirst(){
        int[] arr1=new int[]{11,12,13,14};
        return arr1[0];
    }
}
public class returnFirst {
    public static void main(String[] args) {
        ReturnMyfirst obj=new ReturnMyfirst();
     /* int r= obj.MyFirst();*/
        System.out.println( obj.MyFirst());

    }
}
