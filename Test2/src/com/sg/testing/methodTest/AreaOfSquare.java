package com.sg.testing.methodTest;
class AreaSquare{
    static int SquareArea(int side){
        int areaSq=side*side;
        return areaSq;
    }
}
public class AreaOfSquare {
    public static void main(String[] args) {
        System.out.println("Area of the square: "+AreaSquare.SquareArea(5));
    }
}
