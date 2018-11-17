/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averia.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author LaboratorioFISI
 */
@Entity
@Table(name = "AVERIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Averia.findAll", query = "SELECT a FROM Averia a")
    , @NamedQuery(name = "Averia.findByIdAveria", query = "SELECT a FROM Averia a WHERE a.idAveria = :idAveria")
    , @NamedQuery(name = "Averia.findByDesAveria", query = "SELECT a FROM Averia a WHERE a.desAveria = :desAveria")
    , @NamedQuery(name = "Averia.findByIdEstado", query = "SELECT a FROM Averia a WHERE a.idEstado = :idEstado")
    , @NamedQuery(name = "Averia.findByIdUltAccion", query = "SELECT a FROM Averia a WHERE a.idUltAccion = :idUltAccion")
    , @NamedQuery(name = "Averia.findByIdAccionRegistro", query = "SELECT a FROM Averia a WHERE a.idAccionRegistro = :idAccionRegistro")
    , @NamedQuery(name = "Averia.findByIdAccionAnulacion", query = "SELECT a FROM Averia a WHERE a.idAccionAnulacion = :idAccionAnulacion")
    , @NamedQuery(name = "Averia.findByFecRegistro", query = "SELECT a FROM Averia a WHERE a.fecRegistro = :fecRegistro")})
public class Averia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_AVERIA")
    private Integer idAveria;
    @Column(name = "DES_AVERIA")
    private String desAveria;
    @Column(name = "ID_ESTADO")
    private Integer idEstado;
    @Column(name = "ID_ULT_ACCION")
    private Integer idUltAccion;
    @Column(name = "ID_ACCION_REGISTRO")
    private Integer idAccionRegistro;
    @Column(name = "ID_ACCION_ANULACION")
    private Integer idAccionAnulacion;
    @Column(name = "FEC_REGISTRO")
    @Temporal(TemporalType.DATE)
    private Date fecRegistro;
    @OneToMany(mappedBy = "idAveria", cascade = CascadeType.PERSIST)
    private List<Accion> accionList;
    @JoinColumn(name = "ID_EQUIPO", referencedColumnName = "ID_EQUIPO")
    @ManyToOne
    private Equipo idEquipo;
    @JoinColumn(name = "ID_TIPO", referencedColumnName = "ID_TIPO")
    @ManyToOne
    private TipoAveria idTipo;
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")
    @ManyToOne
    private Usuario idUsuario;

    public Averia() {
    }

    public Averia(Integer idAveria) {
        this.idAveria = idAveria;
    }

    public Integer getIdAveria() {
        return idAveria;
    }

    public void setIdAveria(Integer idAveria) {
        this.idAveria = idAveria;
    }

    public String getDesAveria() {
        return desAveria;
    }

    public void setDesAveria(String desAveria) {
        this.desAveria = desAveria;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public Integer getIdUltAccion() {
        return idUltAccion;
    }

    public void setIdUltAccion(Integer idUltAccion) {
        this.idUltAccion = idUltAccion;
    }

    public Integer getIdAccionRegistro() {
        return idAccionRegistro;
    }

    public void setIdAccionRegistro(Integer idAccionRegistro) {
        this.idAccionRegistro = idAccionRegistro;
    }

    public Integer getIdAccionAnulacion() {
        return idAccionAnulacion;
    }

    public void setIdAccionAnulacion(Integer idAccionAnulacion) {
        this.idAccionAnulacion = idAccionAnulacion;
    }

    public Date getFecRegistro() {
        return fecRegistro;
    }

    public void setFecRegistro(Date fecRegistro) {
        this.fecRegistro = fecRegistro;
    }

    @XmlTransient
    public List<Accion> getAccionList() {
        return accionList;
    }

    public void setAccionList(List<Accion> accionList) {
        this.accionList = accionList;
    }

    public Equipo getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Equipo idEquipo) {
        this.idEquipo = idEquipo;
    }

    public TipoAveria getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(TipoAveria idTipo) {
        this.idTipo = idTipo;
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
        hash += (idAveria != null ? idAveria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Averia)) {
            return false;
        }
        Averia other = (Averia) object;
        if ((this.idAveria == null && other.idAveria != null) || (this.idAveria != null && !this.idAveria.equals(other.idAveria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "averia.entities.Averia[ idAveria=" + idAveria + " ]";
    }
    
}
