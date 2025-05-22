public class InheritanceChallenge   {
    public static void main(String[] args) {
        Employee tanishq = new Employee("tanishq","09/03/2007","09/03/2080");
        System.out.println(tanishq);
        System.out.println(tanishq.getAge());
        SalariedEmployee ram = new SalariedEmployee("ram","8430984","576576",32000000);
        System.out.println(ram.collectPay() );
    }
}
