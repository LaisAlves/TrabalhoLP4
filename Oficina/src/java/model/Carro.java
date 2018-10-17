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
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity(name = "Carro")
@Table(name = "carro")
public class Carro implements Serializable, BaseEntity {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idAutomovel")
    private Integer idAutomovel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "cor")
    private String cor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "dataTerminoProjeto")
    private String dataTerminoProjeto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pesoCarro")
    private float pesoCarro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pesoChassi")
    private float pesoChassi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "custoTotal")
    private float custoTotal;

    public Carro() {
    }

    public Carro(Integer idAutomovel) {
        this.idAutomovel = idAutomovel;
    }

    public Carro(Integer idAutomovel, String cor, String nome, String dataTerminoProjeto, float pesoCarro, float pesoChassi, float custoTotal) {
        this.idAutomovel = idAutomovel;
        this.cor = cor;
        this.nome = nome;
        this.dataTerminoProjeto = dataTerminoProjeto;
        this.pesoCarro = pesoCarro;
        this.pesoChassi = pesoChassi;
        this.custoTotal = custoTotal;
    }

    public Integer getIdAutomovel() {
        return idAutomovel;
    }

    public void setIdAutomovel(Integer idAutomovel) {
        this.idAutomovel = idAutomovel;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataTerminoProjeto() {
        return dataTerminoProjeto;
    }

    public void setDataTerminoProjeto(String dataTerminoProjeto) {
        this.dataTerminoProjeto = dataTerminoProjeto;
    }

    public float getPesoCarro() {
        return pesoCarro;
    }

    public void setPesoCarro(float pesoCarro) {
        this.pesoCarro = pesoCarro;
    }

    public float getPesoChassi() {
        return pesoChassi;
    }

    public void setPesoChassi(float pesoChassi) {
        this.pesoChassi = pesoChassi;
    }

    public float getCustoTotal() {
        return custoTotal;
    }

    public void setCustoTotal(float custoTotal) {
        this.custoTotal = custoTotal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAutomovel != null ? idAutomovel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carro)) {
            return false;
        }
        Carro other = (Carro) object;
        if ((this.idAutomovel == null && other.idAutomovel != null) || (this.idAutomovel != null && !this.idAutomovel.equals(other.idAutomovel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Automovel[ idAutomovel=" + idAutomovel + " ]";
    }

    @Override
    public Long pegarId() {
        return new Long(idAutomovel);
    }
    public String getCategoria() {
        if (this.pesoCarro <= 100) {
            if (this.custoTotal <= 50) {
                return "Carroça - Amador";
            } else if (this.custoTotal < 100) {
                return "Carroça - Intermediário";
            } else if (this.custoTotal <= 150) {
                return "Carroça - Profissional";
            }
        } else if (this.pesoCarro < 300) {
            if (this.custoTotal <= 50) {
                return "Baja - Amador";
            } else if (this.custoTotal < 100) {
                return "Baja - Intermediário";
            } else if (this.custoTotal <= 150) {
                return "Baja - Profissional";
            }
        } else if (this.pesoCarro <= 500) {
            if (this.custoTotal <= 50) {
                return "Bugre - Amador";
            } else if (this.custoTotal < 100) {
                return "Bugre - Intermediário";
            } else if (this.custoTotal <= 150) {
                return "Bugre - Profissional";
            }
        }
        return "Sem Categoria";
    }
}