/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averia.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author LaboratorioFISI
 */
@Entity
@Table(name = "CRITICIDAD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Criticidad.findAll", query = "SELECT c FROM Criticidad c")
    , @NamedQuery(name = "Criticidad.findByIdCriticidad", query = "SELECT c FROM Criticidad c WHERE c.idCriticidad = :idCriticidad")
    , @NamedQuery(name = "Criticidad.findByDesCriticidad", query = "SELECT c FROM Criticidad c WHERE c.desCriticidad = :desCriticidad")})
public class Criticidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_CRITICIDAD")
    private Integer idCriticidad;
    @Column(name = "DES_CRITICIDAD")
    private String desCriticidad;
    @OneToMany(mappedBy = "idCriticidad")
    private List<TipoAveria> tipoAveriaList;

    public Criticidad() {
    }

    public Criticidad(Integer idCriticidad) {
        this.idCriticidad = idCriticidad;
    }

    public Integer getIdCriticidad() {
        return idCriticidad;
    }

    public void setIdCriticidad(Integer idCriticidad) {
        this.idCriticidad = idCriticidad;
    }

    public String getDesCriticidad() {
        return desCriticidad;
    }

    public void setDesCriticidad(String desCriticidad) {
        this.desCriticidad = desCriticidad;
    }

    @XmlTransient
    public List<TipoAveria> getTipoAveriaList() {
        return tipoAveriaList;
    }

    public void setTipoAveriaList(List<TipoAveria> tipoAveriaList) {
        this.tipoAveriaList = tipoAveriaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCriticidad != null ? idCriticidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Criticidad)) {
            return false;
        }
        Criticidad other = (Criticidad) object;
        if ((this.idCriticidad == null && other.idCriticidad != null) || (this.idCriticidad != null && !this.idCriticidad.equals(other.idCriticidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return    idCriticidad +","+desCriticidad ;
    }
    
}
