package com.design.patterns.decoratorstructuralpattern.with;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<IOrder> orders = new ArrayList<IOrder>();

        IOrder carOrder = new CarOrder(500);
        IOrder hotelOrder = new HotelOrder(1000);
        IOrder travelOrder = new TravelOrder(800);

        IOrder hotelCarOrder = new CarDecorator(500, hotelOrder);
        IOrder travelHotelOrder = new HotelDecorator(1000, travelOrder);
        IOrder travelCarOrder = new TravelDecorator(800, carOrder);
        IOrder travelCarHotelOrder = new TravelDecorator(800, new HotelDecorator(1000, carOrder));

        orders.add(carOrder);
        orders.add(hotelOrder);
        orders.add(travelOrder);
        orders.add(hotelCarOrder);
        orders.add(travelHotelOrder);
        orders.add(travelCarOrder);
        orders.add(travelCarHotelOrder);

        orders.stream().forEach(
                order -> System.out.println(order + " - " + order.getPrice())
        );
    }

}
