package com.sg.testing.methodTest.encaps;
class InsAndStatic{
    void display(){
        System.out.println("This is the instance method");
    }
    static void myShow(){
        System.out.println("This is the Static Myshow method");
    }
    static{
        InsAndStatic.myShow();
        InsAndStatic objst=new InsAndStatic();
        objst.display();
    }
}
public class OnInstMethAndStaticMeth {
    public static void main(String[] args) {
        InsAndStatic obj=new InsAndStatic();
          }
}
