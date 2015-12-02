package com.ksimeo.arsu.rest.services;

import com.ksimeo.arsu.core.models.Basket;

import java.util.List;

/**
 * @author Ksimeo 12.10.2015.
 */
public interface IBasketService {

    void addBasket(Basket basket);
    List<Basket> getBaskets();
}
