package com.sg.testing.methodTest;

import org.w3c.dom.ls.LSOutput;

class AndOperator
{
    static int logicalAnd(int a,int b){
        int result = 0;
        if(a==0 && b==0){
           result=a*b;
        }else if(a==1 && b==0){
            result=a*b;
        }else if(a==0 && b==1){
            result=a*b;
        }
        else if(a==1&&b==1){
            result=a*b;
        }
        return result;
    }
}
public class LogicalAndOperator {
    public static void main(String[] args) {
        System.out.println(AndOperator.logicalAnd(0,0));
    }
}
