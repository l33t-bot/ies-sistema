package ar.edu.ies.backend.infrastructure.security;

import java.security.Key;
import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
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
            
	public Claims extractClaims(String token) {
		
	    return Jwts.parserBuilder()
	            .setSigningKey(key)
	            .build()
	            .parseClaimsJws(token)
	            .getBody();
	}
}
