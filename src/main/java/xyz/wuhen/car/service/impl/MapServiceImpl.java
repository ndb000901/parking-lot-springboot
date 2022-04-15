package xyz.wuhen.car.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.wuhen.car.dao.MapDao;
import xyz.wuhen.car.entity.ParkingSpace;
import xyz.wuhen.car.service.MapService;

import java.util.ArrayList;

@Service
public class MapServiceImpl implements MapService {

    @Autowired
    private MapDao mapDao;

    @Override
    public ArrayList<ParkingSpace> selectAllSpace(int parkingLotId) {
        return mapDao.selectAllSpace(parkingLotId);
    }
}
