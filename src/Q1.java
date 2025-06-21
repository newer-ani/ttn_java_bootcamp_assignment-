public class Q1 {

    static {
        String Firstname = "Animesh" ;
        String Lastname = "Yadav";
        int age=22;
        System.out.println("Inside the static block");
        System.out.println(Firstname+" "+Lastname+" "+age);
    }

    static String Firstname="Animesh";
    static String Lastname = "Yadav";
    static int age= 22;

    public static void main(String[] args)
    {
        System.out.println("Inside the main method");
        System.out.println(Firstname);
        System.out.println(Lastname);
        System.out.println(age);
    }

}
