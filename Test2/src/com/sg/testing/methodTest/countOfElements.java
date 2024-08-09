package com.sg.testing.methodTest;
class CountofElements2{
    int countEle(short[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            count++;
        }
        return count;
    }
}
public class countOfElements {
    public static void main(String[] args) {
        CountofElements2 obj=new CountofElements2();
      int count=  obj.countEle(new short[]{12,14,56,26,34,89});
        System.out.println(count);
    }
}
