package kyu7;

import java.util.Arrays;
import java.util.List;

public class Testing_1_2_3 {
    public static void main(String[] args) {
        System.out.println(number(Arrays.asList("a", "b", "c")));
    }
    public static List<String> number(List<String> lines) {
        // TODO
        String j;

        for(int i = 0; i < lines.size(); i++ ){
                j = String.valueOf(i+1);
                j += ": ";
                j += lines.get(i);
                lines.set(i,j);
        }

        return  lines;
    }
}
