public class ConstructorChallengeMain {
    public static void main(String[] args) {
        ConstructorChallenge myChallenge = new ConstructorChallenge();
        System.out.println(myChallenge.geteMail());
        //! here we can not create any other Constructor which you have not defined in your ConstructorChallenge class.
        //! suppose if i wouldn't be hav ing default constructor like this (ConstructorChallenge()) in my ConstructorChallenge class then i would not be calling it here it would give me error.

        //todo what is instance of a class --> whenever we write [new House()] a new instance is created;
        //todo what is refrence of a class --> whenever we write [House myHouse = new House()]; a new refrence myHouse of class house is created.
        //todo here House is the object.

        //!Static variable
        //! suppose you have a static variable in a class Dog (private static String name) and you have a setter that is changing that name and you have creted 2 instances of that static variable like this -->
        //!  Dog rex = new Dog("rex");
        //! Dog fluffy = new Dog("fluffy");
        //! rex.printName(); output = fluffy;
        //! fluffy.printName(); output = fluffy;
        //! hence whenever you will chnage static variable it will change at every instance.

        //? Instance varaiable
        //? private String name;
        //? rex.printName(); output = rex;
        //? fluffy.printName(); output = fluffy;

        //*Static Method --> when you have a static variable then you can use use Static variable the can be accessed without instantiating.
        //*suppose you have a a class Printing in that you have a static function printHello like this -->
        //* class Calculator{
        //* public static  void printHello(){sout("hello")}
        //* now this function can be accssed by main method directly like this
        //* Calculator.printHello();//hello

        //* in instance Method you need to instantiate the class first like this
        //* Calculator myCalc = new Calculator();
    }
}
