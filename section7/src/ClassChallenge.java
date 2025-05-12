public class ClassChallenge {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    public  void depositFunds(int depositAmt){
        balance += depositAmt;
        System.out.println(balance + "₹ your balance");

    }
    public  void withdrawBalance(int withdrawl){
        if((balance - withdrawl )> 0){
            System.out.println((balance - withdrawl) + "₹ your balance");
        }else{
            System.out.println("insufficient balance");
        }

    }
}
