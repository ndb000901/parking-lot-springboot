package xyz.wuhen.car.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.wuhen.car.entity.ParkingSpace;

@Mapper
public interface ParkingSpaceDao {
    int countValidParkingSpace(int parkingLotId);

    int countInValidParkingSpace(int parkingLotId);

    int setParkingSpaceStatus(ParkingSpace space);
}
