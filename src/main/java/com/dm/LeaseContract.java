package com.dm;

public class LeaseContract extends Contract{
    private String expectedFee;
    private String leaseFee;
    private float monthlyPayment;

    public LeaseContract(String expectedFee, String leaseFee, float monthlyPayment) {
        this.expectedFee = expectedFee;
        this.leaseFee = leaseFee;
        this.monthlyPayment = monthlyPayment;
    }

    public String getExpectedFee() {
        return expectedFee;
    }

    public void setExpectedFee(String expectedFee) {
        this.expectedFee = expectedFee;
    }

    public String getLeaseFee() {
        return leaseFee;
    }

    public void setLeaseFee(String leaseFee) {
        this.leaseFee = leaseFee;
    }

    public float getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(float monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    @Override
    public String toString() {
        return "LeaseContract{" +
                "expectedFee='" + expectedFee + '\'' +
                ", leaseFee='" + leaseFee + '\'' +
                ", monthlyPayment=" + monthlyPayment +
                '}';
    }
}
