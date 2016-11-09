package capuli.dao.daoImpl;

//import capuli.dao.GenericDao;
import capuli.dao.ComensalDao;
import capuli.dao.GenericDaoSpringHibernateTemplate;
import capuli.dominino.Comensal;
import capuli.dominino.Menu;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Repository;

@Repository("comensalDao")
public class ComensalDAOImpl extends GenericDaoSpringHibernateTemplate<Comensal, Integer> implements ComensalDao{
    
    @Autowired
    public ComensalDAOImpl(SessionFactory sessionFactory) {
        super(Comensal.class);
        this.setSessionFactory(sessionFactory);
    }

    @Override
    public List<Comensal> findAll() throws Exception {
       return getHibernateTemplate().loadAll(Comensal.class); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Comensal findById(Integer id) throws Exception {
        return getHibernateTemplate().get(Comensal.class, id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteComensalById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
