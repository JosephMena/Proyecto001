/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capuli.dao;


/**
 *
 * @author daisy
 */
public interface ComensalDao extends GenericDao<capuli.dominino.Comensal , Integer> {

    public void deleteComensalById(int id);

}
