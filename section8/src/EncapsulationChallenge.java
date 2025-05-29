public class EncapsulationChallenge {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    public EncapsulationChallenge(int tonerLevel,int pagesPrinted,boolean duplex){
        this.tonerLevel = ((tonerLevel>100) || (tonerLevel<0)) ? -1 : tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;

    }
    public int addToner(int amount){
        this.tonerLevel += amount;
        if((amount+tonerLevel > 100) || (amount+tonerLevel <0)){
            return -1;
        }
        return tonerLevel;
    }
    public int printPages(int pages){
        int jobPages = (duplex) ? (pages/2) + (pages%2): pages;
        pagesPrinted += jobPages;
        return jobPages;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }
}
