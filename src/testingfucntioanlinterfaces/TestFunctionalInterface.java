package testingfucntioanlinterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestFunctionalInterface {

    public static void main(String[] args) {

        Consumer<String> consumer = s-> System.out.println("name : "+ s);
        consumer.accept("animesh");

        Supplier <Integer> sp = ()-> 2;
        System.out.println(sp.get());

        Predicate<String> predicate = (s)->s.length()>10;
        System.out.println(predicate.test("substring"));

        Function<String , Integer> function = (s)->s.length();
        System.out.println(function.apply("catch me if you can"));
    }
}
