package com.PassioneCourier.group2.Factory.unlabeled;

import com.PassioneCourier.group2.Entity.unlabeled.Route;

public class RouteFactory {

    public static Route createRoute(int route_id, int product_id, int from_location_id,
                                    int to_location_id, int price, int days){
        Route route = new Route.Builder()
                .setRoute_id(route_id)
                .setProduct_id(product_id)
                .setFromLocation_id(from_location_id)
                .setToLocation_id(to_location_id)
                .setPrice(price)
                .setDays(days)
                .build();
        return route;
    }
}
