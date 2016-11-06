/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capuli.dto;

/**
 *
 * @author daisy
 */
public class MenuDTO {
    
    
     private Integer idMenu;
     private String bebida;
     private String entrada;
     private String postre;
     private String segundo;
     private String tipoMenu;

    public MenuDTO() {
    }
     
     
     

    public MenuDTO(Integer idMenu, String bebida, String entrada, String postre, String segundo, String tipoMenu) {
        this.idMenu = idMenu;
        this.bebida = bebida;
        this.entrada = entrada;
        this.postre = postre;
        this.segundo = segundo;
        this.tipoMenu = tipoMenu;
    }
     
     
     
     
    public Integer getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Integer idMenu) {
        this.idMenu = idMenu;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getPostre() {
        return postre;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }

    public String getSegundo() {
        return segundo;
    }

    public void setSegundo(String segundo) {
        this.segundo = segundo;
    }

    public String getTipoMenu() {
        return tipoMenu;
    }

    public void setTipoMenu(String tipoMenu) {
        this.tipoMenu = tipoMenu;
    }
     
     
    
}
