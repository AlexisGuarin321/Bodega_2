/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alexis_guarin
 */
@Entity
@Table(name = "tipoPerfil")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoPerfil.findAll", query = "SELECT t FROM TipoPerfil t")
    , @NamedQuery(name = "TipoPerfil.findByIdTipoPerfil", query = "SELECT t FROM TipoPerfil t WHERE t.idTipoPerfil = :idTipoPerfil")
    , @NamedQuery(name = "TipoPerfil.findByNombre", query = "SELECT t FROM TipoPerfil t WHERE t.nombre = :nombre")})
public class TipoPerfil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTipoPerfil")
    private Integer idTipoPerfil;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Nombre")
    private String nombre;
    @JoinColumn(name = "idEstado", referencedColumnName = "idEstado")
    @ManyToOne(optional = false)
    private Estado idEstado;

    public TipoPerfil() {
    }

    public TipoPerfil(Integer idTipoPerfil) {
        this.idTipoPerfil = idTipoPerfil;
    }

    public TipoPerfil(Integer idTipoPerfil, String nombre) {
        this.idTipoPerfil = idTipoPerfil;
        this.nombre = nombre;
    }

    public Integer getIdTipoPerfil() {
        return idTipoPerfil;
    }

    public void setIdTipoPerfil(Integer idTipoPerfil) {
        this.idTipoPerfil = idTipoPerfil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estado getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Estado idEstado) {
        this.idEstado = idEstado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoPerfil != null ? idTipoPerfil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoPerfil)) {
            return false;
        }
        TipoPerfil other = (TipoPerfil) object;
        if ((this.idTipoPerfil == null && other.idTipoPerfil != null) || (this.idTipoPerfil != null && !this.idTipoPerfil.equals(other.idTipoPerfil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
