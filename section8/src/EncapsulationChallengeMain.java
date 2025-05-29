public class EncapsulationChallengeMain {
    public static void main(String[] args) {
        EncapsulationChallenge printer = new EncapsulationChallenge(2,2, true);
        printer.printPages(3);
        System.out.println(printer.getPagesPrinted());
    }
}
