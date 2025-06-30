import java.util.*;

//Q2 Convert an Optional type into Stream

public class ConvertOptionalToStream {

    public static void main(String[] args) {

        List<Integer> intergerList = Arrays.asList(1,2,3,4,5,6,7,8);

        intergerList.stream().filter(e->e>6).findFirst().stream().forEach(System.out::println);

    }
}
