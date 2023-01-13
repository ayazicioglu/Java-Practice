package test.day08;

public class Q1_EBOB_EKOK {
    public static void main(String[] args) {
        int sayi1=4;
        int sayi2=6;

        int kucukSayi=0;
        int buyukSayi=0;

        if (sayi1<sayi2){
            kucukSayi=sayi1;
            buyukSayi=sayi2;
        }else {
            kucukSayi=sayi2;
            buyukSayi=sayi1;
        }

        int sayac=0;

        for (int i = kucukSayi; i >1 ; i--) {
            if (sayi1%i==0 && sayi2%i==0){
                System.out.println("Sayiların EBOB'u: "+i);
                sayac++;
                break;
            }
        }
        if (sayac==0) System.out.println("Bu sayiların EBOB'u yoktur");

        sayac=0;
        for (int i = buyukSayi; i <10000 ; i++) {
            if (i%sayi1==0 && i%sayi2==0){
                System.out.println("Sayiların EKOK'u: "+i);
                sayac++;
                break;
            }
        }
        if (sayac==0) System.out.println("Bu sayiların 10000'e kadar EKOK'u yoktur");
    }
}
