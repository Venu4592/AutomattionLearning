package com.sg.testing.methodTest.encaps;
class StaticBlocks{
    static{
        System.out.println("This is Satic Block 1");
    }
    static{
        System.out.println("This is Satic Block 2");
    }
    static{
        System.out.println("This is Satic Block 3");
    }
    static{
        System.out.println("This is Satic Block 4");
    }
}
public class ExecStaticBlock {
    public static void main(String[] args) {
        StaticBlocks o=new StaticBlocks();
    }
}
