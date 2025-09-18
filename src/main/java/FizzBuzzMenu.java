// DO NOT CHANGE THE CLASS NAME, IT WILL BREAK THE AUTO GRADER
import java.util.Scanner;
public class FizzBuzzMenu {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        boolean running = true;
        int choice = 0;
        while(running)
        {
            System.out.println("--- FizzBuzz Menu ---");
            System.out.println("1. Fizz (Multiples of 3)");
            System.out.println("2. Buzz (Multiples of 5)");
            System.out.println("3. FizzBuzz (Multiples of 3 and 5)");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice: ");
            choice = scan.nextInt();
            System.out.println("\n");

            switch(choice)
            {
                case(1):
                    for(int x=0;x<100;x++)
                    {
                        if(x%3 == 0)
                        {
                            System.out.print(x + " ");
                        }
                        else
                        {
                            continue;
                        }
                    }
                    System.out.println("\n\n\n");
                    break;
                case(2):
                    for(int x=0;x<100;x++)
                    {
                        if(x%5 == 0)
                        {
                            System.out.print(x + " ");
                        }
                        else
                        {
                            continue;
                        }
                    }
                    System.out.println("\n\n\n");
                    break;
                case(3):
                    for(int x=0;x<100;x++)
                    {
                        if(x%3 == 0)
                        {
                            if(x%5 == 0)
                            {
                                {
                                    System.out.print(x + " ");
                                }
                            }
                        }
                        else
                        {
                            continue;
                        }
                    }
                    System.out.println("\n\n\n");
                    break;
                case(4):
                    running = false;
                    System.out.println("Goodbye!");
                    System.out.println("\n\n\n");
                    break;
            }

        }
    }
}