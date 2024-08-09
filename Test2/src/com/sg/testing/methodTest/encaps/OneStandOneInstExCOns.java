package com.sg.testing.methodTest.encaps;
class executeinConst{
    void Mydisplay(String s){
        System.out.println("This is my Name:"+s);
    }
    static void ShowAge(int Age){
        System.out.println("This is my Age: "+Age);
    }
    executeinConst(){
        Mydisplay("Velankanni");
        executeinConst.ShowAge(23);
    }
}
public class OneStandOneInstExCOns {
    public static void main(String[] args) {
        executeinConst obj = new executeinConst();

    }
}
