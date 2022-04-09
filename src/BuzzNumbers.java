import java.util.Scanner;

public class BuzzNumbers {
    public static void main(String[]args) {

        System.out.println("Enter a natural number:");
        Scanner scanner = new Scanner(System.in);
      int userInput = scanner.nextInt();
        String temp = Integer. toString(userInput);
        int[] numbers = new int[temp.length()];
        for(int i = 0; i < temp.length(); i++) {
            numbers[i] = temp.charAt(i) - '0';
        }

        int len = numbers.length;
       int lastDigit = len-1;








        if (userInput < 1) {
            System.out.println("This number is not natural!");
        } else {
            if (userInput % 2 == 0) {
                System.out.println("This number is even");
            } else {
                System.out.println("This number is odd");
            }
            if(userInput % 7 == 0 && numbers[lastDigit] == 7 ){
                System.out.println("It is a Buzz number.");
                System.out.println("Explanation:");
                System.out.println(userInput +  " is divisible by 7 and ends with " +userInput);
            }
            else if (userInput % 7 == 0) {
                System.out.println("It is a Buzz number.");
                System.out.println("Explanation:");
                System.out.println(userInput + " is divisible by 7");
            } else if(numbers[lastDigit] == 7 ){
                System.out.println("It is a Buzz number.");
                System.out.println("Explanation:");
                System.out.println(userInput + " ends with 7.");
            } else if(userInput == 7){
                System.out.println("It is a Buzz number.");
                System.out.println("Explanation:");
                System.out.println(userInput + " ends with 7.");

            }else {
                System.out.println("It is not a buzz number");
                System.out.println("Explanation:\n" +
                       userInput +  " is neither divisible by 7 nor does it end with 7.");
            }


        }
    }
}
