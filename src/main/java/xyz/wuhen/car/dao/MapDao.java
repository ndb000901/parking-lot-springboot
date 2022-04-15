package xyz.wuhen.car.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.wuhen.car.entity.ParkingSpace;

import java.util.ArrayList;

@Mapper
public interface MapDao {
    ArrayList<ParkingSpace> selectAllSpace(int parkingLotId);


}
