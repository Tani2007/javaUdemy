//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        Car car  = new Car();
        car.setMake(null);//todo this line will change make from baleno to BMW;
        car.setDoors(2);//todo this line will set door from 4 to 2.
        car.color = "red";//?color is a ublic variable there.
        //!you can not access make in the below line as it is a private instance there.
        //System.out.println(car.make);
        //!but you can use getter and setter method to do so.
        //todo getMake() ,getColor() these are getter method.
        //System.out.println("make = " + car.getMake());//* we got the data using getter method.
        car.describeCar();
        Car cidan = new Car();
        cidan.setMake("honda");
        cidan.setColor("black");
        cidan.setModel("cidan");
        cidan.describeCar();
        */
        ClassChallenge account = new ClassChallenge();
        account.setBalance(10000000.00);
        account.depositFunds(150);
        account.withdrawBalance(30);

    }
}