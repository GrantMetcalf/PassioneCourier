package com.PassioneCourier.group2.controller.service.unlabeled.implementation;

import com.PassioneCourier.group2.Entity.unlabeled.Route;
import com.PassioneCourier.group2.Factory.unlabeled.RouteFactory;
import com.PassioneCourier.group2.service.unlabeled.implementation.RouteService;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import com.PassioneCourier.group2.service.unlabeled.RouteServiceInterface;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RouteServiceTest {

    private static RouteServiceInterface service = RouteService.getServiceInterface();
    private Route r = RouteFactory.createRoute(5, 55,1,2,15,7);

    @Test
    public void a_create() {
        Route created = service.create(r);
        Assert.assertEquals(r.getRoute_id(), created.getRoute_id());
        System.out.println("Created : " + created);
    }

    @Test
    public void b_read() {
        Route r1 = service.read(r.getRoute_id());
        System.out.println("Read: " + r1);
    }

    @Test
    public void c_update() {
        Route update = new Route.Builder().copy(r).setRoute_id(20).build();
        update = service.update(update);
        System.out.println("Updated: " + update);
    }

    @Test
    public void e_delete() {
        service.delete(r.getRoute_id());
        System.out.println("Deleted: " + r.getRoute_id() + ", " + r.getPrice() + ", " + r.getDays());
    }

    @Test
    public void d_getAll() {
        Set<Route> r = service.getAll();
        assertEquals(1, r.size());
        System.out.println("All products: " + r);
    }
}