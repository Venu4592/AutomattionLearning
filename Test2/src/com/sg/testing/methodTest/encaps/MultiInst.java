package com.sg.testing.methodTest.encaps;
class MultiInstbl
{
    {
        System.out.println("Instance block 1");
    }
    {
        System.out.println("Instance block 2");
    }
    {
        System.out.println("Instance block 3");
    }
}
public class MultiInst {
    public static void main(String[] args) {
    MultiInstbl obj=new MultiInstbl();
    }
}
