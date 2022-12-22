package test.day04;

public class Q2 {
    //0-255e kadar olan harflerin, sayı ve harf değerini konsola yazdırın
    public static void main(String[] args) {
        System.out.println("................INT SAYACI......");
        for (int i = 0; i <= 255; i++) {
            System.out.println(i+" nın harf değeri " +((char)i));
        }
        System.out.println("..............CHAR SAYACI.............");
        for (char i = 0; i <= 255; i++) {
            System.out.println(i+" nın sayi değeri " +((int)i));
        }
    }
}
