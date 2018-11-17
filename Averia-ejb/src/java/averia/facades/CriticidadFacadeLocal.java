/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averia.facades;

import averia.entities.Criticidad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author LaboratorioFISI
 */
@Local
public interface CriticidadFacadeLocal {

    void create(Criticidad criticidad);

    void edit(Criticidad criticidad);

    void remove(Criticidad criticidad);

    Criticidad find(Object id);

    List<Criticidad> findAll();

    List<Criticidad> findRange(int[] range);

    int count();
    
}
