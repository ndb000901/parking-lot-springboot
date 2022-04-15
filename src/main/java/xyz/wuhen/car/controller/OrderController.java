package xyz.wuhen.car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import xyz.wuhen.car.entity.AjaxResult;
import xyz.wuhen.car.entity.Order;
import xyz.wuhen.car.service.OrderService;
import xyz.wuhen.car.service.RedisService;

@RestController
public class OrderController {

    @Autowired
    private RedisService redisService;

    @Autowired
    private OrderService orderService;
    // 创建订单
    @PostMapping("/api/order")
    public AjaxResult CreateOrder(@RequestBody Order order) {
        if(ObjectUtils.isEmpty(order)) {
            return new AjaxResult("500","操作失败");
        }
        int result = orderService.createOrder(order);
        if(result == 1) {
            return new AjaxResult("200","操作成功");
        }
        return new AjaxResult("500","操作失败");

    }

    // 结束订单
    @PutMapping("/api/order")
    public AjaxResult endOrder(@RequestBody Order order) {
        if(ObjectUtils.isEmpty(order)) {
            return new AjaxResult("500","操作失败");
        }
        int result = orderService.endOrder(order);
        if(result == 1) {
            redisService.deleteLocation(order.getCarId());
            return new AjaxResult("200","操作成功");
        }
        return new AjaxResult("500","操作失败");
    }

    // 获取订单创建时间
    @PostMapping("/api/order/datetime")
    public AjaxResult<String> getDatetime(@RequestBody String carId) {
        String result = orderService.getDateTime(carId);
        return new AjaxResult("200","成功",result);
    }


}
