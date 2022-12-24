package test.day06;

import java.util.Scanner;

public class Q2_KelimeedekiHarfSayisi {
    static String boskova=""; //bunu niye buraya koydugumu bilmiyorum aşağı koyunca hata veriyor mk
    public static void main(String[] args) {

         /*Interview question
         * write a return method that can find the frequency of characters (with case
         * sensitivity)
         * Input = AAABBCDD output = A3B2C1D2
         */

        String kelime="Tukaka";
        System.out.println(harfSayisiniBul(kelime));
    }

    public static String harfSayisiniBul(String str) {
        int sayac=0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <str.length() ; j++) {
                if (str.substring(i,i+1).equals(str.substring(j,j+1))) {
                    sayac++;
                }
            }
            if (!boskova.contains(str.substring(i,i+1))){
                boskova=boskova+str.charAt(i)+sayac;
            }
            sayac=0;
        }

     return boskova;
    }

}
