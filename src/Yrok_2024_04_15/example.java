package Yrok_2024_04_15;

import java.util.function.UnaryOperator;

public class example {
    public static void main(String[] args) {
//        Consumer<String> printer = text -> System.out.println("text: " + text);
//
//        List<String> strings = List.of("1", "2","3");
//        for (String string : strings) {
//            printer.accept(string);
//        }
//
//        Consumer<List<Integer>> consumer = list -> {
//            for (int i = 0; i < list.size(); i++) {
//                list.set(i, list.get(i) * 2);
//            }
//        };
//        List<Integer> numbers = new ArrayList<>(){{
//            add(1);
//            add(2);
//            add(3);
//            add(4);
//        }};
//        consumer.accept(numbers);

//        Function<String, Integer> function = str -> Integer.parseInt(str);
//        int result = function.apply("45");
//        System.out.println(result);


//        Function<List<String>, List<Integer>> func = strings -> {
//            List<Integer> result = new ArrayList<>();
//            strings.forEach(str -> {
//               try {
//                result.add(Integer.parseInt(str));
//               }catch (Exception e){
//                   System.out.println("Строка не является числом");
//               }
//            });
//            return result;
//        };
//        List<String> strings = List.of("1", "2", "3", "s", "f", "4");
//        List<Integer> numbers = func.apply(strings);
//        System.out.println(numbers);



//        Function<List<Character>, String> function = list -> {
//            List<Character> result = new ArrayList<>();
//            StringBuilder stringBuilder = new StringBuilder();
//            for (Character c : list) {
//                if (!Character.isDigit(c)) stringBuilder.append(c);
//            }
//            return String.valueOf(stringBuilder);
//        };
//        List<Character> list = List.of('1', 'H', 'e', 'l', '2', '3', 'l', 'o', ',', ' ', '4', 'w', 'o', '5', 'r', 'l', 'd');
//        String result = function.apply(list);
//        System.out.println(result);


        UnaryOperator<Integer>  unaryOperator = example::test;
        System.out.println(unaryOperator.apply(5));
    }
    static int test(Integer num){
        int number = 2 * num;
        return number;
    }
}
