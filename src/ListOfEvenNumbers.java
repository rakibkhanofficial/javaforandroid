//List of even numbers from 1 to 100
public class ListOfEvenNumbers {
    public static void main(String[] args) {
//define limit
        int limit = 100;
        System.out.println("Even numbers between 1 and " + limit);
        for(int i=1; i <= limit; i++){
// if the number is divisible by 2 then it is even
            if( i % 2 == 0){
                System.out.print(i + " ");
            }
        }

    }
}
