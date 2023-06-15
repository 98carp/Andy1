package ec.edu.espe.examenandresrodriguez.examen.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "USUARIO")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COD_USUARIO", nullable = false)
    private Long cod_usario;
    @Column(name = "MAIL", length = 128, nullable = false)
    private String mail;
    @Column(name = "clave", length = 64, nullable = false)
    private String CLAVE;
    @Column(name = "nombre", length = 128, nullable = false)
    private String NOMBRE;
    @Column(name = "intentos_fallidos", precision = 8, scale = 0, nullable = false)
    private BigDecimal INTENTOS_FALLIDOS;
    @Column(name = "sueldo", precision = 8, scale = 2, nullable = false)
    private BigDecimal SUELDO;
    @Column(name = "fecha_nacimiento", nullable = false)
    private Date FECHA_NACIMIENTO;
    @Column(name = "version", nullable = false, length = 3)
    private Long VERSION;
    
    public Usuario(Long cod_usario) {
        this.cod_usario = cod_usario;
    }

    public Long getCod_usario() {
        return cod_usario;
    }

    public void setCod_usario(Long cod_usario) {
        this.cod_usario = cod_usario;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCLAVE() {
        return CLAVE;
    }

    public void setCLAVE(String cLAVE) {
        CLAVE = cLAVE;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String nOMBRE) {
        NOMBRE = nOMBRE;
    }

    public BigDecimal getINTENTOS_FALLIDOS() {
        return INTENTOS_FALLIDOS;
    }

    public void setINTENTOS_FALLIDOS(BigDecimal iNTENTOS_FALLIDOS) {
        INTENTOS_FALLIDOS = iNTENTOS_FALLIDOS;
    }

    public BigDecimal getSUELDO() {
        return SUELDO;
    }

    public void setSUELDO(BigDecimal sUELDO) {
        SUELDO = sUELDO;
    }

    public Date getFECHA_NACIMIENTO() {
        return FECHA_NACIMIENTO;
    }

    public void setFECHA_NACIMIENTO(Date fECHA_NACIMIENTO) {
        FECHA_NACIMIENTO = fECHA_NACIMIENTO;
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
        Usuario other = (Usuario) obj;
        if (cod_usario == null) {
            if (other.cod_usario != null)
                return false;
        } else if (!cod_usario.equals(other.cod_usario))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Usuario [cod_usario=" + cod_usario + "]";
    }

    


}
