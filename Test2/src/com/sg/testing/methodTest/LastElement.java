package com.sg.testing.methodTest;
class LastELements2{
    static char[] returnLastChar(char[] ch) {

        int halfLength = ch.length / 2;
        char[] lastChars = new char[ch.length - halfLength];
        for (int i = halfLength; i < ch.length; i++) {
            lastChars[i - halfLength] = ch[i];
        }
        return lastChars;
    }
}

public class LastElement {
    public static void main(String[] args) {
        char[] charct = new char[]{'X', 'Y', 'W', 'Q', 'U', 'D'};
        char[] lastChars =LastELements2.returnLastChar(charct);
        for (char c : lastChars) {
            System.out.print(c + " ");
        }
    }
}
