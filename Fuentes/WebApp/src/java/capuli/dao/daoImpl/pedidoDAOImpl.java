/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capuli.dao.daoImpl;

import capuli.dao.GenericDaoSpringHibernateTemplate;
import capuli.dao.PedidoDao;
import capuli.dominino.Pedido;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author daisy
 */
@Repository("PedidoDao")
public class pedidoDAOImpl extends GenericDaoSpringHibernateTemplate<Pedido, Integer> implements PedidoDao{
    
    
    @Autowired
    public pedidoDAOImpl(SessionFactory sessionFactory) {        
        super(Pedido.class);
        this.setSessionFactory(sessionFactory);
    }

    @Override
    public List<Pedido> findAll() throws Exception {
       return getHibernateTemplate().loadAll(Pedido.class); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pedido findById(Integer id) throws Exception {
        return getHibernateTemplate().get(Pedido.class, id); //To change body of generated methods, choose Tools | Templates.
    }
    
}
