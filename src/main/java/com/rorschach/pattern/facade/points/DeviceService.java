package com.rorschach.pattern.facade.points;

/**
 * @author Rorschach
 * @date 2021-4-12 21:02
 */
public class DeviceService {

    public boolean isUseful(Gate gate) {
        System.out.println("大门" + gate.getName() + "状态正常");
        return true;
    }
}
