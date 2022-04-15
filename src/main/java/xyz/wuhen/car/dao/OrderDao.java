package xyz.wuhen.car.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.wuhen.car.entity.Order;


@Mapper
public interface OrderDao {
    int createOrder(Order order);

    int endOrder(Order order);

    String getDateTime(String carId);
}
