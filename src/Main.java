import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //num birthMonth = 0
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String trash = "";

        //output “Enter your birth month: ”

        System.out.println("Enter your birth month: ");

        //input birthMonth
        if (in.hasNextInt())
        {
            birthMonth = in.nextInt();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\nPlease enter an integer value. You entered: " + trash + ".");
            System.out.println("\nPlease run the program again.");
            System.exit(0);
        }

        if (birthMonth >= 1 && birthMonth <= 12)
        {
            System.out.println("\nYour birth month is: " + birthMonth);
        }
        else
        {
            System.out.println("\nThe month value entered is incorrect: " + birthMonth);
            System.out.println("\nPlease run the program again.");
            System.exit(0);
        }

        //if birthMonth >= 1 AND birthMonth <= 12 then
        //output “Your birth month is: ”+ birthMonth
        //else
        //output “The month value entered is incorrect: ” + birthMonth
        //endIf
    }
}