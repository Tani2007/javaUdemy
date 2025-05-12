public class forDebugger {
    public static void main(String[] args) {
        //!sum Challenge of for loop;
        int counter = 0;
        for (int i = 1; i<= 50;i++){
            if(i%5==0 && i%3==0){
                System.out.println(i);
                counter++;
                if(counter == 3){
                    return;
                }
            }
        }
    }
}
