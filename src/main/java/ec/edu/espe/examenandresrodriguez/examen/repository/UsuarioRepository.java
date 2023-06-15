package ec.edu.espe.examenandresrodriguez.examen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import ec.edu.espe.examenandresrodriguez.examen.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
    
    List<Usuario> findByMailLikeOrderByMail(String MailPattern);

    List<Usuario> findByVersionSocialLikeOrderByVersionSocial(String VersionPattern);
}
