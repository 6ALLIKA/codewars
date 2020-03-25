package kyu7;

import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Square_Every_Digit {
    public static void main(String[] args) {
       int x = 3212;
       System.out.println(squareDigitsMine(x));

    }


    public static int squareDigitsMine(int n) {
        // TODO Implement me
        StringBuilder numbers = new StringBuilder();
        Integer[] xx = new Integer[String.valueOf(Math.abs(n)).length()];

        while (n != 0) {
            for (int i = 0; i < xx.length ; i++) {
                xx[i] = n % 10;
                n /= 10;
            }
        }

        int nnn = xx.length;
        int temp;
        for (int i = 0; i < nnn/2; i++) {
            temp = xx[nnn-i-1];
            xx[nnn-i-1] = xx[i];
            xx[i] = temp;
        }

        for (int i = 0; i < xx.length; i++) {
            xx[i] *= xx[i];
        }
        for (Integer integer : xx) {
            numbers.append(integer);
        }

        return Integer.parseInt(numbers.toString());

    }

    public int squareDigitsBest(int n) {
        String result = "";

        while (n != 0) {
            int digit = n % 10 ;
            result = digit*digit + result ;
            n /= 10 ;
        }

        return Integer.parseInt(result) ;
    }


        public int squareDigitsMAP(int n) {
            return Integer.parseInt(String.valueOf(n)
                    .chars()
                    .map(i -> Integer.parseInt(String.valueOf((char) i)))
                    .map(i -> i * i)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining("")));
        }

}
