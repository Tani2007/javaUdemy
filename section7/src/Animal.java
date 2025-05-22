public class Animal {
    private String type;
    private String size;
    private double weight;
    //todo I'll create Animal class here and i will inherit it inside Dog class.means Dog class will inherit type size and weight fields from this Animal class.
    //todo for Inheritnce i will  have to crete a default constructer.
    public Animal(){

    };
    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
    public void move(String speed){
        System.out.println(type + " moves " + speed);
    }
    public void makeNoise(){
        System.out.println(type + " make noise");
    }
}
