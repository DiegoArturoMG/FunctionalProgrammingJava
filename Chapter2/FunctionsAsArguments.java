package Chapter2;

import java.util.function.BiFunction;

public class FunctionsAsArguments {

    protected static class MyMath {
        public static Integer add(Integer x, Integer y) {
            return x + y;
        }

        public static Integer substract(Integer x, Integer y) {
            return x - y;
        }

        public static Integer combine2And3(BiFunction<Integer, Integer, Integer> combineFunc) {
            return combineFunc.apply(2, 3);
        }
    }

    public static void main(String[] args) {
        System.out.println(MyMath.combine2And3(MyMath::add)); // 5
        System.out.println(MyMath.combine2And3(MyMath::substract)); // -1
        System.out.println(MyMath.combine2And3((x,y) -> 2 * x + 2 * y)); // 10
    }

}
