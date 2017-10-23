/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backend.basedatos;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jhoan
 */
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c"),
    @NamedQuery(name = "Customer.findByCust", query = "SELECT c FROM Customer c WHERE c.cust = :cust"),
    @NamedQuery(name = "Customer.findByFirst", query = "SELECT c FROM Customer c WHERE c.first = :first"),
    @NamedQuery(name = "Customer.findByMiddle", query = "SELECT c FROM Customer c WHERE c.middle = :middle"),
    @NamedQuery(name = "Customer.findByLast", query = "SELECT c FROM Customer c WHERE c.last = :last"),
    @NamedQuery(name = "Customer.findByPhone", query = "SELECT c FROM Customer c WHERE c.phone = :phone"),
    @NamedQuery(name = "Customer.findByStreet", query = "SELECT c FROM Customer c WHERE c.street = :street"),
    @NamedQuery(name = "Customer.findByCity", query = "SELECT c FROM Customer c WHERE c.city = :city"),
    @NamedQuery(name = "Customer.findByState", query = "SELECT c FROM Customer c WHERE c.state = :state"),
    @NamedQuery(name = "Customer.findByZip", query = "SELECT c FROM Customer c WHERE c.zip = :zip")})
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CUST#")
    private BigDecimal cust;
    @Size(max = 50)
    private String first;
    @Size(max = 50)
    private String middle;
    @Size(max = 50)
    private String last;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Formato tel./fax. invalido, debe ser xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 8)
    @Column(name = "PHONE#")
    private String phone;
    @Size(max = 50)
    private String street;
    @Size(max = 50)
    private String city;
    @Size(max = 50)
    private String state;
    @Size(max = 10)
    private String zip;

    public Customer() {
    }

    public Customer(BigDecimal cust) {
        this.cust = cust;
    }

    public BigDecimal getCust() {
        return cust;
    }

    public void setCust(BigDecimal cust) {
        this.cust = cust;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cust != null ? cust.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.cust == null && other.cust != null) || (this.cust != null && !this.cust.equals(other.cust))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.backend.basedatos.Customer[ cust=" + cust + " ]";
    }
    
}
