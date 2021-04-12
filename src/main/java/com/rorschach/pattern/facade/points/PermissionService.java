package com.rorschach.pattern.facade.points;

/**
 * @author Rorschach
 * @date 2021-4-12 21:00
 */
public class PermissionService {

    public boolean hasPermission(Gate gate) {
        System.out.println("拥有大门" + gate.getName() + "权限");
        return true;
    }
}
