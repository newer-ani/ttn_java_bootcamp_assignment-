package InterfacesQ2;

public class Q2 {

    public static void main(String[] args) {

        MathOperations op = new MathOperations();
        Calculator addition = op::add;
        Calculator subtraction = op::subtract;

        Calculator multiplication = MathOperations::multiply;
        System.out.println("add: "+addition.operate(10,5));
        System.out.println("add: "+subtraction.operate(10,5));
        System.out.println("add: "+multiplication.operate(10,5));


    }
}
