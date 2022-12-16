import java.util.Scanner;
public class IfElseExample
{
    public static void main(String[] args)
    {

        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.println("Enter Your age:"); // take input from user
        int age = sc.nextInt(); ////defining an 'age' variable
        //checking the age
        if (age > 18)
        {
            System.out.print("**Your are Welcome**Your Age is greater than 18");
        }
        else {
            System.out.println("**you are Not Permitted Here** Your Age is less than 18");
        }
    }
}