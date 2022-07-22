package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CabInvoiceGeneratorTest {

    @Test
    public void whenGivenDistanceAndTimeShouldReturnTotalFare() {
        CabInvoiceGenerator fare = new CabInvoiceGenerator();
        Assertions.assertEquals(70, fare.calculateFare(5, 20), 0.000);
    }
}