package functional;

import java.util.function.Function;

public class MethodReferences {
    public static void main(String[] args) {
        printSomethingInACertainWay((s, p) -> s.toLowerCase());
        printSomethingInACertainWay((s, p) -> s.toUpperCase());

        printSomething(new Function<String, String>() {
        //se rescrie metoda apply a interfetei Function
            @Override
            public String apply(String s) {
                return s.toLowerCase();
            }
        });

        // o alta functionalitate trimisa aceleasi metode
        printSomething(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        });
        printSomething(s -> s.toLowerCase());
        printSomething(String::toUpperCase);
    }

    public static void printSomethingInACertainWay(MyFunction howToPrint) {
        // hello
        // another 100 lines of code
        System.out.println(howToPrint.transform("hello", "prefix"));
    }


    //ex de transmitere ca param a unei metode/functii
    public static void printSomething(Function<String, String> howToPrint) {
        // hello
        // another 100 lines of code
        System.out.println(howToPrint.apply("hello"));
    }
}
