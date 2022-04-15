package xyz.wuhen.car.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.wuhen.car.dao.OrderDao;
import xyz.wuhen.car.entity.Order;
import xyz.wuhen.car.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public int createOrder(Order order) {
        return orderDao.createOrder(order);
    }

    @Override
    public int endOrder(Order order) {
        return orderDao.endOrder(order);
    }

    @Override
    public String getDateTime(String carId) {
        return orderDao.getDateTime(carId);
    }
}
