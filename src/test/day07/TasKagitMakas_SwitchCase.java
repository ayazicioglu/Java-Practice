package test.day07;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas_SwitchCase {
    static int kullaniciSayac=0;
    static int javaSayac=0;
    static String javaSecim="";
    public static void main(String[] args) {
        Random rnd=new Random();
        Scanner scan=new Scanner(System.in);
        System.out.println("Tas Kagit Makas'tan biriniz seçiniz...");
        String secim= scan.nextLine().toLowerCase();
        int rastgeleSayi= rnd.nextInt(3)+1;

        if (rastgeleSayi==1)
            javaSecim="tas";
        else if (rastgeleSayi==2) {
            javaSecim="kagit";
        }else javaSecim="makas";

        System.out.println("Java'nın secimi: "+javaSecim);

        do {
        switch (secim){
            case "tas": {
                if (javaSecim.equals("tas")) System.out.println("Berabere!");
                else if (javaSecim.equals("kagit")) {System.out.println("Ben kazandim!");javaSayac++;}
                else {System.out.println("Sen kazandin!");kullaniciSayac++;}
            }break;
            case "kagit": {
                if (javaSecim.equals("tas")) {System.out.println("Sen kazandin!");kullaniciSayac++;}
                else if (javaSecim.equals("kagit")) {System.out.println("Berabere!");}
                else {System.out.println("Ben kazandim!");javaSayac++;}
            }break;
            case "makas": {
                if (javaSecim.equals("tas")) {System.out.println("Ben kazandim");javaSayac++;}
                else if (javaSecim.equals("kagit")) {System.out.println("Sen kazandin");kullaniciSayac++;}
                else {System.out.println("Berabere");}
            }break;
            default:
                System.out.println("yanlış giriş yaptın"); }break;


        }while (javaSayac!=5 && kullaniciSayac!=5);

        if (javaSayac>=5) System.out.println("Oyunu Java"+javaSayac+"-"+kullaniciSayac+ "Kazandi");
        else if (kullaniciSayac>=5) {System.out.println("Oyunu sen"+kullaniciSayac+"-"+javaSayac+ "Kazandin");}
        else System.out.println("Birşeyler ters gitti ama bende çözemedim");//hallettiğimde kalkacak bu satır
    }



}
