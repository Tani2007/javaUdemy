import java.util.Scanner;

public class inputTest {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();
        for(int i = 1; i <3; i++){
            System.out.println("Enter "+ i + " marks");
            number += userInput.nextInt();
        }
        System.out.println(number);
    }
}
