package com.rorschach.pattern.facade.points;

/**
 * @author Rorschach
 * @date 2021-4-12 21:03
 */
public class FacadeService {

    private final DeviceService deviceService = new DeviceService();
    private final RoleService roleService = new RoleService();
    private final PermissionService permissionService = new PermissionService();

    public void enter(Gate gate) {
        if (deviceService.isUseful(gate)) {
            if (roleService.hasRole(gate)) {
                if (permissionService.hasPermission(gate)) {
                    System.out.println("人员进入大门");
                }
            }
        }
    }
}
