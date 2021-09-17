import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        int choice = 1;

        do {
            printMenu();
            choice = scan.nextInt();

            switch(choice) {
                
                case 1 :

                    System.out.println("Enter your number:");

                    int n = scan.nextInt();

                    int i = 1;

                    int sum = 0;

                    for(i = 1; i <= n; i++) {

                        sum += i;

                    }

                    System.out.println("The sum of integers from 1 to " + n + " is: " + sum);

                break;

                case 2 :

                    System.out.println("Enter your number:");

                    int m = scan.nextInt();

                    long factorial = 1;

                    for(int x = 1; x <= m; x++) {

                        factorial = factorial * x;
                    }

                    System.out.println("The factorial of " + m + " is " + factorial);

                break;

                case 3 :

                    System.out.println("Enter your number:");

                    int number = scan.nextInt();

                    int remainder = 0;

                    while(number != 0) {

                        remainder = number % 10;

                        number = number / 10;

                    }

                    System.out.println("The leftmost digit of this number is: " + remainder);

                break;

                default : 

            }
        } while(choice != 4); 
    }  

    // prints menu...
    private static void printMenu() {
        System.out.println("Please choose one option from the following menu:");
        System.out.println("1) Calculate the sum of integers from 1 to m");
        System.out.println("2) Calculate the factorial of a given number");
        System.out.println("3) Display the leftmost digit of a given number");
        System.out.println("4) Quit");
    }

}
