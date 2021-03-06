package capuli.dominino;
// Generated 20/09/2016 12:09:12 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Empresa generated by hbm2java
 */
@Entity
@Table(name="empresa"
    ,catalog="sgr"
)
public class Empresa  implements java.io.Serializable {


     private Integer idEmpresa;
     private String nombre;
     private String ruc;
     private String direccion;
     private String telefono;
//     private Set<Comensal> comensals = new HashSet<Comensal>(0);

    public Empresa() {
    }

    public Empresa(String nombre, String ruc, String direccion, String telefono/*, Set<Comensal> comensals*/) {
       this.nombre = nombre;
       this.ruc = ruc;
       this.direccion = direccion;
       this.telefono = telefono;
//       this.comensals = comensals;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="ID_EMPRESA", unique=true, nullable=false)
    public Integer getIdEmpresa() {
        return this.idEmpresa;
    }
    
    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    
    @Column(name="NOMBRE", length=300)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="RUC", length=11)
    public String getRuc() {
        return this.ruc;
    }
    
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    
    @Column(name="DIRECCION", length=300)
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    @Column(name="TELEFONO", length=10)
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

//@OneToMany(fetch=FetchType.LAZY, mappedBy="empresa")
//    public Set<Comensal> getComensals() {
//        return this.comensals;
//    }
//    
//    public void setComensals(Set<Comensal> comensals) {
//        this.comensals = comensals;
//    }
//



}


