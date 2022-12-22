package test.day04;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cümle giriniz: ");
        String girilenCumle=scan.nextLine();
        int sayac=0;
        for (int i = 0; i < girilenCumle.length(); i++) {
            if (girilenCumle.charAt(i)=='A'||girilenCumle.charAt(i)=='a'){
                sayac++;
            }
            if (girilenCumle.charAt(i)=='C'||girilenCumle.charAt(i)=='c'){
                break;//for döngüsü bu şarta gelince kırılacak
            }
        }
        System.out.println("Cümledeki ilk c harfinden önceki toplam a harfi sayısı: " +sayac);

        //yukarıda A ve a farkını ortadan kaldırmak için if body si içine iki şartı da veya bağlacı ile
        //bağladım. Ancak bunun yerine String girilenCumle=scan.nextLine(); bittiği yer toUpperCase() yada
        //toLowerCase ekleyebilirdim.
    }
}
