package test.day04;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1_ArraylerinOrtakElemaniBulma {
    /*
     * iki array arasinda ayni olan elemanlari bir liste ekleyen program yazin
     * (buyuk kucuk harf onemsiz)
     *
     * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
     *
     * Output : [sofia,brad,emily]
     */
    public static void main(String[] args) {
        String [] array1={"John","Brad","Ange","Sofia","Emily"};

        System.out.println("array'in referansı: "+array1);//array'in referansı: [Ljava.lang.String;@6bf256fa
        System.out.println("array1= "+ Arrays.toString(array1));//array1= [John, Brad, Ange, Sofia, Emily]

        String [] array2=new String[5];
        array2[0]="sofia";
        array2[1]="brad";
        array2[2]="grace";
        array2[3]="emily";
        array2[4]="hazel";
        System.out.println(Arrays.toString(array2));//[sofia, brad, grace, emily, hazel]
        ortakElemanlar(array1,array2);

    }

    private static void ortakElemanlar(String[] str1,String[]str2) {
        ArrayList<String> ortaklar=new ArrayList<>();
        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                if (str1[i].equalsIgnoreCase(str2[j])){
                    ortaklar.add(str1[i]);
                }
            }

        }
        System.out.println(ortaklar);//[Brad, Sofia, Emily]
    }

}
