package com.sg.testing.methodTest;
class Subjects{
    static String[] MyFavorite(String[] s1){
        return s1;
    }
}
public class FavoriteSubjects {
    public static void main(String[] args) {
        String S[]=new String[]{"Tamil","Computer Science","Sql"};
        String[] St=Subjects.MyFavorite(S);
        for(String sub:St){
            System.out.println(sub);
        }

    }
}
