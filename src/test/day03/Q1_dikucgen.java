package test.day03;

import java.util.Scanner;

public class Q1_dikucgen {
    public static void main(String[] args) {
         /*
        Kullanicidan uc adet sayi alarak bu sayilarin
        bir dik ucgenin kenar uzunluklari olup olmadigini hesaplatan bir kod yaziniz
        NOT:
        Bir ucgenin dik oldugunu anlamak icin a2+b2=c2 pisagor
        denkleminden yararlanabilirsiniz.
        -----Ornek Ekran Ciktisi-----
        ilk kenari giriniz: 2
        ikinci kenari giriniz: 15
        üçüncü kenari giriniz: 7
        Bu bir dik ucgen degildir.
        Bu bir dik ucgendir.
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Üçgen uzunluklarını gireceksiniz... ");
        System.out.println("Birinci kenarı giriniz");
        int a=scan.nextInt();
        System.out.println("İkinci kenarı giriniz");
        int b= scan.nextInt();
        System.out.println("Üçüncü kenarı giriniz");
        int c= scan.nextInt();

        if ((a*a)+(b*b)==(c*c))System.out.println("Bu bir dik üçgendir");
        else if ((a*a)+(c*c)==(b*b)) System.out.println("Bu bir dik üçgendir");
        else if ((b*b)+(c*c)==(a*a)) System.out.println("Bu bir dik üçgendir");
        else System.out.println("bu bir dik üçgen değildir");

        System.out.println("..........2.COZUM.............");
        if ((a*a)+(b*b)==(c*c)||(a*a)+(c*c)==(b*b)||(b*b)+(c*c)==(a*a))
            System.out.println("Bu bir dik üçgendir");
        else System.out.println("bu bir dik üçgen değildir");

    }
}
