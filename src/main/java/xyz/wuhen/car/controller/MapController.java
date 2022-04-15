package xyz.wuhen.car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import xyz.wuhen.car.entity.AjaxResult;
import xyz.wuhen.car.entity.ParkingSpace;
import xyz.wuhen.car.service.MapService;

import java.util.ArrayList;

@RestController
public class MapController {

    @Autowired
    private MapService mapService;

    //获取车位列表
    @GetMapping("/api/spaces/{id}")
    public AjaxResult<ArrayList<ParkingSpace>> getSpaces(@PathVariable int id) {
        ArrayList<ParkingSpace> result = new ArrayList<>();
        result = mapService.selectAllSpace(id);
        return new AjaxResult<ArrayList<ParkingSpace>>("200","操作成功",result);
    }


}
