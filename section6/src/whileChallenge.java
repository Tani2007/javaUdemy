public class whileChallenge {
    public static void main(String[] args) {
        int i = 4;
        int oddCount = 0;
        int evenCount = 0;
        while(i<=20 && evenCount<5){
            i++;
            if(!isEvenNumber(i)){
                oddCount++;
                continue;
            }
            evenCount++;
            System.out.println(i);
        }
        System.out.println("total Even number are" + evenCount);
        System.out.println("total odd Count are" + oddCount);
    }
    public  static boolean  isEvenNumber(int num){
        return ((num%2 ==0) ? true : false);
    }
}
