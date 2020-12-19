package com.sysoiev;

import com.sysoiev.model.Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("oil");
        System.out.println(product.getName());
    }
}
