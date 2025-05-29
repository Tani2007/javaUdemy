public class CompositionMain {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2008","HP","240");
        Monitor theMonitor = new Monitor("vivobook","Asus",27,"24");
        Mohterboard theMohterBoard = new Mohterboard("Amd r-5 ","Acer",4,6,"v2hper");
        PersonalComputer myComputer = new PersonalComputer("2025","Dell",theMonitor,theMohterBoard,theCase);
//        myComputer.getComputerCase().powerBtnPressed();
//        myComputer.getMotherBoard().loadProgram("Windows");
        myComputer.loadMore();
    }
}
