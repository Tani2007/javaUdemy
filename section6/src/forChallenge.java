public class forChallenge {
    public static void main(String[] args) {
        int num = 13;
        int counter=0;
        //!prime number challenge;
        for(int i=0; counter<3 && i<=num; i++){
            if(isPrime(i)){
                System.out.println(i);
                counter++;
            }
        }

    }
    public  static  boolean isPrime(int num){
        if(num <= 2){
            return (num==2);
        }
        for(int i =2; i <num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}