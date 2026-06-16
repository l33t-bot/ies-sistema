package ar.edu.ies.backend.infrastructure.persistence.usuario;

import ar.edu.ies.backend.domain.usuario.Usuario;

public class UsuarioMapper {

	public static Usuario toDomain(UsuarioEntity entity) {

        if (entity == null) return null;

        return new Usuario(
                entity.getIdUsuario(),
                entity.getUsuario(),
                entity.getPasswordHash(),
                ar.edu.ies.backend.domain.usuario.Rol.valueOf(entity.getRol()),
                entity.getActivo()
        );
    }

    public static UsuarioEntity toEntity(Usuario domain) {

        if (domain == null) return null;

        UsuarioEntity entity = new UsuarioEntity();
        entity.setIdUsuario(domain.getIdUsuario());
        entity.setUsuario(domain.getUsername());
        entity.setPasswordHash(domain.getPassword());
        entity.setRol(domain.getRol().name());
        entity.setActivo(domain.getActivo());

        return entity;
    }
}
