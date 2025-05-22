public class InheritanceMain {
    public static void main(String[] args) {
        Animal animal = new Animal("cat","Medium",40);
        doAnimalStuff(animal,"30");
        Dog dog = new Dog();
        doAnimalStuff(dog,"50");//! in doAnimalStuff i have type of argument Animal but here i am passing type as Dog this works because Dog is inherited from Animal;

        Dog yorkie = new Dog("Yorkie",40);
        doAnimalStuff(yorkie,"fast");

        Dog retriever = new Dog("Retriever",65,"curly","swimmer");
        doAnimalStuff(retriever,"slow ");

        Fish fish = new Fish("shark", 30,50,60);
        doAnimalStuff(fish,"fast");
    }
    public static  void doAnimalStuff(Animal animal,String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
    }
}
