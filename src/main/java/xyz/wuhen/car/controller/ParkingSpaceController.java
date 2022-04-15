package xyz.wuhen.car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import xyz.wuhen.car.entity.AjaxResult;
import xyz.wuhen.car.entity.ParkingSpace;
import xyz.wuhen.car.service.ParkingSpaceService;

@RestController
public class ParkingSpaceController {
    @Autowired
    private ParkingSpaceService parkingSpaceService;

    // 获取空闲车位数量
    @GetMapping("/api/space/valid/{id}")
    public AjaxResult getValidSpace(@PathVariable int id) {
        int result = parkingSpaceService.countValidParkingSpace(id);
        return new AjaxResult("200","操作成功",result);
    }

    // 获取占用车位数量
    @GetMapping("/api/space/invalid/{id}")
    public AjaxResult getInvalidSpace(@PathVariable int id) {
        int result = parkingSpaceService.countInValidParkingSpace(id);
        return new AjaxResult("200","操作成功",result);
    }

    // 修改车位状态
    @PutMapping("/api/space")
    public AjaxResult setSpace(@RequestBody ParkingSpace space) {
        if(ObjectUtils.isEmpty(space)) {
            return new AjaxResult("500","操作失败");
        }
        int result = parkingSpaceService.setParkingSpaceStatus(space);
        if(result == 1) {
            return new AjaxResult("200","操作成功");
        }
        return new AjaxResult("500","操作失败");
    }



}
