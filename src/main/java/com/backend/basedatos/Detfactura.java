/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backend.basedatos;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jhoan
 */
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detfactura.findAll", query = "SELECT d FROM Detfactura d"),
    @NamedQuery(name = "Detfactura.findByIdfactura", query = "SELECT d FROM Detfactura d WHERE d.detfacturaPK.idfactura = :idfactura"),
    @NamedQuery(name = "Detfactura.findByIdproducto", query = "SELECT d FROM Detfactura d WHERE d.detfacturaPK.idproducto = :idproducto"),
    @NamedQuery(name = "Detfactura.findByCantidad", query = "SELECT d FROM Detfactura d WHERE d.cantidad = :cantidad"),
    @NamedQuery(name = "Detfactura.findByPrecio", query = "SELECT d FROM Detfactura d WHERE d.precio = :precio")})
public class Detfactura implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetfacturaPK detfacturaPK;
    private Long cantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal precio;
    @JoinColumn(name = "IDFACTURA", referencedColumnName = "IDFACTURA", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Factura factura;
    @JoinColumn(name = "IDPRODUCTO", referencedColumnName = "IDPRODUCTO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Produto produto;

    public Detfactura() {
    }

    public Detfactura(DetfacturaPK detfacturaPK) {
        this.detfacturaPK = detfacturaPK;
    }

    public Detfactura(long idfactura, long idproducto) {
        this.detfacturaPK = new DetfacturaPK(idfactura, idproducto);
    }

    public DetfacturaPK getDetfacturaPK() {
        return detfacturaPK;
    }

    public void setDetfacturaPK(DetfacturaPK detfacturaPK) {
        this.detfacturaPK = detfacturaPK;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detfacturaPK != null ? detfacturaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detfactura)) {
            return false;
        }
        Detfactura other = (Detfactura) object;
        if ((this.detfacturaPK == null && other.detfacturaPK != null) || (this.detfacturaPK != null && !this.detfacturaPK.equals(other.detfacturaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.backend.basedatos.Detfactura[ detfacturaPK=" + detfacturaPK + " ]";
    }
    
}
