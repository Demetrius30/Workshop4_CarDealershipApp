package com.dm;

public class SalesContract extends Contract{
    private String saleTax;
    private float fee;
    private float processingFee;
    private boolean finance;
    private float monthlyPaymentIfFinanced;


    public SalesContract(String saleTax, float fee, float processingFee, boolean finance, float monthlyPaymentIfFinanced) {
        super();
        this.saleTax = saleTax;
        this.fee = fee;
        this.processingFee = processingFee;
        this.finance = finance;
        this.monthlyPaymentIfFinanced = monthlyPaymentIfFinanced;
    }

    public String getSaleTax() {
        return saleTax;
    }

    public void setSaleTax(String saleTax) {
        this.saleTax = saleTax;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    public float getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(float processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isFinance() {
        return finance;
    }

    public void setFinance(boolean finance) {
        this.finance = finance;
    }

    public float getMonthlyPaymentIfFinanced() {
        return monthlyPaymentIfFinanced;
    }

    public void setMonthlyPaymentIfFinanced(float monthlyPaymentIfFinanced) {
        this.monthlyPaymentIfFinanced = monthlyPaymentIfFinanced;
    }

    @Override
    public String toString() {
        return "SalesContract{" +
                "saleTax='" + saleTax + '\'' +
                ", fee=" + fee +
                ", processingFee=" + processingFee +
                ", finance=" + finance +
                ", monthlyPaymentIfFinanced=" + monthlyPaymentIfFinanced +
                '}';
    }
}
