/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backend.basedatos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jhoan
 */
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Claseproducto.findAll", query = "SELECT c FROM Claseproducto c"),
    @NamedQuery(name = "Claseproducto.findByIdclaseprod", query = "SELECT c FROM Claseproducto c WHERE c.idclaseprod = :idclaseprod"),
    @NamedQuery(name = "Claseproducto.findByClaseproducto", query = "SELECT c FROM Claseproducto c WHERE c.claseproducto = :claseproducto")})
public class Claseproducto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Long idclaseprod;
    @Size(max = 100)
    private String claseproducto;
    @OneToMany(mappedBy = "idclaseprod", fetch = FetchType.EAGER)
    private List<Produto> produtoList;

    public Claseproducto() {
    }

    public Claseproducto(Long idclaseprod) {
        this.idclaseprod = idclaseprod;
    }

    public Long getIdclaseprod() {
        return idclaseprod;
    }

    public void setIdclaseprod(Long idclaseprod) {
        this.idclaseprod = idclaseprod;
    }

    public String getClaseproducto() {
        return claseproducto;
    }

    public void setClaseproducto(String claseproducto) {
        this.claseproducto = claseproducto;
    }

    @XmlTransient
    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public void setProdutoList(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idclaseprod != null ? idclaseprod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Claseproducto)) {
            return false;
        }
        Claseproducto other = (Claseproducto) object;
        if ((this.idclaseprod == null && other.idclaseprod != null) || (this.idclaseprod != null && !this.idclaseprod.equals(other.idclaseprod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.backend.basedatos.Claseproducto[ idclaseprod=" + idclaseprod + " ]";
    }
    
}
