public class PersonalComputer extends Products{
    private Monitor monitor;
    private Mohterboard motherBoard;
    private ComputerCase computerCase;
    public void loadMore(){
        computerCase.powerBtnPressed();
    }
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Mohterboard getMotherBoard() {
//        return motherBoard;
//    }
//
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }

    public PersonalComputer(String model, String manufacturer, Monitor monitor, Mohterboard motherBoard, ComputerCase computerCase) {
        super(model, manufacturer);
        this.monitor = monitor;
        this.motherBoard = motherBoard;
        this.computerCase = computerCase;

    }
}
