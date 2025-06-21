import java.util.InputMismatchException;
import java.util.Scanner;

public class Q7 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a =0,b=0;
        try{
            System.out.println("enter first number ");
            int n = sc.nextInt();

            System.out.println("enter second number ");
            int m = sc.nextInt();

            int res = n/m;
            System.out.println(res);
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());}
            catch(ArithmeticException e)
            {
                System.out.println("cannot divide by zero");
            }
        finally {
            System.out.println("inside the finally block");
        }
    }
}
