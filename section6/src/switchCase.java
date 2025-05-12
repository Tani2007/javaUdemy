public class switchCase {
    public static void main(String[] args) {
        int value = 4;
        //!syntax of switch
//        switch(value){
//            case x:
//                //code for value = x;
//                break;
//            case y:
//                //code for value = y;
//                break;
//            default:
//                //code for value not equal to  x or y.
//        }
        switch(value){
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println(" it was "+value);
            default:
                System.out.println("nothing");
        }
        //!Data types like boolean double float long and many more are not supported here.
    }
}
