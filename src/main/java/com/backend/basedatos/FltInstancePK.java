/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backend.basedatos;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author jhoan
 */
@Embeddable
public class FltInstancePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "FLT#")
    private BigInteger flt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_FLT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFlt;

    public FltInstancePK() {
    }

    public FltInstancePK(BigInteger flt, Date dateFlt) {
        this.flt = flt;
        this.dateFlt = dateFlt;
    }

    public BigInteger getFlt() {
        return flt;
    }

    public void setFlt(BigInteger flt) {
        this.flt = flt;
    }

    public Date getDateFlt() {
        return dateFlt;
    }

    public void setDateFlt(Date dateFlt) {
        this.dateFlt = dateFlt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (flt != null ? flt.hashCode() : 0);
        hash += (dateFlt != null ? dateFlt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FltInstancePK)) {
            return false;
        }
        FltInstancePK other = (FltInstancePK) object;
        if ((this.flt == null && other.flt != null) || (this.flt != null && !this.flt.equals(other.flt))) {
            return false;
        }
        if ((this.dateFlt == null && other.dateFlt != null) || (this.dateFlt != null && !this.dateFlt.equals(other.dateFlt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.backend.basedatos.FltInstancePK[ flt=" + flt + ", dateFlt=" + dateFlt + " ]";
    }
    
}
