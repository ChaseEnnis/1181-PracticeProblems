
import java.util.InputMismatchException;
import java.util.Scanner;


public class Driver{
    public static void main(String[]args) throws InvalidArgumentException{
        int n = getIntegerInput("Enter the desired fibonacci number");
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) throws InvalidArgumentException{
        int first=1;
        int second=0;
        int third=0;
        int val=0;

            while(n> val){
                third = first+ second;
                first= second;
                second=third;
                val++;      
            }
            return third;   

    }
    public static int getIntegerInput(String message) {
        Scanner scnr = new Scanner(System.in);
        System.out.println(message);
        int userInput=1;
        while (true) {
            try {
                userInput=scnr.nextInt();
                scnr.nextLine();
                if(userInput<1){ 
                    throw new InvalidArgumentException();
                }
                break;
            }
            catch (InvalidArgumentException e) {
                System.out.println("You must enter a positive number: "); // if user enters a negative number
            }
            catch (InputMismatchException j){
                System.out.println("Error: You must enter a number: "); // if user enters not a number
                scnr.nextLine();
            }
        }
            return userInput;
    
    }
        
}


