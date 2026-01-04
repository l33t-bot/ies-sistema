package ar.edu.ies.backend.controller.admin;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ar.edu.ies.backend.controller.dto.CrearUsuarioRequest;
import ar.edu.ies.backend.model.Usuario;
import ar.edu.ies.backend.service.admin.AdminService;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin
public class AdminController {
	
	private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }
	
    // LISTAR USUARIOS
    @GetMapping("/usuarios")
    public List<Usuario> listarUsuarios() {
        return adminService.listarUsuarios();
    }
	
    // CREAR USUARIO (ADMIN)
    @PostMapping("/usuarios")
    public ResponseEntity<?> crearUsuario(
            @RequestBody CrearUsuarioRequest request
    ) {
        Usuario usuario = adminService.crearUsuario(request);

        return ResponseEntity.ok(
                "Usuario creado con ID: " + usuario.getIdUsuario()
        );
    }
}
