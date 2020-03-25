package kyu7;

public class Vowel_Count {
    public static void main(String[] args) {
        System.out.println(getCount("abracadabra"));
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a'
                    || str.charAt(i) == 'e'
                    || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                //Increments the vowel counter
                vowelsCount++;
            }
        }
            // your code here
        return vowelsCount;
    }
    public static int getCountClever(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }
    public static int getCountGood(String str) {
        return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
    }
}
