package xyz.wuhen.car.service;


import xyz.wuhen.car.entity.Order;

public interface OrderService {
    int createOrder(Order order);

    int endOrder(Order order);

    String getDateTime(String carId);
}
