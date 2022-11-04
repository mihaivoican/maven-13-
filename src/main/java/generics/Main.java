package generics;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //folosire clasa pe stil vechi, fara generice
        OldBox oldBox = new OldBox(12);
        System.out.println(oldBox.getItem());

        if (oldBox.getItem() instanceof String) {
            System.out.println(((String) oldBox.getItem()).length());
        }
        if (oldBox.getItem() instanceof Integer) {
            System.out.println((Integer) oldBox.getItem() > 10);
        }

//apelare clasa Box cu field generic
        //la instantiere pot folosi tipuri de field diferite => avantaj; apoi am metodele specifice tipului de field
        Box<String> box = new Box<>("Mike");
        System.out.println(box.getItem().length());

        Box<Integer> box1 = new Box<>(12);
        System.out.println(box1.getItem() > 10);

        //chiar si List poate fi folosit ca tip field!!!
        Box<List<Integer>> listBox;

        NumberBox<Long> numberBox = new NumberBox<Long>(10L);
        System.out.println(numberBox.getItem().toString());
        NumberBox<Double> numberBox1 = new NumberBox<Double>(2.34);
        System.out.println(numberBox1.getItem().toString());

        Pair<Long, Double> pair = new Pair<>(10L, 23.2);

    }

}
