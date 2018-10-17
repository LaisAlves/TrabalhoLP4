/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import converter.BaseEntity;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity(name = "Integrante")
@Table(name = "integrante")
public class Responsavel implements Serializable, BaseEntity {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "matricula")
    private Integer identidade;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "cargaHorariaDisponivel")
    private String cargaHorariaDisponivel;

    public Integer getIdentidade() {
        return identidade;
    }

    public void setIdentidade(Integer identidade) {
        this.identidade = identidade;
    }

    public Pessoa getfKpessoa() {
        return fKpessoa;
    }

    public void setfKpessoa(Pessoa fKpessoa) {
        this.fKpessoa = fKpessoa;
    }

    public Responsavel(Integer identiade, String cargaHorariaDisponivel, Pessoa fKpessoa) {
        this.identidade = identidade;
        this.cargaHorariaDisponivel = cargaHorariaDisponivel;
        this.fKpessoa = fKpessoa;
    }

    @JoinColumn(name = "FK_pessoa", referencedColumnName = "idPessoa")
    @ManyToOne(optional = false)
    private Pessoa fKpessoa;

    public Responsavel() {
    }

    public Responsavel(Integer identidade) {
        this.identidade = identidade;
    }

    public Responsavel(Integer identidade, String cargaHorariaDisponivel) {
        this.identidade = identidade;
        this.cargaHorariaDisponivel = cargaHorariaDisponivel;
    }

   


    public String getCargaHorariaDisponivel() {
        return cargaHorariaDisponivel;
    }

    public void setCargaHorariaDisponivel(String cargaHorariaDisponivel) {
        this.cargaHorariaDisponivel = cargaHorariaDisponivel;
    }

    public Pessoa getFKpessoa() {
        return fKpessoa;
    }

    public void setFKpessoa(Pessoa fKpessoa) {
        this.fKpessoa = fKpessoa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identidade != null ? identidade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Responsavel)) {
            return false;
        }
        Responsavel other = (Responsavel) object;
        if ((this.identidade == null && other.identidade != null) || (this.identidade != null && !this.identidade.equals(other.identidade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Integrante[ identidade=" + identidade + " ]";
    }

    @Override
    public Long pegarId() {
        return new Long(identidade);
    }
}
