package xyz.wuhen.car.service;

import xyz.wuhen.car.entity.ParkingSpace;


public interface ParkingSpaceService {
    int countValidParkingSpace(int parkingLotId);

    int countInValidParkingSpace(int parkingLotId);

    int setParkingSpaceStatus(ParkingSpace space);
}
