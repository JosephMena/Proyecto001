package capuli.dominino;
// Generated 20/09/2016 12:09:12 AM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ListNocturno generated by hbm2java
 */
@Entity
@Table(name="list_nocturno"
    ,catalog="sgr"
)
public class ListNocturno  implements java.io.Serializable {


     private Integer idList;
     private Comensal comensal;
     private Character ranchoFrio;
     private Character loncheraNocturna;
     private Date fecha;

    public ListNocturno() {
    }

	
    public ListNocturno(Comensal comensal) {
        this.comensal = comensal;
    }
    public ListNocturno(Comensal comensal, Character ranchoFrio, Character loncheraNocturna, Date fecha) {
       this.comensal = comensal;
       this.ranchoFrio = ranchoFrio;
       this.loncheraNocturna = loncheraNocturna;
       this.fecha = fecha;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="ID_LIST", unique=true, nullable=false)
    public Integer getIdList() {
        return this.idList;
    }
    
    public void setIdList(Integer idList) {
        this.idList = idList;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="COMENSALES_ID_COMENSAL", nullable=false)
    public Comensal getComensal() {
        return this.comensal;
    }
    
    public void setComensal(Comensal comensal) {
        this.comensal = comensal;
    }

    
    @Column(name="RANCHO_FRIO", length=1)
    public Character getRanchoFrio() {
        return this.ranchoFrio;
    }
    
    public void setRanchoFrio(Character ranchoFrio) {
        this.ranchoFrio = ranchoFrio;
    }

    
    @Column(name="LONCHERA_NOCTURNA", length=1)
    public Character getLoncheraNocturna() {
        return this.loncheraNocturna;
    }
    
    public void setLoncheraNocturna(Character loncheraNocturna) {
        this.loncheraNocturna = loncheraNocturna;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA", length=10)
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }




}


