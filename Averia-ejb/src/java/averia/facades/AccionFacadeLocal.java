/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averia.facades;

import averia.entities.Accion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author LaboratorioFISI
 */
@Local
public interface AccionFacadeLocal {

    void create(Accion accion);

    void edit(Accion accion);

    void remove(Accion accion);

    Accion find(Object id);

    List<Accion> findAll();

    List<Accion> findRange(int[] range);

    int count();
    
}
