/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averia.facades;

import averia.entities.TipoAveria;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author LaboratorioFISI
 */
@Stateless
public class TipoAveriaFacade extends AbstractFacade<TipoAveria> implements TipoAveriaFacadeLocal {

    @PersistenceContext(unitName = "Averia-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoAveriaFacade() {
        super(TipoAveria.class);
    }
    
}
