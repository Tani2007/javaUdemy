public class parsingData {
    public static void main(String[] args) {
        //! parseInt function => this will convert string to a number.
        int currentYear = 2025;
        String userDateOfBrith = "2007";
        int dateOfBirth = Integer.parseInt(userDateOfBrith);
        System.out.println("Age = " + (currentYear-dateOfBirth));
        int num = 10;
        String newVal = String.valueOf(32);
        System.out.println(newVal + 32);
    }
}
