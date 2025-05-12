public class ternaryOperator {
    public static void main(String[] args) {
        //! ternary operator
        //todo operand1 ? operand2 : operand3
        //? if operand1 is true it will return operand2 else it will  return operand 3;

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        System.out.println(isDomestic);//? false
        String s = isDomestic ? "this car is Domestic" : "this car isn't Domestic";
        System.out.println(s);
    }
}
