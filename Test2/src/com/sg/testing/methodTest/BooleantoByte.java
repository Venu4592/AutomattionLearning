package com.sg.testing.methodTest;
class BtoByte{
    byte[] ArrayElements(boolean[] a){
        byte res[]=new byte[a.length];
        for(int i=0;i<res.length;i++){
          res[i]=(byte) (a[i]?1:0);
            /*if(a[i]){
                res[i]=1;
            }else{
                res[i]=0;
            }*/
        }
        return res;
    }
}
public class BooleantoByte {
    public static void main(String[] args) {
        BtoByte obj=new BtoByte();
        byte[] result= obj.ArrayElements(new boolean[]{true,false,false,true});
        for(int kk:result){
            System.out.println(kk);
        }
    }
}
