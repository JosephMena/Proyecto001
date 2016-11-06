/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capuli.dao.daoImpl;

//import capuli.dao.GenericDao;
import capuli.dao.GenericDaoSpringHibernateTemplate;
import capuli.dao.MenuDao;
import capuli.dominino.Menu;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author daisy
 */
@Repository("menuDao")
public class MenuDAOImpl extends GenericDaoSpringHibernateTemplate<Menu, Integer> implements MenuDao {

    @Autowired
    public MenuDAOImpl(SessionFactory sessionFactory) {
        super(Menu.class);
        this.setSessionFactory(sessionFactory);
    }

    @Override
    public List<Menu> findAll() throws Exception {
        return getHibernateTemplate().loadAll(Menu.class); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Menu findById(Integer id) throws Exception {
        return getHibernateTemplate().get(Menu.class, id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteMenuById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
