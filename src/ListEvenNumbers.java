//List of even numbers from 1 to 50
public class ListEvenNumbers {
    public static void main(String[] args) {
//define limit
        int limit = 50;
        System.out.println("Printing Even numbers between 1 and " + limit);
        for(int i=1; i <= limit; i++){
// if the number is divisible by 2 then it is even
            if( i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
