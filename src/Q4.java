//Q4. Create Unmodifiable List from a Steam

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q4 {

    public static void main(String[] args) {

        Stream<String>  stream = Stream.of("walk","talk","cake","bake");
        List<String> list = stream.collect(Collectors.toUnmodifiableList());
        list.add("think");
    }
}
