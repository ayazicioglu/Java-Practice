package test.day02;

import java.util.Scanner;

public class Q02_SwitchCase_HesapMakinesi {
    public static void main(String[] args) {
        /*
         * Kullanicidan iki tamsayi sayi ve islem cinsini alin
         * ve sayilari kullanicinin belirledigi isleme tabi tutup sonucu yazdirin.
         *
         * islem cinsi icin 1:toplama 2:cikarma 3:carpma 4: bolme
         *
         * Ornek : Inputs : sayilar : 18 , 10  islem : 3
         *         Output : 18 X 10 = 180
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("İki tamsayi giriniz: ");
        int ilkSayi = scan.nextInt();
        int ikinciSayi = scan.nextInt();
        System.out.println("Yapılacak işlemi seçiniz: + - * / ");
        char chr = scan.next().charAt(0);

        System.out.println("*********************SWITCH COZUMU**********************");
        switch (chr) {
            case '+':
                System.out.println(ilkSayi + " ve " + ikinciSayi + " toplami: " + (ilkSayi + ikinciSayi));
                break;
            case '-':
                System.out.println(ilkSayi + " ve " + ikinciSayi + " farki: " + (ilkSayi - ikinciSayi));
                break;
            case '*':
                System.out.println(ilkSayi + " ve " + ikinciSayi + " carpimi: " + (ilkSayi * ikinciSayi));
                break;
            case '/':
                System.out.println(ilkSayi + " ve " + ikinciSayi + " bölümü: " + (ilkSayi / ikinciSayi));
                break;
            default:
                System.out.println("Yanlış giriş yaptınız");
        }
        System.out.println("******************** IF COZUMU********************");
        if (chr == '+') {
            System.out.println(ilkSayi + " ve " + ikinciSayi + " toplami: " + (ilkSayi + ikinciSayi));
        }
        if (chr == '-') {
            System.out.println(ilkSayi + " ve " + ikinciSayi + " farki: " + (ilkSayi - ikinciSayi));
        }
        if (chr == '*') {
            System.out.println(ilkSayi + " ve " + ikinciSayi + " carpimi: " + (ilkSayi * ikinciSayi));
        }
        if (chr == '/') {
            System.out.println(ilkSayi + " ve " + ikinciSayi + " bölümü: " + (ilkSayi / ikinciSayi));
        }
        else System.out.println("Muhtemelen yanlış tuşa bastın hacı");
    }
    }

