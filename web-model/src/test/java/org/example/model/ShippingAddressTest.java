package org.example.model;

import static org.junit.jupiter.api.Assertions.*;

class ShippingAddressTest {
    ShippingAddress shippingAddress;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
         shippingAddress = ShippingAddress.builder().shippingAddress("Some Address").build();
    }

    @org.junit.jupiter.api.Test
    void getShippingAddress() {
        assertEquals("Some Address",shippingAddress.getShippingAddress());
    }
}