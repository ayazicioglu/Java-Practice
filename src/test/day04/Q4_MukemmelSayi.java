package test.day04;

public class Q4_MukemmelSayi {
    public static void main(String[] args) {
        mukemmelSayiBul(496);//6, 28, ve 496 mukemmel sayılardır mesela
    }
    public static void mukemmelSayiBul(int sayi){
        int toplam=0;
        for (int i = 1; i < sayi; i++) {
            if (sayi%i==0){
                toplam+=i;
                if (toplam==sayi) System.out.println("Sayi mükemmel");
            }
        }
    }
}
