package com.sg.testing.methodTest.encaps;
class Vari{
    String FirstName;
    String LastName;
    static int age;
    static double Salary;
    Vari(String FirstName,  String LastName){
        this.FirstName=FirstName;
        this.LastName=LastName;
        System.out.println("FirstName:"+FirstName);
        System.out.println("LastName: "+LastName);
        System.out.println("Age: "+(Vari.age=23));
        System.out.println("Salary: "+(Vari.Salary=34567.908));
    }
}
public class Variables {
    public static void main(String[] args) {
        Vari v=new Vari("Velankanni","Rajan");
    }
}
