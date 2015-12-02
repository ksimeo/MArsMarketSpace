package com.ksimeo.arsu.rest.dao;

import com.ksimeo.arsu.core.models.Basket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Ksimeo 13.10.2015.
 */
@Repository
public interface BasketRepository extends CrudRepository<Basket, Integer> { }