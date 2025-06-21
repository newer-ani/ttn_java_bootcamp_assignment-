public class Q8 {

    public static void main(String [] args)
    {
        try {
            // When we Try to load a class that doesn't exist
            Class.forName("com.NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught: " + e.getMessage());
        }
    }
}
/*
    In case of NoClassDefFoundError error - to achieve this we will have to follow some steps which are as follows :
    1. create a file and add some code may just hello world program
    2. now compile the file using the command  "javac filename.java"
    3. now after compilation a .class file is created in the same directory as the original .java file with the same name just the file
        extention gets changed to .class which is a the binary file of that original file.
    4. now if we delete this file and then try to execute the command java filename this will throw and error.
 */
