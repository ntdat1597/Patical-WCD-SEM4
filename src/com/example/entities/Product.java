package com.example.entities;

public class Product {
    private int id;
    private String name;
    private int price;
    private int amount;
    private String details;


    public Product () {

    }

    public Product (int id, String name, int price, int amount, String details) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.details = details;
    }

    public Product (int id, String name, String price, String amount, String details) {


    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getPrice () {
        return price;
    }

    public void setPrice (int price) {
        this.price = price;
    }

    public int getAmount () {
        return amount;
    }

    public void setAmount (int amount) {
        this.amount = amount;
    }

    public String getDetails () {
        return details;
    }

    public void setDetails (String details) {
        this.details = details;
    }
}
