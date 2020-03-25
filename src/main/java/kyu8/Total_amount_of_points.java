package kyu8;

import java.util.Arrays;

public class Total_amount_of_points {
    public static void main(String[] args) {
        System.out.println(points(new String[]
                {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"}));
    }
    public static int points(String[] games) {
        //implement me
        int points = 0;
        for (String string : games) {
            if (Integer.parseInt(string.split("")[0]) > Integer.parseInt(string.split("")[2])) {
                points += 3;
            }
            if (Integer.parseInt(string.split("")[0]) == Integer.parseInt(string.split("")[2])) {
                points += 1;
            }
        }
        return points;
    }
    public static int pointsStream(String[] games) {
        return Arrays.stream(games)
                .mapToInt(score -> score.charAt(0) - score.charAt(2))
                .map(match -> match > 0 ? 3 : match == 0 ? 1 : 0)
                .sum();
    }
}
