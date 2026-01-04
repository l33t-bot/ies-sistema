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
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(usuarioService.login(request));
    }

}