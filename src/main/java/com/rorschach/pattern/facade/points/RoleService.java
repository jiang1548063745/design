package com.rorschach.pattern.facade.points;

/**
 * @author Rorschach
 * @date 2021-4-12 21:01
 */
public class RoleService {

    public boolean hasRole(Gate gate) {
        System.out.println("拥有大门" + gate.getName() + "所需角色");
        return true;
    }
}
