package xyz.wuhen.car.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import xyz.wuhen.car.entity.Location;
import xyz.wuhen.car.service.RedisService;

@Service
public class RedisServiceImpl implements RedisService {
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void setLocation(Location location) {
        redisTemplate.opsForValue().set(
                location.getCarId(),location.getCarId() + ";"
                        + location.getLocation() + ";" + location.getDirection()
        );
    }

    @Override
    public Location getLocation(String carId) {
        try {
            String result = redisTemplate.opsForValue().get(carId).toString();
            if(result == null) {
                return null;
            }
            System.out.println(result);
            String[] temp = result.split(";");
            return new Location(temp[0],Integer.valueOf(temp[1]),temp[2]);
        } catch (Exception ex) {
            return null;
        }


    }

    @Override
    public void deleteLocation(String carId) {
        redisTemplate.delete(carId);
    }
}
