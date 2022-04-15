package xyz.wuhen.car.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.wuhen.car.dao.ParkingSpaceDao;
import xyz.wuhen.car.entity.ParkingSpace;
import xyz.wuhen.car.service.ParkingSpaceService;

@Service
public class ParkingSpaceServiceImpl implements ParkingSpaceService {
    @Autowired
    private ParkingSpaceDao parkingSpaceDao;

    @Override
    public int countValidParkingSpace(int parkingLotId) {
        return parkingSpaceDao.countValidParkingSpace(parkingLotId);
    }

    @Override
    public int countInValidParkingSpace(int parkingLotId) {
        return parkingSpaceDao.countInValidParkingSpace(parkingLotId);
    }

    @Override
    public int setParkingSpaceStatus(ParkingSpace space) {
        return parkingSpaceDao.setParkingSpaceStatus(space);
    }
}
