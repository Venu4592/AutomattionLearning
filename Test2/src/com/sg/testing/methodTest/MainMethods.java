package com.sg.testing.methodTest;
public class MainMethods {
    public static int stringToInt(String numStr) {
        int a=Integer.parseInt(numStr);
        return a;
    }

    public static void main(String[] args) {

        System.out.println(MainMethods.stringToInt("33")); // Output: 1
    }
}
