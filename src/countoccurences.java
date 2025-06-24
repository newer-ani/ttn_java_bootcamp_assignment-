import java.io.*;
import java.util.Scanner;

//Q3.Write a program to count number of occurrences of a word in a file. The file name and word should be supplied through commandline.
public class countoccurences {

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the file name and word that you want to search in that file");
        String fname = sc.next();
        String word = sc.next();
      int count=0;
      File file = new File("/home/animesh/.config/JetBrains/IdeaIC2025.1/scratches/scratch.txt");
      try{
          FileReader fr = new FileReader(file);
          BufferedReader br = new BufferedReader(fr);

          String line;
          while((line = br.readLine())!=null) {
              String[] words = line.split(" ");
              for (int i = 0; i < words.length; i++) {
                  if (words[i].equals(word))
                      count++;
              }
          }
          System.out.println("count of "+word+" is: "+count);
      }
      catch (FileNotFoundException fe)
      {
          System.out.println("file not found :"+ file.toString());
      } catch (IOException e) {
          System.out.println("file not found exception "+file.toString());
      }


    }
}
