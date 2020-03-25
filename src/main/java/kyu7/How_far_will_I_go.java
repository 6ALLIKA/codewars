package kyu7;

public class How_far_will_I_go {
    public static void main(String[] args) {
        System.out.println(travel(1000, 10, 127, 14));
        System.out.println(travel(100, 10, 0, 10));
        System.out.println(travel(25, 50, 120, 18));
    }
    public static int travel(int totalTime, int runTime, int restTime, int speed) {
        // todo...
        int traveled = 0;

        if (totalTime == 0) return 0;
        if (runTime > totalTime) return speed * (runTime - totalTime);
        while(totalTime >= runTime){
            traveled += runTime * speed;
            totalTime -= runTime + restTime;
        }
        if (runTime > totalTime && totalTime > 0) traveled += speed * totalTime;
        return traveled;
    }
}
