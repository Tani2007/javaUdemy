public class Dog extends Animal{
    private String  earShape;
    private String tailShape;
    public Dog(String type,double weight){
        this(type , weight,"Perky","Curled");
    }
    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight<15 ? "small" : (weight<35 ? "medium" : "large" ), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public Dog(){
        super("dog","50",60);//?here i am calling Animal Constructor by using keyword super.
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise(){
        //? i have orverride the Animal makeNoise method here.
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Dogs walk run and wave their tail.");
    }

}
