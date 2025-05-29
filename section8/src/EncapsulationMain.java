public class EncapsulationMain {
    public static void main(String[] args) {
        //! Not Encapsulated
//        Encapsulation player = new Encapsulation();
//        player.name = "tani";//! as name is public there hence it can easily access it and change it.
//        player.health = 100;
//        player.weapon = "Sword";
//        System.out.println(player.name);
        //! Encapsulated
        Encapsulation player = new Encapsulation("tani",100,"Sword");
        System.out.println(player.healthRemaining());

    }
}
