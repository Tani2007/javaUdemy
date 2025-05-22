public class SalariedEmployee extends Employee {
    private double annualSal;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSal ) {
        super(name, birthDate, hireDate);
        this.annualSal = annualSal;
        this.isRetired = isRetired;
    }

    @Override
    public double collectPay() {
        return (int)annualSal/26;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSal=" + annualSal +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}
