package test.day04;

public class Q2_ArraydekiSayilarinToplami {
    //Create an array of 5 floats and calculate their sum.
    public static void main(String[] args) {
       // float [] numbers=new float[5]; bu şekilde de yapabiliriz
        float[] numbers={1.1f,2.0f,3.2f,5.0f,7.5f};
        float toplam=0;
        for (int i = 0; i < numbers.length; i++) {
            toplam+=numbers[i];
        }
        System.out.println(toplam);
            //whileLoop ile de cozelim
        int index=0;
        toplam=0;
        while (index<numbers.length){
            toplam+=numbers[index];
            index++;
        }
        System.out.println(toplam);
    }
}
