/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backend.basedatos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author jhoan
 */
@Embeddable
public class DetfacturaPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    private long idfactura;
    @Basic(optional = false)
    @NotNull
    private long idproducto;

    public DetfacturaPK() {
    }

    public DetfacturaPK(long idfactura, long idproducto) {
        this.idfactura = idfactura;
        this.idproducto = idproducto;
    }

    public long getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(long idfactura) {
        this.idfactura = idfactura;
    }

    public long getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(long idproducto) {
        this.idproducto = idproducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idfactura;
        hash += (int) idproducto;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetfacturaPK)) {
            return false;
        }
        DetfacturaPK other = (DetfacturaPK) object;
        if (this.idfactura != other.idfactura) {
            return false;
        }
        if (this.idproducto != other.idproducto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.backend.basedatos.DetfacturaPK[ idfactura=" + idfactura + ", idproducto=" + idproducto + " ]";
    }
    
}
