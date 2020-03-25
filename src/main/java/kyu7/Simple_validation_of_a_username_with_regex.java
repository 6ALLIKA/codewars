package kyu7;

public class Simple_validation_of_a_username_with_regex {
    public static void main(String[] args) {
        int count=1;
        System.out.print(count++);        System.out.println(validateUsr("regex"));
        System.out.print(count++);        System.out.println(validateUsr("a"));
        System.out.print(count++);        System.out.println(validateUsr("Hass"));
        System.out.print(count++);        System.out.println(validateUsr("Hasd_12assssssasasasasasaasasasasas"));
        System.out.print(count++);        System.out.println(validateUsr(""));
        System.out.print(count++);        System.out.println(validateUsr("____"));
        System.out.print(count++);        System.out.println(validateUsr("012"));
        System.out.print(count++);        System.out.println(validateUsr("p1pp1"));
        System.out.print(count++);        System.out.println(validateUsr("asd43 34"));
        System.out.print(count++);        System.out.println(validateUsr("asd43_34"));


    }
    public static boolean validateUsr(String s) {
        return s.matches("[a-z_\\d]{4,16}");
    }
    public static boolean validateUsrMine(String s) {
        boolean result=true;
        char[] array=s.toCharArray();

        if (s.length()<4 || s.length()>16)  result = false;

        for(char x:array) {
            if (Character.isSpaceChar(x)) {
                result = false;
                break;
            }

            if (Character.isUpperCase(x)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
