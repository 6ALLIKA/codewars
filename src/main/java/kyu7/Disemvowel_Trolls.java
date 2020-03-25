package kyu7;

public class Disemvowel_Trolls {
    public static void main(String[] args) {
        System.out.println(disemvowel("This website is for losers LOL!"));
    }
    public static String disemvowelMine(String str) {
        // Code away...
        String [] x = str.split("");
        StringBuilder sb = new StringBuilder();
        for (String string:x) {
            if (!string.equals("a") &&
                    !string.equals("e") &&
                    !string.equals("i") &&
                    !string.equals("o") &&
                    !string.equals("u") &&
                    !string.equals("A") &&
                    !string.equals("E") &&
                    !string.equals("I") &&
                    !string.equals("O") &&
                    !string.equals("U")) {
                sb.append(string);
            }
        }

        return sb.toString();
    }
    public static String disemvowelNice(String Z) {
        return Z.replaceAll("(?i)[aeiou]" , "");
    }
    public static String disemvowel(String str) {
        return str.replaceAll("[aAeEiIoOuU]", "");
    }

}
