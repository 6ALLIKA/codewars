package kyu7;

public class Get_the_Middle_Character {
    public static void main(String[] args) {
        String word = "n";

        System.out.println(getMiddleMine(word));
    }
    public static String getMiddleMine(String word) {
        //Code goes here!
        int middle = word.length() / 2;

        if (word.length() % 2 == 0) return word.substring(middle - 1, middle + 1);
        if (word.length() % 2 != 0) return word.substring(middle,middle+1);

        return ("");
    }
    public static String getMiddle(String word) {
        String s = "";
        int length = word.length();
        int half = length/2;

        if (length % 2 == 0) {

            s = word.substring(half - 1, half + 1);

        } else {

            s = word.substring(half, half + 1);

        }

        return s;
    }
    public static String getMiddleClever(String word) {
        int length = word.length();
        return (length % 2 != 0) ?  String.valueOf(word.charAt(length / 2)) : word.substring(length / 2 - 1, length / 2 + 1);
    }
}
