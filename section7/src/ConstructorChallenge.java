public class ConstructorChallenge {
    private String name;
    private int creditLimit;
    private String eMail;
    public  ConstructorChallenge(){
        this("Tanishq","saxenatanishq@gmail.com");
    }
    public ConstructorChallenge(String name,int creditLimit,String eMail){
        this.name = name;
        this.creditLimit = creditLimit;
        this.eMail = eMail;
    }
    public ConstructorChallenge(String name, String eMail){
        this(name,12000000,eMail);
    }

    public String geteMail() {
        return eMail;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getName(){
        return this.name;
    }
}
