/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capuli.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.hibernate.criterion.DetachedCriteria;

/**
 *
 * @author daisy
 */
public interface GenericDao<T, E extends Serializable> {

    public void deleteAll(Collection<T> instances) throws Exception;

    public int bulkUpdate(String query) throws Exception;

    public E save(T instance) throws Exception;
//    public void saveOrUpdateAll(Collection<T> instances) throws Exception;

    public void saveOrUpdate(T instance) throws Exception;

    public void persist(T transientInstance) throws Exception;

    public void attachDirty(T instance) throws Exception;

    public void attachClean(T instance) throws Exception;

    public void delete(T persistentInstance) throws Exception;

    public List<T> findByExample(T instance) throws Exception;

    public List<T> findByQuery(String query) throws Exception;
//    public List<Map<String, Object>> findMapByQuery(String queryString) throws Exception;

    public List<T> findByCriteria(DetachedCriteria criteria) throws Exception;

    public T merge(T detachedInstance) throws Exception;

    public List<T> findAll() throws Exception;

    public T findById(E id) throws Exception;
}
