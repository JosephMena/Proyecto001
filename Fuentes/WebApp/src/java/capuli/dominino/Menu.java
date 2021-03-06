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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Menu generated by hbm2java
 */
@Entity
@Table(name = "menu", catalog = "sgr"
)
public class Menu implements java.io.Serializable {

    private Integer idMenu;
    private Bebida bebida;
    private Entrada entrada;
    private Postre postre;
    private Segundo segundo;
    private TipoMenu tipoMenu;
//     private Set<Pedido> pedidos = new HashSet<Pedido>(0);

    public Menu() {
    }

    public Menu(TipoMenu tipoMenu) {
        this.tipoMenu = tipoMenu;
    }

    public Menu(Bebida bebida, Entrada entrada, Postre postre, Segundo segundo, TipoMenu tipoMenu) {
        this.bebida = bebida;
        this.entrada = entrada;
        this.postre = postre;
        this.segundo = segundo;
        this.tipoMenu = tipoMenu;
//       this.pedidos = pedidos;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "ID_MENU", unique = true, nullable = false)
    public Integer getIdMenu() {
        return this.idMenu;
    }

    public void setIdMenu(Integer idMenu) {
        this.idMenu = idMenu;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BEBIDA_ID_BEBIDA")
    public Bebida getBebida() {
        return this.bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ENTRADA_ID_ENTRADA")
    public Entrada getEntrada() {
        return this.entrada;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POSTRE_ID_POSTRE")
    public Postre getPostre() {
        return this.postre;
    }

    public void setPostre(Postre postre) {
        this.postre = postre;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SEGUNDO_ID_SEGUNDO")
    public Segundo getSegundo() {
        return this.segundo;
    }

    public void setSegundo(Segundo segundo) {
        this.segundo = segundo;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TIPO_MENU_ID_TIPO", nullable = false)
    public TipoMenu getTipoMenu() {
        return this.tipoMenu;
    }

    public void setTipoMenu(TipoMenu tipoMenu) {
        this.tipoMenu = tipoMenu;
    }
//
//@OneToMany(fetch=FetchType.LAZY, mappedBy="menu")
//    public Set<Pedido> getPedidos() {
//        return this.pedidos;
//    }
//    
//    public void setPedidos(Set<Pedido> pedidos) {
//        this.pedidos = pedidos;
//    }

    @Override
    public String toString() {
        return "Menu{" + bebida.toString() + entrada.toString() + postre.toString()
                + segundo.toString() + tipoMenu.toString() + '}';
    }

}
