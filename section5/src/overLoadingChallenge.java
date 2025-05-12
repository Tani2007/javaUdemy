public class overLoadingChallenge {
    public static void main(String[] args) {

        System.out.println(convertToCm(3));
        System.out.println(convertToCm(5,8));

        System.out.println(getDurationString(3950));
        System.out.println(getDurationString(65,50));
    }
    //! Challenge 1
    public  static double convertToCm(int inches){
        return  inches * 2.54;
    }
    public static double convertToCm(int feet , int inches){
        return  convertToCm(((feet * 12) + inches));
    }
    //! Challenge 2
    public static String  getDurationString(int sec){
        int min = sec/60;
        int  hrs = min/60;
        int remainingMins = min%60;
        int remainingSec = sec%60;
        System.out.println(hrs +"h " +remainingMins+ "m " + remainingSec+"s");
        return  "";

    }
    public  static  String getDurationString(int mins, int sec){
        int hrs = mins/60;
        int remainingMins = mins%60;
        int remainingSec  = sec%60;
        System.out.println(hrs + "h " + remainingMins + "m "+ remainingSec + "s" );
        return "";
    }
}
