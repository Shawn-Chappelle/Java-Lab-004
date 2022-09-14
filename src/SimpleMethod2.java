import java.util.Scanner;

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static int square(int input) {
        int result =(input * input);


        return result;
    }
    public static void main(String[] args) {
        System.out.println("Insert Integer to be Squared:");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        // Modify the below call to assign the result of the method call to a variable.
        square(input);
        // Put the result System.out code here.
        System.out.println(square(input));
    }
}
