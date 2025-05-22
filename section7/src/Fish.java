public class Fish extends Animal{
    private int gills;//! these private variable can only be updated or used by this class if you want you use or update them then make them public or protected making it protected means not all inherit class can use it.
    private int fins;
    public Fish(String type,double weight,int gills,int fins){
        super(type,"small",weight);
        this.gills = gills;
        this.fins = fins;
    }
    private void moveMuscles(){
        System.out.println("muscles move");
    }
    private void moveBackFins(){
        System.out.println("backfins moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed == "fast"){
            moveBackFins();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
