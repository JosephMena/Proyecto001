/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capuli.servicio.serviceImpl;

//import capuli.dao.GenericDao;
import capuli.dao.ComensalDao;
import capuli.dao.MenuDao;
import capuli.dominino.Comensal;
import capuli.dominino.Menu;
import capuli.dominino.Pedido;
import capuli.dto.MenuDTO;
import capuli.servicio.ComensalService;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author daisy
 */
//@Transactional
@Service("comensalService")
public class ComensalServiceImpl implements ComensalService {

    @Autowired
    private ComensalDao comensalDao;

    @Autowired
    private MenuDao menuDao;

    public List<Comensal> listComensal() {
        try {
            return comensalDao.findAll();
//    return null;
        } catch (Exception ex) {
            Logger.getLogger(ComensalServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Menu> listMenu() {
        try {
            return menuDao.findAll();
//return null;
        } catch (Exception ex) {
            Logger.getLogger(ComensalServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void registrarUnPedido(Comensal comensal, Menu menu, Integer numMesa, Integer cantidad, Byte precioUnt, Byte precioTotal, Date fecha) {

        Pedido pedidoPublico = new Pedido(comensal, menu, numMesa, cantidad, precioUnt, precioTotal, fecha);

    }

    public Comensal findById(int id) {
        try {
            return comensalDao.findById(id);
        } catch (Exception ex) {
            Logger.getLogger(ComensalServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean isComensalExist(Comensal user) {

        return true;
    }

    public void saveComensal(Comensal user) {
        try {
            comensalDao.saveOrUpdate(user);
        } catch (Exception ex) {
            Logger.getLogger(ComensalServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteAllComensales() {
//       comensalDao.;
    }

    public void deleteComensalById(int id) {

        comensalDao.deleteComensalById(id);
//To change body of generated methods, choose Tools | Templates.
    }

    public void updateComensal(Comensal currentUser) {

        try {
            comensalDao.saveOrUpdate(currentUser);
            //To change body of generated methods, choose Tools | Templates.
        } catch (Exception ex) {
            Logger.getLogger(ComensalServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public MenuDTO getMenu(Integer id) {
        Menu menu = null;
        try {
            menu = menuDao.findById(id);
            MenuDTO aux = new MenuDTO(1, menu.getBebida().toString(),
                    menu.getPostre().toString(), "", "", "");
            return aux;
        } catch (Exception ex) {
            Logger.getLogger(ComensalServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean isMenuExist(Menu menu) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Menu aux = null;
        try {
            aux = menuDao.findById(menu.getIdMenu());
        } catch (Exception ex) {
            Logger.getLogger(ComensalServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (aux == null) {
            return false;
        }

        return true;
    }

    @Override
    public void saveMenu(Menu menu) {
        try {
            //        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            menuDao.save(menu);
        } catch (Exception ex) {
            Logger.getLogger(ComensalServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateMenu(Menu menu) {
        try {
            //        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            menuDao.saveOrUpdate(menu);
        } catch (Exception ex) {
            Logger.getLogger(ComensalServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteMenu(Integer idMenu) {
        try {
            //        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            menuDao.deleteMenuById(idMenu);
        } catch (Exception ex) {
            Logger.getLogger(ComensalServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
