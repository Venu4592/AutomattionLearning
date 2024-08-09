package com.sg.testing.methodTest.encaps;
class College{
    void collegeName(String Name){
        System.out.println("College Name: "+Name);
    }
    void collegeLocation(String location){
        System.out.println("College Location: "+location);
    }
}
class School{
    School(String SchoolName){
        College cl=new College();
        cl.collegeName("PSV");
        cl.collegeLocation("Bengaluru");
        System.out.println("School Name: "+SchoolName);
    }
}
public class Student {
    public static void main(String[] args) {
        School sl=new School("Velankanni");

    }
}
