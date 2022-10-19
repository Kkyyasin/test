import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class diziler {
    public static void main(String[] args){
        int[] a=new int[3];
        for (int i=0;i<3;i++){
            a[i]=i;
        }
        for (int i:a){
            System.out.println(i);
        }
        //Lists
        ArrayList<String> mystring=new ArrayList<String >();
        mystring.add("merhaba");
        mystring.add("sad");
        System.out.println(mystring.get(0));
        for (int z=0;z<mystring.size();z++)
            System.out.println(mystring.get(z));
        //set
        HashSet<String > myset=new HashSet<>();
        myset.add("ass");
        myset.add("ass");
        myset.add("kdk");//sadece bir eleman bulundurur
        //Hasmap python daki sozluk yapısına benziyor
        HashMap<String,Integer> myhasmap=new HashMap<>();
        myhasmap.put("Ahmet",44);
        myhasmap.put("kks",75);
        myhasmap.put("jsj",4);
        System.out.println(myhasmap.get("Ahmet"));


    }
}
