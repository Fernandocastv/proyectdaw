package pe.edu.cibertec.proyectdaw.model.bd;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Timer;

@Data
@Entity
@Table(name="usuario")
public class Usuario {

    @Id
    private String usuarioid;
    @Column(name="clave")
    private String clave;
    @Column(name="nomusuario")
    private String nomusuario;
    @Column(name="apeusuario")
    private String apeusuario;
    @Column(name="estado")
    private Boolean estado;
    @Column(name="ultimo_login")
    private Timestamp ultimologin;

    @ManyToOne
    @JoinColumn(name="rolid")
    private Rol rol;
}
