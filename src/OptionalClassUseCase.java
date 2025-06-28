import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassUseCase {



    public static void main(String[] args) {

        List<String> list = Arrays.asList("Animesh","rahul","tanu","siddharth","Riya");
        Optional<String> result = list.stream()
                .filter(s -> s.equalsIgnoreCase("Riya"))
                .findAny();
        System.out.println(result);
    }

}
