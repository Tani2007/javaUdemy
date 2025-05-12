public class methodsOverloading {
    public static void main(String[] args) {
        //! Method Overloading Occurs when a class has multiple methods with same name but there are declared with different parameters.
        //? conditions --> parameter type should be different return type of function can be same or differernt it doesent matter
        doSomething("hey");
        doSomething(3,3.0f);
        doSomething(3.0f,3);
    }
    //todo some examples of method overloading.
    public  static  void doSomething(String a){
        System.out.println("hey func 0");
    }
    public  static void doSomething(int a,float b){
        //type your code here
        System.out.println("hey func 1");
    }
    public  static void doSomething(float a,int b){
        //type your code here.
        System.out.println("hey func 2");
    }
}
