/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backend.basedatos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p"),
    @NamedQuery(name = "Produto.findByIdproducto", query = "SELECT p FROM Produto p WHERE p.idproducto = :idproducto"),
    @NamedQuery(name = "Produto.findByProducto", query = "SELECT p FROM Produto p WHERE p.producto = :producto"),
    @NamedQuery(name = "Produto.findByExistecia", query = "SELECT p FROM Produto p WHERE p.existecia = :existecia"),
    @NamedQuery(name = "Produto.findByPrecio", query = "SELECT p FROM Produto p WHERE p.precio = :precio")})
public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Long idproducto;
    @Size(max = 100)
    private String producto;
    private Long existecia;
    private Long precio;
    @JoinColumn(name = "IDCLASEPROD", referencedColumnName = "IDCLASEPROD")
    @ManyToOne(fetch = FetchType.EAGER)
    private Claseproducto idclaseprod;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "produto", fetch = FetchType.EAGER)
    private List<Detfactura> detfacturaList;

    public Produto() {
    }

    public Produto(Long idproducto) {
        this.idproducto = idproducto;
    }

    public Long getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Long idproducto) {
        this.idproducto = idproducto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Long getExistecia() {
        return existecia;
    }

    public void setExistecia(Long existecia) {
        this.existecia = existecia;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public Claseproducto getIdclaseprod() {
        return idclaseprod;
    }

    public void setIdclaseprod(Claseproducto idclaseprod) {
        this.idclaseprod = idclaseprod;
    }

    @XmlTransient
    public List<Detfactura> getDetfacturaList() {
        return detfacturaList;
    }

    public void setDetfacturaList(List<Detfactura> detfacturaList) {
        this.detfacturaList = detfacturaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproducto != null ? idproducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.idproducto == null && other.idproducto != null) || (this.idproducto != null && !this.idproducto.equals(other.idproducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.backend.basedatos.Produto[ idproducto=" + idproducto + " ]";
    }
    
}
