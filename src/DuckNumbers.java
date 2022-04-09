import java.util.*;

public class DuckNumbers {
    public static void main(String [] args){

        System.out.println("Enter a natural number:");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();



        if (userInput < 1) {
            System.out.println("This number is not natural!");
        } else {




        String temp = Integer. toString(userInput);
        int[] numbers = new int[temp.length()];
        for(int i = 0; i < temp.length(); i++) {
            numbers[i] = temp.charAt(i) - '0';
        }

        int len = numbers.length;
        int lastDigit = len-1;
        System.out.println("Properties of " + userInput);

        String numberString = String.valueOf(userInput);
        char[] digits1 = numberString.toCharArray();



        boolean found = false;
        int searchedValue = 2;

        boolean duck = (Arrays.stream(numbers).anyMatch(x -> x == 0));










            if(userInput%2 == 0){
                System.out.println("even: true");
                System.out.println("odd: false");
            } else {
                System.out.println("even: false");
                System.out.println("odd: true");
            }


            if(userInput % 7 == 0 || numbers[lastDigit] == 7 ){
                System.out.println("buzz: true");
            } else {
                System.out.println("buzz: false");
            }

           if(duck){
                System.out.println("duck: true");
            } else {
                System.out.println("duck: false");
            }


       }






    }
}
