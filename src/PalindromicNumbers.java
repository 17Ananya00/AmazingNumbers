import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class PalindromicNumbers {
    public static void main(String[] args) {
        System.out.println("Welcome to Amazing Numbers!");


        System.out.println("Supported requests:\n" +
                "- enter a natural number to know its properties;\n" +
                "- enter 0 to exit.");

        boolean condition = true;
        while (condition) {

            System.out.println("Enter a request:");
            Scanner scanner = new Scanner(System.in);


            BigInteger userInput = scanner.nextBigInteger();

            String bigStr = userInput.toString();
            String[] strAr = new String[bigStr.length()];
            for (int i = 0; i < bigStr.length(); i++) {
                strAr[i] = (String.valueOf(bigStr.charAt(i)));
            }
            boolean error = (Arrays.stream(strAr).anyMatch(x -> Objects.equals(x, "-")));
            if (error) {
                System.out.println("The first parameter should be a natural number or zero.");
            } else {


                int[] ints = new int[bigStr.length()];
                for (int i = 0; i < bigStr.length(); i++) {
                    ints[i] = Integer.parseInt(String.valueOf(bigStr.charAt(i)));
                }


            /*String[] strArray = new String[ints.length];
            for (int i = 0; i < ints.length; i++) {
                strArray[i] = String.valueOf(ints[i]);
            }

             */



           /* boolean error = (Arrays.stream(strArray).anyMatch(x -> x == "-"));
            if (error) {
                System.out.println("The first parameter should be a natural number or zero.");
                continue;
            } else {

            */


                BigInteger zero = new BigInteger("0");
                int res;

                res = userInput.compareTo(zero);

                BigInteger reverseN = reversNumber(userInput);


                int len = ints.length;
                int lastDigit = len - 1;






           /* if (res == -1  ) {
                System.out.println("The first parameter should be a natural number or zero.");
                continue;
            } else {

            */
                if (res == 0) {
                    System.out.println("Goodbye!");
                    condition = false;
                } else {
                    BigInteger seven = new BigInteger("7");
                    BigInteger remainderBy7 = userInput.remainder(seven);
                    int resultOf7 = zero.compareTo(remainderBy7);
                    BigInteger two = new BigInteger("2");
                    BigInteger remainderBy2 = userInput.remainder(two);
                    int resultOf2 = zero.compareTo(remainderBy2);

                    System.out.println("Properties of " + userInput);
                    BigInteger one = new BigInteger("1");
                    int resul219 = userInput.compareTo(one);



                    int resOf2 = userInput.compareTo(two);
                    BigInteger three = new BigInteger("3");
                    int resultOf3 = userInput.compareTo(three);

                    BigInteger four = new BigInteger("4");
                    int resultOf4 = userInput.compareTo(four);

                    BigInteger five = new BigInteger("5");
                    int resultof5 = userInput.compareTo(five);

                    BigInteger six = new BigInteger("6");
                    int resultof6 = userInput.compareTo(six);

                    int resultOFFFFFF7 = userInput.compareTo(seven);

                    BigInteger eight = new BigInteger("8");
                    int resultOf8 = userInput.compareTo(eight);

                    BigInteger nine = new BigInteger("9");
                    int resultof9 = userInput.compareTo(nine);



                    int resultwhygod = userInput.compareTo(two);
                    if(resultwhygod == 0 || resultOf4 == 0 || resultof6 == 0 || resultOf8 == 0){
                        System.out.println("even: true");
                        System.out.println("odd: false");

                    } else if(resul219 == 0){
                        System.out.println("even: false");
                        System.out.println("odd: true");

                    } else if (resultOf2 == 0) {
                        System.out.println("even: true");
                        System.out.println("odd: false");
                    } else {
                        System.out.println("even: false");
                        System.out.println("odd: true");
                    }
                    int res20 = userInput.compareTo(one);



                    if(resOf2 == 0 || resultOf3 ==0 || resultOf4 == 0 || resultof5 == 0|| resultof6 == 0 ||  resultOf8 == 0 || resultof9 == 0){
                        System.out.println("buzz: false");

                    } else if(res20 == 0){
                        System.out.println("buzz: false");
                    } else if (resultOf7 == 0 || ints[lastDigit] == 7) {
                        System.out.println("buzz: true");
                    } else {
                        System.out.println("buzz: false");
                    }

                    boolean duck = (Arrays.stream(ints).anyMatch(x -> x == 0));

                    if (duck) {
                        System.out.println("duck: true");

                    } else {
                        System.out.println("duck: false");
                    }

                    int resultOfComparison = userInput.compareTo(reverseN);

                    if (resultOfComparison == 0) {
                        System.out.println("palindromic: true");
                    } else {
                        System.out.println("palindromic: false");
                    }


                }


            }

        }
    }






    public static BigInteger reversNumber(BigInteger n)
    {
        String s = n.toString();
        StringBuilder sb = new StringBuilder(s);
        return new BigInteger(sb.reverse().toString());
    }



}
