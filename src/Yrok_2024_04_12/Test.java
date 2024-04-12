package Yrok_2024_04_12;

public class Test {
    public static void main(String[] args) {
        //    // анонимный класс
        //Example example = new Example() {
//    @Override
//    public int findMax(int a, int b) {
//        return a>b ? a :b;
//    }
//};

//        Example example = (a, b) -> {return  a>b? a:b;};
//        int max = example.findMax(5,6);
//        System.out.println(max);

        Example2 example2 = number -> Integer.toString(number);
//         String.valueOf(int number);

//        WordEditor wordEditor = str -> {
//            String[] array = str.split("");
//            for (int i = 0; i < array.length; i++) {
//                String s = array[i].substring(0, 1).toUpperCase() + array[i].substring(1, array.length).toLowerCase();
//                System.out.println(s);
//            }
//            return str;
//        };
//        String example3 = wordEditor.title("hELLO WORLd");
//        System.out.println(example3);
    }


}

interface Example {
    int findMax(int a, int b);
}

interface Example2 {
    String numberToString (int number);
}

interface WordEditor{
    String title (String text);
}