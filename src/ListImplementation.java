import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListImplementation {

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 5 numbers you want to add in the list");
        List<Double> list = new ArrayList<>();
        for(int i =0;i<5;i++)
        {
            double n = sc.nextDouble();
            list.add(n);
        }

        Iterator it = list.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }

}
