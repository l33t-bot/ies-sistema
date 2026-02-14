package ar.edu.ies.backend.controller;

import ar.edu.ies.backend.controller.dto.LoginRequest;
import ar.edu.ies.backend.controller.dto.LoginResponse;
import ar.edu.ies.backend.model.Usuario;
import ar.edu.ies.backend.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin // permite consumir desde WinForms / web
public class AuthController {

    private final UsuarioService usuarioService;

    public AuthController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {

        Usuario usuario = usuarioService.login(
                request.getUsuario(),
                request.getPassword()
        );

        if (usuario == null) {
            return ResponseEntity
                    .status(HttpStatus.UNAUTHORIZED)
                    .body("Usuario o contraseña incorrectos");
        }

        LoginResponse response = new LoginResponse(
                usuario.getIdUsuario(),
                usuario.getUsuario(),
                usuario.getRol().name()
        );

        return ResponseEntity.ok(response);
    }
}