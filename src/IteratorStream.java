import java.util.stream.Stream;

public class IteratorStream {
    public static void main(String[] args) {
         Stream.iterate(0,i->i<9,i->i+2)
                .forEach(System.out::println);
    }
}
