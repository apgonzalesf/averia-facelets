/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averia.facades;

import averia.entities.Criticidad;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author LaboratorioFISI
 */
@Stateless
public class CriticidadFacade extends AbstractFacade<Criticidad> implements CriticidadFacadeLocal {

    @PersistenceContext(unitName = "Averia-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CriticidadFacade() {
        super(Criticidad.class);
    }
    
}
