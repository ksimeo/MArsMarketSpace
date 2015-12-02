package com.ksimeo.arsu.rest.dao;

import com.ksimeo.arsu.core.models.Basket;

import java.util.List;

/**
 * @author Ksimeo 12.10.2015.
 */
public interface IBasketDao  {

    void save(Basket basket);
    List<Basket> findAll();
}