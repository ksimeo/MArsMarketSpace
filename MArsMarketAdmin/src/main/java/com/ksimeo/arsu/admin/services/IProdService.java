package com.ksimeo.arsu.admin.services;

import com.ksimeo.arsu.core.models.Product;

import java.util.List;

/**
 * Created by @author Ksimeo on 17.11.2015 at 16:02. For project: MArsMarketSpace.
 */
public interface IProdService {

    List<Product> getAllProducts();
    void addProduct(Product prod);
    void delProduct(int id);
    List<Product> getProducts(int groupID);
}
