package ec.edu.espe.examenandresrodriguez.examen.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PERFIL")
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COD_PERFIL", nullable = false, length = 3)
    private Long cod_perfil;
    @Column(name = "nombre", length = 128, nullable = false)
    private String NOMBRE;
    @Column(name = "version", nullable = false, length = 3)
    private Long VERSION;
    public Perfil(Long cod_perfil) {
        this.cod_perfil = cod_perfil;
    }
    public Long getCod_perfil() {
        return cod_perfil;
    }
    public void setCod_perfil(Long cod_perfil) {
        this.cod_perfil = cod_perfil;
    }
    public String getNOMBRE() {
        return NOMBRE;
    }
    public void setNOMBRE(String nOMBRE) {
        NOMBRE = nOMBRE;
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
        Perfil other = (Perfil) obj;
        if (cod_perfil == null) {
            if (other.cod_perfil != null)
                return false;
        } else if (!cod_perfil.equals(other.cod_perfil))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Perfil [cod_perfil=" + cod_perfil + "]";
    }

}
