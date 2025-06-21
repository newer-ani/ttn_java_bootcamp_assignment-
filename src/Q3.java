import java.util.Scanner;

public class Q3 {

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius ");
        int r = sc.nextInt();
        System.out.println("*** Menu ***");
        System.out.println("Enter 1 : Calculate the area of circle ");
        System.out.println("Enter 2 :  Calculate Circumference of a Circle ");
        System.out.println("Enter 3 : Exit");
        System.out.println("enter your choice : ");
        int n = sc.nextInt();
        switch(n)
        {
            case  1 : int area  = (22/7 * r *r);
                      System.out.println("area of circle is :" + area);
                      break;
            case 2 : int circumference = 2*22/7*r;
                      System.out.println("circumference of circle is:" + circumference);
                      break;
            case 3 :  break;

            default :
                System.out.println("Invalid choice");
        }
    }

}
