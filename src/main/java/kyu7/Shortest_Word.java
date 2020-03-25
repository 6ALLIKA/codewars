package kyu7;

import java.util.Arrays;
import java.util.stream.Stream;

public class Shortest_Word {
    public static void main(String[] args) {
        int x = findShort("jhfgjk fjgkd d dsfo dfs ds");
        System.out.println(x);
    }
    public static int findShort(String s) {
        String[] b = s.split(" ");
        int min = 2;
        for (String x:b) {
            if (x.length() < min) {
                min = x.length();
            }
        }
        return min;

    }
    public static int findShortStream(String s) {
        return Stream.of(s.split(" "))
                .mapToInt(String::length)
                .min()
                .getAsInt();
    }
    public static int findShortArrays(String s) {
        return Arrays.stream(s.split(" ")).mapToInt(String::length).min().getAsInt();
    }
}
