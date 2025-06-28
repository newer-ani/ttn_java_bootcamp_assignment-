import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{

    String fullName;
    Long salary;
    String city;

    public Employee(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }
}

public class UniqueClass {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Animesh Kumar Yadav", 4500L, "Delhi"),
                new Employee("Riya Sharma", 3000L, "Delhi"),
                new Employee("Amit Verma", 6000L, "Delhi"),
                new Employee("Animesh Kumar Yadav", 4500L, "Delhi"),
                new Employee("Rohit Kumar", 4000L, "Mumbai"),
                new Employee("Anjali Singh", 4800L, "Delhi")
        );

        List<String> uniqueFirstNames = employees.stream()
                .filter(e -> e.salary < 5000 && e.city.equalsIgnoreCase("delhi"))
                .map(e -> e.fullName.split(" ")[0])
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Unique first names: " + uniqueFirstNames);
    }
}
