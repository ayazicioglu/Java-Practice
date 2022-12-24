package test.day05;

import java.util.Arrays;

public class Q3_KelimeyiHarflereAyirma {
    public static void main(String[] args) {
        String name="Kamuran";
        kelimeyiHarflereAyir(name);
    }

    private static void kelimeyiHarflereAyir(String name) {
        char[] harfler=new char[name.length()];
        for (int i = 0; i < name.length(); i++) {
            harfler[i]=name.charAt(i);
        }
        System.out.println(Arrays.toString(harfler));
    }
}
