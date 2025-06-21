import java.util.Scanner;

public class Q4 {

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit of the 2d array");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] arr = new int[n][m];
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<m;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        display(arr,n,m);
    }

    public static void display(int [][] arr , int n,int m )
    {

        for(int i =0;i<n;i++)
        {
            int sum = 0,sum2=0;
            for(int j =0;j<m;j++)
            {
                sum = sum+arr[i][j];
                sum2 = sum2 + arr[j][i];
            }
            System.out.println("sum of column  =" +sum2);
            System.out.println("sum of row ="+sum);
        }

    }
}
