public class Encapsulation {
    //todo in java encapsulation means hiding things by making then private or inaccessible.
    //? somitimes to make interface simpler we may want to ide unnecessary details.
    //? to protect data integrity.
//    public String name;
//    public int health;
//    public String weapon;
    private  String name;
    private int health;
    private String weapon;

    public Encapsulation(String name, int health, String weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }
    public void looseHealth(int damage){
        health = health - damage;
        System.out.println("player dealth reduced");
    }
    public int healthRemaining() {
        return health;
    }
}
