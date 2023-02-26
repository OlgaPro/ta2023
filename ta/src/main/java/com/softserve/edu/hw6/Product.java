package com.softserve.edu.hw6;

import java.util.Objects;

public class Product {
    private String nameProduct;
    private int price;

    public Product(String nameProduct, int price){
        this.nameProduct = nameProduct;
        this.price = price;
    }
    @Override
    public String toString(){
        return "nameProduct: " + nameProduct
                + '\n' + "price: " + price;
    }
    @Override
    public boolean equals(Object obj) {
        Product prod = (Product) obj;
        return price == prod.price &&
                nameProduct.equals(prod.nameProduct);
    }

    public String getNameProduct(){
        return nameProduct;
    }

    public void setNameProduct(String nameProduct){
        this.nameProduct = nameProduct;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice (int price){
        this.price = price;
    }
}
