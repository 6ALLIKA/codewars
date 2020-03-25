package kyu7;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Descending_Order {
    public static void main(String[] args) {

        System.out.println(sortDesc(94536711));
        System.out.println(sortDescHARD(94536711));
        System.out.println(sortDescClever(94536711));
    }

    public static int sortDesc(final int num) {
        //Your code
        StringBuilder numbers = new StringBuilder();
        int x = num;
        Integer[] xx = new Integer[String.valueOf(Math.abs(num)).length()];

        if (x == 0) {
            return 0;
        }

        while (x != 0) {
            for (int i =0; i < xx.length; i++) {
                xx[i] = x % 10;
                x /= 10;
            }

        }
        Arrays.sort(xx, Collections.reverseOrder());
        for (Integer integer : xx) {
            numbers.append(integer);
        }

        return Integer.parseInt(numbers.toString());
    }
    public static int sortDescClever(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.parseInt(String.join("", array));
    }
    public static int sortDescHARD(final int num) {
        return Integer.parseInt(String.valueOf(num)
                .chars()
                .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));
    }
}


