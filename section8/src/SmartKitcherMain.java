public class SmartKitcherMain {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();
        kitchen.getIceBox().setHasWorkToDo(true);
        kitchen.getBrewMaster().setHasWorkToDo(true);
        kitchen.getDishWasher().setHasWorkToDo(true);
        kitchen.getDishWasher().doDishes();

    }
}
