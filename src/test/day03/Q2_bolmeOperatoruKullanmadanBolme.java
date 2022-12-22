package test.day03;

import java.util.Scanner;

public class Q2_bolmeOperatoruKullanmadanBolme {
    public static void main(String[] args) {
        // Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
        // kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bolmek istediginiz sayiyi giriniz");
        int a= scan.nextInt();
        System.out.println("Lütfen bolen istediginiz sayiyi giriniz");
        int b= scan.nextInt();
        bol(a,b);
        System.out.println(a+" / "+b+" = " +bol(a,b));
    }

    private static int bol(int bolunen, int bolen) {
        int bolum=0;
        while (bolunen>=bolen){
            bolunen-=bolen;//bu satır bolunen=bolunen-bolen; in prof hali
            bolum++;
        }
        return bolum;
    }

}
