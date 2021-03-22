package com.example.model;

import com.example.da.ProductDataAccsess;
import com.example.entities.Product;

import java.sql.SQLException;
import java.util.List;

public class ProductBean {
    public List<Product> getProducts() throws SQLException, ClassNotFoundException {
        return new ProductDataAccsess().selectProduct();
    }
    public boolean getUserByName(String name,String password) throws SQLException, ClassNotFoundException {
        return new ProductDataAccsess().getUser(name,password);
    }
}
