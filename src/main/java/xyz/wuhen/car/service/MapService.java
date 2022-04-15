package xyz.wuhen.car.service;

import xyz.wuhen.car.entity.ParkingSpace;

import java.util.ArrayList;

public interface MapService {
    ArrayList<ParkingSpace> selectAllSpace(int parkingLotId);
}
