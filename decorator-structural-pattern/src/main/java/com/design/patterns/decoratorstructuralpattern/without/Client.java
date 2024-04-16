package com.design.patterns.decoratorstructuralpattern.without;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<IOrder> orders = new ArrayList<IOrder>();

        IOrder carOrder = new CarOrder(500);
        IOrder hotelOrder = new HotelOrder(1000);
        IOrder travelOrder = new TravelOrder(800);

        IOrder hotelCarOrder = new HotelCarOrder(1500);
        IOrder travelHotelOrder = new TravelHotelOrder(1800);
        IOrder travelCarOrder = new TravelCarPackageOrder(1300);
        IOrder travelCarHotelOrder = new CarHotelTravelOrder(2300);

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
