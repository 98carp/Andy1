package ec.edu.espe.examenandresrodriguez.examen.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "USUARIOPERFIL")
public class UsuarioPerfil {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COD_USUARIO", nullable = false)
    private Long cod_usario;
    @Column(name = "COD_PERFIL", nullable = false, length = 3)
    private Long cod_perfil;
    @Column(name = "FECHA_CREACION", length = 128, nullable = false)
    private String fecha_creacion;
    @Column(name = "ES_ACTIVO", length = 64, nullable = false)
    private String es_activo;
    @Column(name = "version", nullable = false, length = 3)
    private Long VERSION;
    
    public UsuarioPerfil(Long cod_usario, Long cod_perfil) {
        this.cod_usario = cod_usario;
        this.cod_perfil = cod_perfil;
    }

    public Long getCod_usario() {
        return cod_usario;
    }

    public void setCod_usario(Long cod_usario) {
        this.cod_usario = cod_usario;
    }

    public Long getCod_perfil() {
        return cod_perfil;
    }

    public void setCod_perfil(Long cod_perfil) {
        this.cod_perfil = cod_perfil;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getEs_activo() {
        return es_activo;
    }

    public void setEs_activo(String es_activo) {
        this.es_activo = es_activo;
    }

    public Long getVERSION() {
        return VERSION;
    }

    public void setVERSION(Long vERSION) {
        VERSION = vERSION;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cod_usario == null) ? 0 : cod_usario.hashCode());
        result = prime * result + ((cod_perfil == null) ? 0 : cod_perfil.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UsuarioPerfil other = (UsuarioPerfil) obj;
        if (cod_usario == null) {
            if (other.cod_usario != null)
                return false;
        } else if (!cod_usario.equals(other.cod_usario))
            return false;
        if (cod_perfil == null) {
            if (other.cod_perfil != null)
                return false;
        } else if (!cod_perfil.equals(other.cod_perfil))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "UsuarioPerfil [cod_usario=" + cod_usario + ", cod_perfil=" + cod_perfil + "]";
    } 
    
    
}
