import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class GapfulNumber {
    public static void main(String[] args) {

        System.out.println("Welcome to Amazing Numbers!");
        System.out.println("Supported requests:\n" +
                "- enter a natural number to know its properties;\n" +
                "- enter two natural numbers to obtain the properties of the list:\n" +
                "  * the first parameter represents a starting number;\n" +
                "  * the second parameter shows how many consecutive numbers are to be processed;\n" +
                "- separate the parameters with one space;\n" +
                "- enter 0 to exit.");
        boolean condition = true;

        while (condition) {

            System.out.println("Enter a request:");
            Scanner scanner = new Scanner(System.in);
            String[] strings = scanner.nextLine().split(" ");
            String userInput = strings[0];
            String tillNum = strings[1];

            BigInteger num = new BigInteger(userInput);
           int addNum = Integer.parseInt(tillNum);
            System.out.println("Properties of " + num + ":");
            for(int i = 0; i<addNum; i++ ){
             System.out.println((num.add((BigInteger.valueOf(i)))) );

            }










             System.out.println(addNum);

            boolean error = (Arrays.stream(strings).anyMatch(x -> Objects.equals(x, " ")));






        }
    }

    public static BigInteger reversNumber(BigInteger n)
    {
        String s = n.toString();
        StringBuilder sb = new StringBuilder(s);
        return new BigInteger(sb.reverse().toString());
    }
}

