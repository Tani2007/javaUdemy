public class whileLoop {
    public static void main(String[] args) {
        int i = 1;
        //!while Loop
//        while(i<= 5){
//            System.out.println(i);
//            i++;
//        }
//        while(true){
//            if(i>5){
//                break;
//            }
//            System.out.println(i);
//            i++;
//        }
        //! do-while Loop
//        do{
//            System.out.println(i);
//            i++;
//        }while(i<5);
//        System.out.println(i);
        //! continue statement
        int j = 0;
        while(j<50){
            j+=5;
            if (j % 25 == 0){
                continue;//? if this  condition is true  this will again go to top loop statement and not run the statement below it.
            }
            System.out.print(j+"_");

        }
    }
}
