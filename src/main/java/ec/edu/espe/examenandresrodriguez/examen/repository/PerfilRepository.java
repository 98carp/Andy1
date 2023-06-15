package ec.edu.espe.examenandresrodriguez.examen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.examenandresrodriguez.examen.model.Perfil;

public interface PerfilRepository extends JpaRepository<Perfil, String> {
    
    List<Perfil> findByNombreLikeOrderByNombre(String NombrePattern);

    List<Perfil> findByVersionSocialLikeOrderByVersionSocial(String VersionPattern);

}
