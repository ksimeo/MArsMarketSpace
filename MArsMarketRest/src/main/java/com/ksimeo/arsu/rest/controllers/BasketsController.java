package com.ksimeo.arsu.rest.controllers;

import com.ksimeo.arsu.core.models.Basket;
import com.ksimeo.arsu.rest.services.IBasketService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Ksimeo 12.10.2015.
 */
@Controller
public class BasketsController {
    IBasketService basketService;

    @RequestMapping(value = "newbasket", method = RequestMethod.POST)
    @ResponseBody
    public void addNewBasket(@RequestBody Basket basket) {
        basketService.addBasket(basket);
    }

    @RequestMapping(value = "getallbaskets", method = RequestMethod.GET)
    @ResponseBody
    public List<Basket> getAllBaskets() {
        return basketService.getBaskets();
    }
}