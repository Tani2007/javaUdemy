import java.util.Scanner;

public class exceptionHandeling {
    public static void main(String[] args) {
        //!try and catch for exception handelling.
//        try{
//            getInputFromConsole(2025);
//        }catch(Exception e){
//            getInputFromScanner(2007);
//        }
        getInputFromScanner(2025);

    }
//    public static String getInputFromConsole(int currentYear){
//        String dob = System.console().readLine("what is your dob");
//        //! the above method will work in terminal but not in this ide as in most of ides we use scanner.
//        //!so the System.console() will give you an error in this ide
////        System.out.println(dob - 32);
//        return "";
//    }
    public  static String getInputFromScanner(int year){
        Scanner scanner = new Scanner(System.in);
//        System.out.println("hey your name");
//        String name = scanner.nextLine();
//        System.out.println("your name is " + name);
        System.out.println("Enter your Dob");
        boolean validDob = false;
        int age = 0;
        do {
            System.out.println("enter your birth year" + (year-125) + "less than" +year);
            String yourDob = scanner.nextLine();
            try{
                int isDob = checkData(year,yourDob);
                if( isDob >=0){
                    System.out.println("Your Dob is "+isDob);
                    validDob = true;
                }
            }catch (NumberFormatException badData){
                System.out.println("Charactere are not allowed");
            }


        }while(!validDob);


        return "";
    }
    public static int checkData(int currYear,String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minYear = currYear - 125;
        if(dob < minYear || dob>currYear){
            return -1;
        }
        return (currYear - dob);
    }
}
