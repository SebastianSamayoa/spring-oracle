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
    @NamedQuery(name = "Airport.findAll", query = "SELECT a FROM Airport a"),
    @NamedQuery(name = "Airport.findByAirportcode", query = "SELECT a FROM Airport a WHERE a.airportcode = :airportcode"),
    @NamedQuery(name = "Airport.findByName", query = "SELECT a FROM Airport a WHERE a.name = :name"),
    @NamedQuery(name = "Airport.findByCity", query = "SELECT a FROM Airport a WHERE a.city = :city"),
    @NamedQuery(name = "Airport.findByState", query = "SELECT a FROM Airport a WHERE a.state = :state")})
public class Airport implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    private String airportcode;
    @Size(max = 25)
    private String name;
    @Size(max = 50)
    private String city;
    @Size(max = 50)
    private String state;
    @OneToMany(mappedBy = "toAirportcode", fetch = FetchType.EAGER)
    private List<FltSchedule> fltScheduleList;
    @OneToMany(mappedBy = "fromAirportcode", fetch = FetchType.EAGER)
    private List<FltSchedule> fltScheduleList1;

    public Airport() {
    }

    public Airport(String airportcode) {
        this.airportcode = airportcode;
    }

    public String getAirportcode() {
        return airportcode;
    }

    public void setAirportcode(String airportcode) {
        this.airportcode = airportcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @XmlTransient
    public List<FltSchedule> getFltScheduleList() {
        return fltScheduleList;
    }

    public void setFltScheduleList(List<FltSchedule> fltScheduleList) {
        this.fltScheduleList = fltScheduleList;
    }

    @XmlTransient
    public List<FltSchedule> getFltScheduleList1() {
        return fltScheduleList1;
    }

    public void setFltScheduleList1(List<FltSchedule> fltScheduleList1) {
        this.fltScheduleList1 = fltScheduleList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (airportcode != null ? airportcode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Airport)) {
            return false;
        }
        Airport other = (Airport) object;
        if ((this.airportcode == null && other.airportcode != null) || (this.airportcode != null && !this.airportcode.equals(other.airportcode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.backend.basedatos.Airport[ airportcode=" + airportcode + " ]";
    }
    
}
