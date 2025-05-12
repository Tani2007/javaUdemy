public class digitOutChallenge {
    public static void main(String[] args) {
//        int result = 0;
//        int num = 828;
//        int num1 = 0;
//        int num2 = num/10;
//
//        for(int i = 0; i<3;i++){
//            result += num%10;
//            num=num/10;
//        }
//        System.out.println(result);
        System.out.println(hasSharedDigit(12,13));
    }
    public static boolean hasSharedDigit(int num1,int num2){
        if((num1<10 || num1>99) || (num2<10 || num2> 99)){
            return false;
        }
        int originalNum1 = num1;//32=>2
        int originalNum2 = num2;//25=>5=>2
        int result = 0;
        for(int i=0;i<2;i++){
            for(int j=0; j<2;j++){
                if(originalNum2%10 == originalNum1%10){
                    result = 1;
                }
                originalNum2 = originalNum2/10;
            }
            originalNum2 = num2;
            originalNum1 = originalNum1/10;
        }
        if(result == 1){
            return true;
        }
        return false;
    }
}
