package optional;

import java.util.List;
import java.util.Optional;

public class Main {
    private static String s = null;

    public static Optional<String> getS() {
        return Optional.ofNullable(s);
    }

    public static void main(String[] args) {
        Optional<Integer> max = getMax(null);
        System.out.println(max.isPresent());    //=>false
        Integer integer = max.orElse(-1);   //=>-1
        System.out.println(integer);
        if (max.isEmpty()) {
            System.out.println("No max");
        } else if (max.get() > 0) {
            System.out.println("Maximum is positive");
        }
        System.out.println(getS());
//        doSomething(null);        //n-ar trebui folosit Optional ca param. CI numai ca return type
    }

    public static Optional<Integer> getMax(List<Integer> list) {
        if (list == null || list.size() == 0) {
            return Optional.empty();
        }
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (i > max) {
                max = i;
            }
        }
        return Optional.of(max);
    }

    public static void doSomething(Optional<Integer> i) {
        if (i.isPresent()) {
            //something fancy
        }
    }

}
