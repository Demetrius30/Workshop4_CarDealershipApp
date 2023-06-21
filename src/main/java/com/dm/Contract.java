package com.dm;

public abstract class Contract{
    private String date;
    private String name;
    private String email;
    private boolean sold;
    private float price;
    private float monthlyPayment;

    public Contract() {
        this.date = date;
        this.name = name;
        this.email = email;
        this.sold = sold;
        this.price = price;
        this.monthlyPayment = monthlyPayment;
    }

    public float getTotalPrice(float totalPrice){
        if(totalPrice  == totalPrice){
           return totalPrice;
        }else{
            return 0;
        }

    }

    public float getMonthlyPayment(float monthlyPayment){
        return 0;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "date='" + date + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", sold=" + sold +
                ", price=" + price +
                ", monthlyPayment=" + monthlyPayment +
                '}';
    }
}
