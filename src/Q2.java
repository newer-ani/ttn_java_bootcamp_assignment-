import java.util.Scanner;

public class Q2 {
    public static void main(String[] arg)
    {
                Scanner sc = new Scanner(System.in);
                StringBuilder sb = new StringBuilder();
                String text;

                System.out.println("Enter text or enter 'XDONE' to stop):");

                do {
                    text = sc.nextLine(); // read user input
                    if (!text.equals("XDONE")) {
                        sb.append(text).append("\n");
                    }
                } while (!text.equals("XDONE"));

                System.out.println("You entered:");
                System.out.println(sb.toString());
            }
        }


