package com.PassioneCourier.group2.controller.Factory.unlabeled;

import com.PassioneCourier.group2.Entity.unlabeled.Route;
import com.PassioneCourier.group2.Factory.unlabeled.RouteFactory;
import org.junit.Test;

public class RouteFactoryTest {

    @Test
    public void createRoute() {
        Route r = RouteFactory.createRoute(1, 555, 7, 8, 50, 9);
        System.out.println("CREATED: " + r);
    }
}