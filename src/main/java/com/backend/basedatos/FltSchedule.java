/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backend.basedatos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jhoan
 */
@Entity
@Table(name = "FLT_SCHEDULE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FltSchedule.findAll", query = "SELECT f FROM FltSchedule f"),
    @NamedQuery(name = "FltSchedule.findByFlt", query = "SELECT f FROM FltSchedule f WHERE f.flt = :flt"),
    @NamedQuery(name = "FltSchedule.findByAirline", query = "SELECT f FROM FltSchedule f WHERE f.airline = :airline"),
    @NamedQuery(name = "FltSchedule.findByDtime", query = "SELECT f FROM FltSchedule f WHERE f.dtime = :dtime"),
    @NamedQuery(name = "FltSchedule.findByAtime", query = "SELECT f FROM FltSchedule f WHERE f.atime = :atime")})
public class FltSchedule implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "FLT#")
    private Short flt;
    @Size(max = 25)
    private String airline;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date atime;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fltSchedule", fetch = FetchType.EAGER)
    private List<FltInstance> fltInstanceList;
    @JoinColumn(name = "TO_AIRPORTCODE", referencedColumnName = "AIRPORTCODE")
    @ManyToOne(fetch = FetchType.EAGER)
    private Airport toAirportcode;
    @JoinColumn(name = "FROM_AIRPORTCODE", referencedColumnName = "AIRPORTCODE")
    @ManyToOne(fetch = FetchType.EAGER)
    private Airport fromAirportcode;

    public FltSchedule() {
    }

    public FltSchedule(Short flt) {
        this.flt = flt;
    }

    public Short getFlt() {
        return flt;
    }

    public void setFlt(Short flt) {
        this.flt = flt;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public Date getDtime() {
        return dtime;
    }

    public void setDtime(Date dtime) {
        this.dtime = dtime;
    }

    public Date getAtime() {
        return atime;
    }

    public void setAtime(Date atime) {
        this.atime = atime;
    }

    @XmlTransient
    public List<FltInstance> getFltInstanceList() {
        return fltInstanceList;
    }

    public void setFltInstanceList(List<FltInstance> fltInstanceList) {
        this.fltInstanceList = fltInstanceList;
    }

    public Airport getToAirportcode() {
        return toAirportcode;
    }

    public void setToAirportcode(Airport toAirportcode) {
        this.toAirportcode = toAirportcode;
    }

    public Airport getFromAirportcode() {
        return fromAirportcode;
    }

    public void setFromAirportcode(Airport fromAirportcode) {
        this.fromAirportcode = fromAirportcode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (flt != null ? flt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FltSchedule)) {
            return false;
        }
        FltSchedule other = (FltSchedule) object;
        if ((this.flt == null && other.flt != null) || (this.flt != null && !this.flt.equals(other.flt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.backend.basedatos.FltSchedule[ flt=" + flt + " ]";
    }
    
}
