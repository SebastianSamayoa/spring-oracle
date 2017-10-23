/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backend.basedatos;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jhoan
 */
@Entity
@Table(name = "FLT_INSTANCE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FltInstance.findAll", query = "SELECT f FROM FltInstance f"),
    @NamedQuery(name = "FltInstance.findByFlt", query = "SELECT f FROM FltInstance f WHERE f.fltInstancePK.flt = :flt"),
    @NamedQuery(name = "FltInstance.findByDateFlt", query = "SELECT f FROM FltInstance f WHERE f.fltInstancePK.dateFlt = :dateFlt"),
    @NamedQuery(name = "FltInstance.findByAvailSeats", query = "SELECT f FROM FltInstance f WHERE f.availSeats = :availSeats")})
public class FltInstance implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FltInstancePK fltInstancePK;
    @Column(name = "AVAIL_SEATS#")
    private BigInteger availSeats;
    @JoinColumn(name = "FLT#", referencedColumnName = "FLT#", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private FltSchedule fltSchedule;

    public FltInstance() {
    }

    public FltInstance(FltInstancePK fltInstancePK) {
        this.fltInstancePK = fltInstancePK;
    }

    public FltInstance(BigInteger flt, Date dateFlt) {
        this.fltInstancePK = new FltInstancePK(flt, dateFlt);
    }

    public FltInstancePK getFltInstancePK() {
        return fltInstancePK;
    }

    public void setFltInstancePK(FltInstancePK fltInstancePK) {
        this.fltInstancePK = fltInstancePK;
    }

    public BigInteger getAvailSeats() {
        return availSeats;
    }

    public void setAvailSeats(BigInteger availSeats) {
        this.availSeats = availSeats;
    }

    public FltSchedule getFltSchedule() {
        return fltSchedule;
    }

    public void setFltSchedule(FltSchedule fltSchedule) {
        this.fltSchedule = fltSchedule;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fltInstancePK != null ? fltInstancePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FltInstance)) {
            return false;
        }
        FltInstance other = (FltInstance) object;
        if ((this.fltInstancePK == null && other.fltInstancePK != null) || (this.fltInstancePK != null && !this.fltInstancePK.equals(other.fltInstancePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.backend.basedatos.FltInstance[ fltInstancePK=" + fltInstancePK + " ]";
    }
    
}
