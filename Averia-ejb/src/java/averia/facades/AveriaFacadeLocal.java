/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averia.facades;

import averia.entities.Averia;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author LaboratorioFISI
 */
@Local
public interface AveriaFacadeLocal {

    void create(Averia averia);

    void edit(Averia averia);

    void remove(Averia averia);

    Averia find(Object id);

    List<Averia> findAll();

    List<Averia> findRange(int[] range);

    int count();
    
}
