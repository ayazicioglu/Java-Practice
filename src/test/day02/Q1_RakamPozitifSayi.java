package test.day02;

import java.util.Scanner;

public class Q1_RakamPozitifSayi {
    public static void main(String[] args) {
        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi 0 dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int girilenSayi=scan.nextInt();

        if (girilenSayi<0){
            System.out.println("Negatif Sayi");
        } else if (girilenSayi<10){
            System.out.println("Rakam");
        }else System.out.println("Pozitif Sayi");


        String result=(girilenSayi>=0)?((girilenSayi<10)?"Rakam":"Pozitif Sayi"):("Negatif Sayi");
        System.out.println(result);

        }
    }

