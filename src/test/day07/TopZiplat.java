package test.day07;

import java.util.Scanner;

public class day07_topziplat {
    //Bir top belirli yükseklikten atılmaktadır.
    // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do
    // while code blogu create ediniz.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Topun atılacığı yüksekliği giriniz: ");
        double metre=scan.nextDouble();
        double ziplamaYuksekligi=0;
        int yereVurmaSayisi=0;
        do {
            ziplamaYuksekligi+=metre;
            metre*=3.0/4.0;
            yereVurmaSayisi++;
            ziplamaYuksekligi+=metre;
        }while (metre>=1);
        System.out.println("Topun aldığı toplam mesafe: "+ziplamaYuksekligi+
                " \nToplam yere değme sayisi: "+yereVurmaSayisi+"\nSon mesafe: "+metre);

    }
}
