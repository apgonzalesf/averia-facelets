/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averia.facades;

import averia.entities.Accion;
import averia.entities.Averia;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author LaboratorioFISI
 */
@Stateless
public class AveriaFacade extends AbstractFacade<Averia> implements AveriaFacadeLocal {

    @PersistenceContext(unitName = "Averia-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AveriaFacade() {
        super(Averia.class);
    }

    @Override
    public void create(Averia entity) {
        Accion accion = new Accion();
        accion.setDesAccion("REGISTRADO");
        accion.setFecAccion(entity.getFecRegistro());
        accion.setFecRegistro(entity.getFecRegistro());
        accion.setIdAveria(entity);
        accion.setIdUsuario(entity.getIdUsuario()); 
       
        if(entity.getAccionList()==null){
            entity.setAccionList(new ArrayList<Accion>());
        } 
        entity.getAccionList().add(accion); 
         entity.setIdEstado(1);
        super.create(entity);  
    }
    
    
    
}
