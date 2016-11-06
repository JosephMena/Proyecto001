/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capuli.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 *
 * @author daisy
 */
public abstract class GenericDaoSpringHibernateTemplate<T, E extends Serializable> extends HibernateDaoSupport
        implements GenericDao<T, E> {

    /**
     * persistence type
     */
    private Class<T> type;

    public GenericDaoSpringHibernateTemplate(
            Class<T> type) {
        this.type = type;
    }

    public Class<T> getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(Class<T> type) {
        this.type = type;
    }

    @Override
    public void deleteAll(final Collection<T> instances) throws Exception {
        try {
            getHibernateTemplate().deleteAll(instances);
        } catch (final Exception e) {
            throw e;
        }
    }

    @Override
    public int bulkUpdate(final String query) throws Exception {
        try {
            return getHibernateTemplate().bulkUpdate(query);
        } catch (final Exception e) {
            throw e;
        }
    }

    @Override
    public E save(final T instance) throws Exception {
        try {
            return (E) getHibernateTemplate().save(instance);
        } catch (final Exception e) {
            throw e;
        }
    }

    @Override
    public void saveOrUpdate(final T instance) throws Exception {
        try {
            getHibernateTemplate().saveOrUpdate(instance);
        } catch (final Exception e) {
            throw e;
        }
    }

    @Override
    public void persist(final T transientInstance) throws Exception {
        try {
            getHibernateTemplate().persist(transientInstance);
        } catch (final Exception e) {
            throw e;
        }
    }

    @Override
    public void attachDirty(final T instance) throws Exception {
        try {
            getHibernateTemplate().saveOrUpdate(instance);
        } catch (final Exception e) {
            throw e;
        }
    }

    @Override
    public void attachClean(final T instance) throws Exception {
        try {
            getHibernateTemplate().lock(instance, LockMode.NONE);
        } catch (final Exception e) {
            throw e;
        }
    }

    @Override
    public void delete(final T persistentInstance) throws Exception {
        try {
            getHibernateTemplate().delete(persistentInstance);
        } catch (final Exception e) {
            throw e;
        }
    }

    @Override
    public T merge(final T detachedInstance) throws Exception {
        try {
            final T result = getHibernateTemplate().merge(detachedInstance);
            return result;
        } catch (final Exception e) {
            throw e;
        }
    }

    @Override
    public List<T> findByExample(final T instance) throws Exception {
        try {
            final List<T> results = (List<T>) getHibernateTemplate().findByExample(instance);
            return results;
        } catch (final Exception e) {
            throw e;
        }
    }

    @Override
    public List<T> findByQuery(final String queryString) throws Exception {
        try {
            final List<T> results = (List<T>) getHibernateTemplate().find(queryString);
            return results;
        } catch (final Exception e) {
            throw e;
        }
    }
//    public List<Map<String, Object>> findMapByQuery(final String queryString) throws Exception {
//        try {
//            final List<Map<String, Object>> results = getHibernateTemplate().find(queryString);
//            return results;
//        } catch (final Exception e) {
//            throw e;
//        }
//    }

    @Override
    public List<T> findByCriteria(final DetachedCriteria criteria) throws Exception {
        try {
            return (List<T>) getHibernateTemplate().findByCriteria(criteria);
        } catch (final Exception e) {
            throw e;
        }
    }

    public abstract List<T> findAll() throws Exception;

    public abstract T findById(E id) throws Exception;
}
