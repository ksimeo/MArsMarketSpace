package com.ksimeo.arsu.admin.services;

import com.ksimeo.arsu.core.models.Basket;
import com.ksimeo.arsu.core.models.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Ksimeo 11.11.2015 20:23. Project: MArsMarketSpace.
 */

public class OrderServiceMock implements IOrderService {

    private List<Basket> baskets;

    public OrderServiceMock() {
        Map<Product, Integer> products = new HashMap<Product, Integer>();
        Product prod1 = new Product();
        prod1.setId(256);
        prod1.setModel("A321");
        prod1.setProducer("BOSH");
        prod1.setCountry("Болгария");
        prod1.setPrice(9.99d);
        Product prod2 = new Product();
        prod2.setId(34);
        prod2.setModel("B210");
        prod2.setProducer("PHILIPS");
        prod2.setCountry("Польша");
        prod2.setPrice(2.55);
        Map<Product, Integer> orders = new HashMap<Product, Integer>();
        orders.put(prod1, 1);
        orders.put(prod2, 2);
        baskets = new ArrayList<Basket>();
        baskets.add(new Basket(1, "Алексей", "Романов", "0957634546", "a.romanoff@ukr.net", orders));
        baskets.add(new Basket(2, "Андрей", "Иванов", "0957634546", "a.romanoff@ukr.net", orders));
        baskets.add(new Basket(3, "Иван", "Петров", "0957634546", "a.romanoff@ukr.net", orders));
        baskets.add(new Basket(4, "Николай", "Кириллов", "0957634546", "a.romanoff@ukr.net", orders));
        baskets.add(new Basket(5, "Евгений", "Сергеев", "0957634546", "a.romanoff@ukr.net", orders));
    }

    public List<Basket> getOrders(int from, int to) {
        return baskets;
    }

    public List<Basket> getNewOrders() {
        return baskets;
    }

    public List<Basket> getOrderPage(int page) {
        return baskets;
    }
}