package xyz.wuhen.car.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParkingSpace {
    private String parkingLotName;
    private int parkingLotId;
    private int areaId;
    private int parkingSpaceId;
    private int valid;
}
