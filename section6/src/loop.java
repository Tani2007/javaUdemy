public class loop {
    public static void main(String[] args) {
//        for(double i =7.5; i<=10;i+=0.25){
//            double intrest = calculateInterest(100.0,i);
//            System.out.println(intrest);
//            if(intrest > 8.5){
//                System.out.println("yes");
//                return;
//            }
//        }
        System.out.println(primeChecker(16 ));

    }
    public static double calculateInterest(double amt,double interestRate){
        return amt *(interestRate/100);
    }
    public static  boolean primeChecker(int wholeNumber){
        if(wholeNumber <=2){
            return (wholeNumber == 2);
        }
        for(int i = 2; i < wholeNumber; i++){
            if(wholeNumber %i == 0){
                return false;
            }
        }
        return true;
    }
}
