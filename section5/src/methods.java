public class methods {
    public static void main(String[] args) {
        //! Methods in Java -- to reduce code duplication.
        boolean gameOver = true;
        int bonus = 100;
        int score = 800;
        int levelComleted = 5;
        calculateScore(gameOver,bonus,score,levelComleted);

        bonus = 200;
        score = 10000;
        levelComleted = 8;
        calculateScore(gameOver,bonus,score,levelComleted);
//        calculateScore(true,100,score,levelComleted);
//        calculateScore(true,200, 10000,8);
        int result = calcResult(gameOver,score,levelComleted,bonus);
        System.out.println(result);
    }
//    public static void calculateScore(boolean gameOver,int bonus, int score , int levelCompleted){
//
//        int finalScore  = score;
//        if(gameOver){
//            finalScore += (levelCompleted*bonus);
//            finalScore += 1000;
//            System.out.println("your final score by method  is "+finalScore);
//        }
//    }
public static void calculateScore(boolean gameOver,int bonus, int score , int levelCompleted){

    int finalScore  = score;
    if(gameOver){
        finalScore += (levelCompleted*bonus);
        finalScore += 1000;
        System.out.println("your final score by method  is "+finalScore);
    }
}
public static int calcResult(boolean gameOver, int score , int levelCompleted , int bonus){
        int finalScore = score;
        if(gameOver){
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;

}
}
