package UFOLEP_POLYTECH.Controller;

import UFOLEP_POLYTECH.Service.RoleService;
import UFOLEP_POLYTECH.Model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    // Ajouter un rôle à un utilisateur
    @PostMapping
    public String addRoleToUser(@RequestBody Role role) {
        return roleService.addRoleToUser(role);
    }

    // Obtenir le rôle d'un utilisateur
    @GetMapping("/{user_id}")
    public Role getRoleByUser(@PathVariable Long user_id) {
        return roleService.getRoleByUser(user_id);
    }
}
