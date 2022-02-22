package com.example.springbootmaven.controllers;

import org.example.model.ShippingAddress;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShippingAdressController {
    @RequestMapping("/getAddress")
    public String returnAdress(){

        return ShippingAddress.builder().shippingAddress("Hello World Address!!!!!!!!").build().getShippingAddress();
    }
}
