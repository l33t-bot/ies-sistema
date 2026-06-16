package ar.edu.ies.backend.infrastructure.controller;

import ar.edu.ies.backend.application.auth.LoginUseCase;
import ar.edu.ies.backend.application.auth.LoginResult;
import ar.edu.ies.backend.controller.dto.LoginRequest;
import ar.edu.ies.backend.infrastructure.controller.dto.LoginResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final LoginUseCase loginUseCase;

    public AuthController(LoginUseCase loginUseCase) {
        this.loginUseCase = loginUseCase;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(
            @RequestBody LoginRequest request) {

        LoginResult result =
                loginUseCase.ejecutar(
                        request.getUsuario(),
                        request.getPassword()
                );

        LoginResponse response = new LoginResponse(
                result.getIdUsuario(),
                result.getUsername(),
                result.getRol().name(),
                result.getToken()
        );

        return ResponseEntity.ok(response);
    }
}