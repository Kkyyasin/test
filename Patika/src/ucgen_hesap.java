import java.util.Scanner;

public class ucgen_hesap {
    /*KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
     */
    public static void main(String[] args){
        Double a,b,hipo;
        Scanner scn=new Scanner(System.in);
        System.out.print("Ucgen 1-kenarı giriniz:");
        a= scn.nextDouble();
        System.out.print("Ucgen ikinci kenarı giriniziz");
        b=scn.nextDouble();
        hipo=Math.sqrt(a*a+b*b);
        System.out.println("Hipatonus: "+hipo);
        System.out.println("çevre: "+(a+b+hipo));
        System.out.println("Alan: "+a*b/2.0);

    }
}
