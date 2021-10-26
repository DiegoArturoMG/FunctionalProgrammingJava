package Chapter4;

public class Recursion {

    static void countDown(Integer x, Integer end) {
        if (x < end) {
            System.out.println("Done!");
            return;
        }
        System.out.println(x);
        countDown(x - 1, end);
    }

    static void countUp(Integer x, Integer end) {
        if (x > end) {
            System.out.println("Done!");
            return;
        }
        System.out.println(x);
        countUp(x + 1, end);
    }

    public static void main(String[] args) {
        countUp(0, 20);
    }


}
