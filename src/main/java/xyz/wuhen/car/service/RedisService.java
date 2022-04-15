package xyz.wuhen.car.service;

import xyz.wuhen.car.entity.Location;

public interface RedisService {
    void setLocation(Location location);
    Location getLocation(String carId);
    void deleteLocation(String carId);

}
