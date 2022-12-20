//Write a program in Java to find out Alphabet Pattern.
public class PatternA {
    // Java program to print alphabet A pattern
    void display()
    {
// Outer for loop for number of lines
        for (int i = 0; i<= 7; i++) {
// Inner for loop for logic execution
            for (int j = 0; j<= 7 / 2; j++) {
// prints two column lines
                if ((j == 0 || j == 7 / 2) && i != 0 ||
// print first line of alphabet
                        i == 0  && j != 7 / 2 ||
// prints middle line
                        i == 7 / 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        PatternA a = new PatternA();
        a.display();
    }
}