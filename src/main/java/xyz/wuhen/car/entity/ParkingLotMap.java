package xyz.wuhen.car.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParkingLotMap {
    private ArrayList<ParkingSpace> parkingSpaces;
    private Location location;
}
