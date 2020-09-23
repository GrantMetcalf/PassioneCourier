package com.PassioneCourier.group2.controller.Factory.unlabeled;

import com.PassioneCourier.group2.Entity.unlabeled.Destination;
import com.PassioneCourier.group2.Factory.unlabeled.DestinationFactory;
import org.junit.Assert;
import org.junit.Test;

public class DestinationFactoryTest {

    @Test
    public void createDestination() {
        Destination destination = DestinationFactory.createDestination("PennyTimbers", "Africa", "South Africa", 1623);
        Assert.assertEquals(destination,destination);
        //System.out.println("You have reached your " + destination);
    }
}

