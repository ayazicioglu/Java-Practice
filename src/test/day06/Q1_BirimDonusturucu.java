package test.day06;

import java.util.Locale;
import java.util.Scanner;

public class Q1_BirimDonusturucu {
    // Saati saniyeye, mil'i kilometreye, kilogrami gram'a
    // ceviren bir method yaziniz.
    // Bu methodu main methodun disinda olusturup main methodun
    // icinden cagiriniz.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Dönüştürmek isteediğiniz birimi giriniz:\n=>Saat\n=>Mil\n=>Kilogram");
        String birim=scan.nextLine().toLowerCase();
        System.out.println("Dönüştürmek istediğiniz birimin miktarını giriniz:");
        double miktar=scan.nextDouble();

        birimDonusturme(birim,miktar);
        birimDonusturme("saat",65);
        birimDonusturme("mil",89);
        birimDonusturme("kilogram",30);
        birimDonusturme("kl",65);
        birimDonusturme("mil",76);
        birimDonusturme("saat",13);
    }

    private static void birimDonusturme(String birim, double miktar) {
        switch (birim){
            case "saat":
                System.out.println("Girdiginiz saatin saniye değeri: "+miktar*3600);break;
            case "mil":
                System.out.println("Girdiginiz kilometrenin mil değeri: "+miktar*1.6);break;
            case "kilogram":
                System.out.println("Girdiginiz kilogramın gram değeri: "+miktar*1000);break;
            default:
                System.out.println("Yanlış giriş yaptınız");
        }
    }
}
