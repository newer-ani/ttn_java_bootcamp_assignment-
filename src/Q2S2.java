import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class Q2S2 {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        try {
            FileWriter fw = new FileWriter("users.txt", true);
            while (true) {
                System.out.println("enter firstname,lastname,age,phonenumber");
                String firstname = sc.next();
                String lastname = sc.next();
                int age = sc.nextInt();
                long phonenumber = sc.nextLong();
                User user = new User(firstname, lastname, age, phonenumber);
                fw.write(user.toString()+"\n");
                fw.flush();
                System.out.println("Do you want to continue creating users? (Type quit to exit)");
                String input = sc.next();
                if (input.equals("quit")) {
                    break;
                }
            }
            fw.close();
            System.out.println("users saved in the file");
        }catch (IOException e)
        {
            System.out.println("error in writing in the file");
        }
    }
}
class User{

    private String firstname;
    private String lastname;
    private int age;
    private long phonenumber;

    public User(String firstname, String lastname, int age, long phonenumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", phonenumber=" + phonenumber +
                '}';
    }
}

