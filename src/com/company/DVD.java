package com.company;

public class DVD {
    private String name;    //名称
    private String state = "可借";  //状态
    private String price;      //借出日期
    private int rent;           //租金


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
            this.state = state;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public int getRent() {
        return rent;
    }
    public void setRent(int rent) {
        this.rent = rent;
    }

    public DVD(){

    }

    public DVD(String name, String state, String price) {
        this.name = name;
        this.state = state;
        this.price = price;
    }

    @Override
    public String toString() {
        return  state +"\t"+ name +"\t"+ price;
    }
}
