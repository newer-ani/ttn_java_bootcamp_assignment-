import java.util.Arrays;
import java.util.List;

public class SumNumberUsingStream {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,0,6,8,7);
        int sum = list.stream()
                .filter(n->n>5).mapToInt(n-> n).sum();

        System.out.println("sum of numbers greater than 5 is :"+sum);
    }

}
