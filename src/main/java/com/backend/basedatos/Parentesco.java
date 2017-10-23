/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backend.basedatos;

import java.io.Serializable;
import javax.persistence.Basic;
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
    @NamedQuery(name = "Parentesco.findAll", query = "SELECT p FROM Parentesco p"),
    @NamedQuery(name = "Parentesco.findByIdparentesco", query = "SELECT p FROM Parentesco p WHERE p.idparentesco = :idparentesco"),
    @NamedQuery(name = "Parentesco.findByParentesco", query = "SELECT p FROM Parentesco p WHERE p.parentesco = :parentesco")})
public class Parentesco implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer idparentesco;
    @Size(max = 50)
    private String parentesco;

    public Parentesco() {
    }

    public Parentesco(Integer idparentesco) {
        this.idparentesco = idparentesco;
    }

    public Integer getIdparentesco() {
        return idparentesco;
    }

    public void setIdparentesco(Integer idparentesco) {
        this.idparentesco = idparentesco;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idparentesco != null ? idparentesco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parentesco)) {
            return false;
        }
        Parentesco other = (Parentesco) object;
        if ((this.idparentesco == null && other.idparentesco != null) || (this.idparentesco != null && !this.idparentesco.equals(other.idparentesco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.backend.basedatos.Parentesco[ idparentesco=" + idparentesco + " ]";
    }
    
}
