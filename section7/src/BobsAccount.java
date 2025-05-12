public class BobsAccount {
    private int acNumber = 123456;
    private int acBalance = 120000000;
    private String custName = "Tanishq Saxena";
    private String pNumber = "93XXXXXX02";

    //todo Creating Constructor
    public BobsAccount(){
        this("935436",123456, 6789000, "T Saxena");
        System.out.println("An empty construtor. This should be the first line when you are doing constructure chaining");

    }
    public BobsAccount(String pNumber,int acNumber,int acBalance,String custName ){
        System.out.println("constructor with arguments");
        this.acBalance = acBalance;
        this.acNumber = acNumber ;
        this.custName = custName;
        this.pNumber = pNumber;

    }

    //todo making setter below
    public void setacBalance(int newBal){
        acBalance = newBal;
    }
    //todo making withdraw function below.
    public int withdraw(int amt){
        if(amt>acBalance){
            System.out.println("insufficient balance");
        }
        return acBalance-amt;
    }
    //todo making getter below
    public int getAcNumber() {
        return acNumber;
    }

    public int getAcBalance() {
        return acBalance;
    }

    public String getcustName() {
        return this.custName;
    }

    public String getpNumber() {
        return pNumber;
    }

    public void getacNumber(){
        System.out.println(this.acNumber);
    }
}
