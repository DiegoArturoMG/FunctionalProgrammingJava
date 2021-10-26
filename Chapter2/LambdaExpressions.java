package Chapter2;

import java.util.function.Function;

public class LambdaExpressions {

    public static void main(String[] args) {
        Function<Integer, Integer> absoluteValue = (x) -> {
            if(x < 0) {
                return -x;
            } else {
                return x;
            }
        };

        System.out.println(absoluteValue.apply(-100)); // 100
    }

}
