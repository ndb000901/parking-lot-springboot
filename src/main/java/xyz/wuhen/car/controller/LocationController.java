package xyz.wuhen.car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import xyz.wuhen.car.entity.AjaxResult;
import xyz.wuhen.car.entity.Location;
import xyz.wuhen.car.service.RedisService;

@RestController
public class LocationController {
    @Autowired
    private RedisService redisService;


    // 设置位置
    @PutMapping("/api/location")
    public AjaxResult setLocation(@RequestBody Location location) {
        if(ObjectUtils.isEmpty(location)) {
            return new AjaxResult("500","操作失败");
        }
        redisService.setLocation(location);
        return new AjaxResult("200","操作成功");
    }

    // 获取位置
    @PostMapping("/api/location")
    public AjaxResult<Location> getLocation(@RequestBody String carId) {

        Location result = redisService.getLocation(carId);
        if(ObjectUtils.isEmpty(result)) {
            return new AjaxResult<>("200","操作成功",null);
        }
        return new AjaxResult<>("200","操作成功",result);
    }

}
