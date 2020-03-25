package kyu7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Alphabetical_Addition {
    public static void main(String[] args) {
        System.out.println(addLetters("a", "b", "c"));
        System.out.println(addLetters("y", "c", "b"));
        System.out.println(addLetters("z"));
    }

    public static String addLetters(String... letters) {
        // TODO implement letter addition
        Map<String,Integer> alphabet = new HashMap<>();
        alphabet.put("a",1);
        alphabet.put("b",2);
        alphabet.put("c",3);
        alphabet.put("d",4);
        alphabet.put("e",5);
        alphabet.put("f",6);
        alphabet.put("g",7);
        alphabet.put("h",8);
        alphabet.put("i",9);
        alphabet.put("j",10);
        alphabet.put("k",11);
        alphabet.put("l",12);
        alphabet.put("m",13);
        alphabet.put("n",14);
        alphabet.put("o",15);
        alphabet.put("p",16);
        alphabet.put("q",17);
        alphabet.put("r",18);
        alphabet.put("s",19);
        alphabet.put("t",20);
        alphabet.put("u",21);
        alphabet.put("v",22);
        alphabet.put("w",23);
        alphabet.put("x",24);
        alphabet.put("y",25);
        alphabet.put("z",26);

        int overflow = 0;



        for (String x:letters) {
            overflow += alphabet.get(x);
        }
        if (letters.length==0 || overflow%26==0){
            return "z";
        }
        Object[] keys = alphabet.keySet().toArray();

        return keys[overflow%26-1].toString();
    }
}
