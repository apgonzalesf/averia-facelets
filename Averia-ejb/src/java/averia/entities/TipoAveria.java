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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "TIPO_AVERIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoAveria.findAll", query = "SELECT t FROM TipoAveria t")
    , @NamedQuery(name = "TipoAveria.findByIdTipo", query = "SELECT t FROM TipoAveria t WHERE t.idTipo = :idTipo")
    , @NamedQuery(name = "TipoAveria.findByDesTipo", query = "SELECT t FROM TipoAveria t WHERE t.desTipo = :desTipo")})
public class TipoAveria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_TIPO")
    private Integer idTipo;
    @Column(name = "DES_TIPO")
    private String desTipo;
    @JoinColumn(name = "ID_CRITICIDAD", referencedColumnName = "ID_CRITICIDAD")
    @ManyToOne
    private Criticidad idCriticidad;
    @OneToMany(mappedBy = "idTipo")
    private List<Averia> averiaList;

    public TipoAveria() {
    }

    public TipoAveria(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public Integer getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public String getDesTipo() {
        return desTipo;
    }

    public void setDesTipo(String desTipo) {
        this.desTipo = desTipo;
    }

    public Criticidad getIdCriticidad() {
        return idCriticidad;
    }

    public void setIdCriticidad(Criticidad idCriticidad) {
        this.idCriticidad = idCriticidad;
    }

    @XmlTransient
    public List<Averia> getAveriaList() {
        return averiaList;
    }

    public void setAveriaList(List<Averia> averiaList) {
        this.averiaList = averiaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipo != null ? idTipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoAveria)) {
            return false;
        }
        TipoAveria other = (TipoAveria) object;
        if ((this.idTipo == null && other.idTipo != null) || (this.idTipo != null && !this.idTipo.equals(other.idTipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return    idTipo + ","+desTipo;
    }
    
}
