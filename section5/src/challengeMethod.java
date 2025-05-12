public class challengeMethod {
    public static void main(String[] args) {
        displayHighScorePosition("tanishq",1);
        int score = 999;
        int position = calculateHighScorePosition(score);
        System.out.println(position);
    }
    public  static void displayHighScorePosition(String pName,int pScore){
        System.out.println(pName + " managed to get " + pScore + " onthe high score list.");
    }
    public static int calculateHighScorePosition(int position){
        int playerPosition = 4;
        if(position>= 1000){
            playerPosition = 1;
        } else if (position >= 500) {
            return playerPosition = 2;//!here you don't need to write (position>=500 && position<=1000) since if position would be less than 1000 then only it would go to 2nd condition.
            //? as position is less than 1000 it is running this else if block or else it would be running if block only.
        }else if(position >=100) {
            return playerPosition = 3;
        }else{
            return  playerPosition = 4;
        }
        return playerPosition;//!dont need to write else block;
    }
}
