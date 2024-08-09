package com.sg.testing.methodTest;
class Birds{
    String[] birds(String[] birdsname){
        String[] arr=new String[birdsname.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=birdsname[i];
        }
        return arr;
    }
}
public class BirdsName {
    public static void main(String[] args) {
        Birds bo=new Birds();
        String [] s=bo.birds(new String[] {"Dove","Crow","Hen"});
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }

    }
}
