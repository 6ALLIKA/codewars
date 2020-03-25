package kyu7;

public class Mumbling {
    public static void main(String[] args) {
        System.out.println(accum("abcd"));
    }
    public static String accum(String s) {
        // your code
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String str = String.valueOf(c).toLowerCase();
            String upper = str.toUpperCase();
            String lower = "";
            int j = i + 1;
            if (j == 1) {
                upper = str.toUpperCase();
                result = upper;
                continue;
            }
            if (j > 1) {
                while (j > 1) {
                    lower = lower + str;
                    j--;
                }
                upper = upper + lower;
            }
            result = result + "-" + upper;
        }
        return result;
    }
    public static String accum1(String s) {
        StringBuilder bldr = new StringBuilder();
        int i = 0;
        for (char c : s.toCharArray()) {
            if (i > 0)
                bldr.append('-');
            bldr.append(Character.toUpperCase(c));
            for (int j = 0; j < i; j++)
                bldr.append(Character.toLowerCase(c));
            i++;
        }
        return bldr.toString();
    }
}
