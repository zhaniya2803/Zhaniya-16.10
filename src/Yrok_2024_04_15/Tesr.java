package Yrok_2024_04_15;

import java.util.function.UnaryOperator;

public class Tesr {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = Tesr::test;
        System.out.println(unaryOperator.apply(5));
    }
    static int test(Integer num){
        int number = num * num;
        return number;
    }
}
