package ec.edu.espe.examenandresrodriguez.examen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.examenandresrodriguez.examen.model.UsuarioPerfil;

public interface UsuarioPerfilRepository extends JpaRepository<UsuarioPerfil, String> {
    
        List<UsuarioPerfil> findByEs_ActivoLikeOrderByNombre(String Es_ActivoPattern);

    List<UsuarioPerfil> findByVersionSocialLikeOrderByVersionSocial(String VersionPattern);
}
