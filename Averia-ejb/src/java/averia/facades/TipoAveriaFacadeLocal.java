/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averia.facades;

import averia.entities.TipoAveria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author LaboratorioFISI
 */
@Local
public interface TipoAveriaFacadeLocal {

    void create(TipoAveria tipoAveria);

    void edit(TipoAveria tipoAveria);

    void remove(TipoAveria tipoAveria);

    TipoAveria find(Object id);

    List<TipoAveria> findAll();

    List<TipoAveria> findRange(int[] range);

    int count();
    
}
