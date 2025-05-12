import java.util.Scanner;

public class readingUserInput {
    public static void main(String[] args) {
        System.out.println("Reading User input of five numbers");
        Scanner userInput  = new Scanner(System.in);
        int result = 0;
        for(int i = 1; i<=5 ; i++){
            try{
                System.out.println("Enter "+i+" number ");
                result += Integer.parseInt(userInput.nextLine());
            }catch(NumberFormatException e){
                System.out.println("invlaid number");
            }

        }
        System.out.println(result);
    }
}
