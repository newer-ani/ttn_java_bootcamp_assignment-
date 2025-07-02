import java.util.LinkedHashMap;

//Q7. Demonstrate the use of firstEntry(), lastEntry(), pollFirstEntry(), pollLastEntry(), putFirst(), putLast(), reversed() with SequencedMap.

public class Q7 {
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();

        map.putFirst(1,"one");
        map.putFirst(2,"two");
        map.putFirst(3,"three");
        map.putLast(4,"Four");
        map.putLast(5,"Five");
        System.out.println(map);

        System.out.println("First: "+map.firstEntry());
        System.out.println("Last: "+map.lastEntry());
        System.out.println("deleted first : "+map.pollFirstEntry());
        System.out.println("deleted last: "+map.pollLastEntry());
        System.out.println("revered map : " + map.reversed());

    }
}
