package kyu8;

public class Convet_to_binary {
    public static void main(String[] args) {
        System.out.println(toBinary(100));
    }
    public static int toBinary(int n) {
        return Integer.parseInt(Integer.toBinaryString(n));
    }
}
