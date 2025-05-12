public class newSwitchStatements {
    public static void main(String[] args) {
        //!Enhanced Switch Statement
//        switch(value){
//            case 1 -> System.out.println("value was 1");
//            case 2 -> System.out.println("value was 2");
//            case 3,4,5 -> System.out.println("value was" + value);
//            default -> System.out.println("nothing");
//        }
//        int value = 3;
//        switch(value){
//            case 1 -> System.out.println("value was 1");
//            case 2 -> System.out.println("value was 2");
//            case 3,4,5 -> System.out.println("value was " + value);
//            default -> System.out.println("nothing");
//        }
        //? System.out.println(getMonthsQuarters("march"));
        System.out.println(printDayOfWeek(7));
    }
//    public  static  String getMonthsQuarters(String month){
//        switch(month){
//            case "jan":
//                return "1st";
//            case "feb":
//                return "2nd";
//            case "march":
//                return "3rd";
//        }
//        return switch(month){
//            case "jan" ->   "1st";
//            case "feb" -> "2nd";
//            case "march" -> {yield "3rd";}//?here also you can use yeild but return is not valid inside this new type of switch statement.
//            default -> {
//                String badRes = "hey";
//                yield  badRes;//?here yeild is used in place of return statement you can not use return statement here by using yield we returned our strung variavble badRes;
//            }
//        };
//
//    }
    public static  String printDayOfWeek(int day ){
        return switch(day){
            case 1 -> "sunday";
            case 2 -> "monday";
            case 3 -> "tuesday";
            case 4 -> "wednesday";
            case 5 -> "thrusday";
            case 6 -> "friday";
            case 7 -> "saturday";
            default -> "not a day";

        };
    }
}
