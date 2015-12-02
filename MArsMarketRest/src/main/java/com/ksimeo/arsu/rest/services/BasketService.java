package com.ksimeo.arsu.rest.services;

import com.ksimeo.arsu.core.models.Basket;
import com.ksimeo.arsu.rest.dao.BasketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ksimeo 13.10.2015.
 */
@Service
public class BasketService implements IBasketService {

    @Autowired
    private BasketRepository basketDao;

    public void addBasket(Basket basket) {
        basketDao.save(basket);
    }

    public List<Basket> getBaskets() {
        return (List<Basket>)basketDao.findAll();
    }

//    public static void main(String[] args) {
//        Basket testBasket = new Basket();
//        testBasket.setId(1);
//        testBasket.setName("Michel");
//        testBasket.setSurname("Jhonson");
//        testBasket.setEmail("ksimeo@gmail.com");
//        testBasket.setNumber("4");
//        BasketService bs = new BasketService();
//        bs.testSave(testBasket);
//    }

    private void testSave(Basket basket) {
        basketDao.save(basket);
    }
}