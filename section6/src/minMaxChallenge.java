import java.util.Scanner;

public class minMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double maxNumber = 0;
        double minNumber = 0;
        int i =  0;

        while(true){
            System.out.println("enter Your number or any char to exit");
            String nextEntry = scanner.nextLine();
            try{
                Double num = Double.parseDouble(nextEntry);
                if(i == 0|| num < minNumber){
                    minNumber = num;//12
                    i++;
                }
                if(num > maxNumber){
                    maxNumber = num;
                    i++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Exit!!!");
                break;
            }

        }
        System.out.println(minNumber);
        System.out.println(maxNumber);
    }
}
