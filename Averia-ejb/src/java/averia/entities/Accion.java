/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averia.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LaboratorioFISI
 */
@Entity
@Table(name = "ACCION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Accion.findAll", query = "SELECT a FROM Accion a")
    , @NamedQuery(name = "Accion.findByIdAccion", query = "SELECT a FROM Accion a WHERE a.idAccion = :idAccion")
    , @NamedQuery(name = "Accion.findByDesAccion", query = "SELECT a FROM Accion a WHERE a.desAccion = :desAccion")
    , @NamedQuery(name = "Accion.findByFecAccion", query = "SELECT a FROM Accion a WHERE a.fecAccion = :fecAccion")
    , @NamedQuery(name = "Accion.findByFecRegistro", query = "SELECT a FROM Accion a WHERE a.fecRegistro = :fecRegistro")})
public class Accion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_ACCION")
    private Integer idAccion;
    @Column(name = "DES_ACCION")
    private String desAccion;
    @Column(name = "FEC_ACCION")
    @Temporal(TemporalType.DATE)
    private Date fecAccion;
    @Column(name = "FEC_REGISTRO")
    @Temporal(TemporalType.DATE)
    private Date fecRegistro;
    @JoinColumn(name = "ID_AVERIA", referencedColumnName = "ID_AVERIA")
    @ManyToOne
    private Averia idAveria;
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")
    @ManyToOne
    private Usuario idUsuario;

    public Accion() {
    }

    public Accion(Integer idAccion) {
        this.idAccion = idAccion;
    }

    public Integer getIdAccion() {
        return idAccion;
    }

    public void setIdAccion(Integer idAccion) {
        this.idAccion = idAccion;
    }

    public String getDesAccion() {
        return desAccion;
    }

    public void setDesAccion(String desAccion) {
        this.desAccion = desAccion;
    }

    public Date getFecAccion() {
        return fecAccion;
    }

    public void setFecAccion(Date fecAccion) {
        this.fecAccion = fecAccion;
    }

    public Date getFecRegistro() {
        return fecRegistro;
    }

    public void setFecRegistro(Date fecRegistro) {
        this.fecRegistro = fecRegistro;
    }

    public Averia getIdAveria() {
        return idAveria;
    }

    public void setIdAveria(Averia idAveria) {
        this.idAveria = idAveria;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAccion != null ? idAccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Accion)) {
            return false;
        }
        Accion other = (Accion) object;
        if ((this.idAccion == null && other.idAccion != null) || (this.idAccion != null && !this.idAccion.equals(other.idAccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "averia.entities.Accion[ idAccion=" + idAccion + " ]";
    }
    
}
