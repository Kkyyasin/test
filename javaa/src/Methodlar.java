public class Methodlar {

    public static  void testmethod(){
        int a=4,b=5;
        System.out.println(a+b);

    }
    public static void main(String[] args){

        testmethod();
        System.out.println(topla(5,4));
        ekranayaz("Merhaba");
        ekranayaz("Merhaba","Yasin Bey");
    }
    public static int topla(int a,int b){
        return a+b;
    }
    public static void ekranayaz(String a){//aynı isimde fonksiyon tanımlanabilir girişleri farklı olmalı
        System.out.println(a);
    }
    public static void ekranayaz(String a,String b){
        System.out.println(a+" "+b);
    }
}
