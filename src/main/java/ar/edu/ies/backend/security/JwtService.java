package ar.edu.ies.backend.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;

@Service
public class JwtService {

    private static final String SECRET_KEY =
    		"clave_super_secreta_para_ies_backend_2025_segura_clave_larga_32_bytes";

    private final Key key = Keys.hmacShaKeyFor(SECRET_KEY.getBytes());

    public String generateToken(String username, String rol) {

        return Jwts.builder()
                .setSubject(username)
                .claim("rol", rol.toUpperCase())
                .setIssuedAt(new Date())
                .setExpiration(
                		new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 4)
                ) // 4 horas
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }
    
    public Key getKey() {
    	return key;
    }
}

