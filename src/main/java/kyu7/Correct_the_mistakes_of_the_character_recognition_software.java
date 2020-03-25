package kyu7;

import java.util.Arrays;

public class Correct_the_mistakes_of_the_character_recognition_software {
    public static void main(String[] args) {
        System.out.println(correct("1F-RUDYARD K1PL1NG"));
    }
    public static String correct(String string) {
        return string.replaceAll("5","S").replaceAll("0","O")
                .replaceAll("1","I");
    }
}
