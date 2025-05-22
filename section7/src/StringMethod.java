public class StringMethod {
    public static void main(String[] args) {
        //todo we will learn String methods here.
        //? String inspectiojn  methods --> they tell us about length isEmpty and other things
        //? String comparison Mehtod
        //? String manipulation Mehtods.
        //todo String inspection  method.
        //! length , charAt, indexOf ,lastIndexOf ,isEmpty,isBlanck.
        printInformationString("Tanishq Saxena");
//        stringIndex("Tanishq Saxena");
    }
    public static  void printInformationString(String myString){
        int length = myString.length();
        System.out.printf("length is %d %n",length);
        System.out.printf("second Char is %c %n",myString.charAt(1));
        System.out.printf("Last index of a is %d",myString.lastIndexOf("a"));
        System.out.printf("index of first a is %d %n",myString.indexOf("a"));
        System.out.println("is String Empty" + myString.isEmpty());//? this tells us that is that string Empty or not.
        System.out.println("is myString blanck" + myString.isBlank());//? suppose if String is containing only \n \t then is said to be blank.here String is not Empty.
        System.out.println("index of 1st a after 3rd index is" + myString.indexOf("a",3));//? this will search index of a after 3rd index but i will search from left to right.
        System.out.println("last index of after 7 is "+ myString.lastIndexOf("a",7));//? but this will search from right to left
        System.out.println("myString in lowerCase and upperCase"+myString.toLowerCase() + myString.toUpperCase());
        String myNewString = myString.toUpperCase();
        if(myString.equals(myNewString)){
            System.out.println("yes they are Equal");
        }
        if(myString.equalsIgnoreCase(myNewString)){
            System.out.println("no they are not equal");
        }
        System.out.println("string starting with tanishq"+myString.startsWith("tanishq"));
        System.out.println("myString ending with Saxena"+myString.endsWith("Saxena"));
        System.out.println("my String Contains tani"+myString.contains("Tani"));
        System.out.println("myString content is equal to Tanishq Saxena"+myString.contentEquals("Tanishq Saxena"));
    }
    public static  void stringIndex(String str){
        for(int i = 0 ; i<str.length() ; i++){
            System.out.println(str.indexOf(str.charAt(i)));
        }
    }
}
