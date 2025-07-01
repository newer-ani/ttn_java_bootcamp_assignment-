
// Q5 Demonstrate the use of repeat(), strip(),trim(), isBlank(), indent(), transform(), stripIndent(), translateEscapes(),tripleQuotes and formatted() methods.
public class Q5 {

    public static void main(String[] args) {

        String s = "\t\u2005We wish you a Merry Christmas! \u2005";
        String s2 = "\t\t\u2005We wish you a Merry Christmas! \u2005";
        String multiline = """
                                  this is a line
                                       to check the 
                                  functionality of 
                                  stripIndent method
                           """;
        String transformed = s.transform(str -> str.strip().toUpperCase());

        System.out.println(s.repeat(3));
        System.out.println(s.trim());// not able to remove the /u2005 space , while it is able to remove the \t tab character space.
        System.out.println(s.strip());//removes all the leading an trailing spaces in a given string including the unicode characters like \t , \u2005
                                      //and other whitespace characters.
        String check = "\r";
        System.out.println(check.isBlank()); // this will return true if the string is empty or contains whitespace codepoints.
        System.out.println(s.isBlank());
        System.out.println(s.indent(3));
        System.out.println(transformed);
        System.out.println(multiline.stripIndent());
        System.out.println(s2.trim());
        System.out.println(s2.translateEscapes());
        System.out.println(multiline);

        String name = "Animesh";
        int age = 22;
        double score = 87.56;
        String result = "Name: %s, Age: %d, Score: %.2f".formatted(name, age, score);
        System.out.println(result);


    }


}
