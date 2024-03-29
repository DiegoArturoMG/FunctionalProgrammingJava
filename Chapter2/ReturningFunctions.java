package Chapter2;

import java.util.function.Function;

public class ReturningFunctions {

    public static class MyMath {
        public static Integer timesTwo(Integer x) {
            return x * 2;
        }

        public static Integer timesThree(Integer x) {
            return x * 3;
        }

        public static Integer timesFour(Integer x) {
            return x * 4;
        }

        public static Function<Integer, Integer> createMultiplier(Integer y) {
            return (Integer x) -> x * y;
        }
    }

    public static void main(String[] args) {
        NoArgFunction<NoArgFunction<String>> createGreeter = () -> () -> "Hello functional"; // Function that return a function that return a String
        NoArgFunction<String> greeter = createGreeter.apply();
        System.out.println(greeter.apply()); // Hello functional

        Function<Integer, Integer> timesTwo = MyMath.createMultiplier(2);
        Function<Integer, Integer> timesThree = MyMath.createMultiplier(3);
        Function<Integer, Integer> timesFour = MyMath.createMultiplier(4);

        System.out.println(timesTwo.apply(6)); // 12
        System.out.println(timesThree.apply(6)); // 18
        System.out.println(timesFour.apply(6)); // 24

    }

}
