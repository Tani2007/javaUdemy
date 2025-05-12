public class javaFirst {
    public static void main(String arg[]) {
        //todo  If statement always require a boolean value.
//        if(boolean){
//            enter your code here;
//        }
        System.out.println("Hello World");
        boolean isRight = true;
        if (isRight){
            System.out.println("its not right");
        }
        int first = 10;
        int second = 20;
        if(first>5 || second <10){
            System.out.println("OR operator worked succesfully");
        }
        boolean isCar = false;
//        if ((isCar = true)){
//            System.out.println("is car is false");
//        }// this statement will perfectly run as that isCar = true is converting that isCar statement to true and then giving us the output.
        if(!isCar){
            System.out.println("is car is false");
        }// !isCar is the another shotcut for isCar != true or isCar == false
    }
}
