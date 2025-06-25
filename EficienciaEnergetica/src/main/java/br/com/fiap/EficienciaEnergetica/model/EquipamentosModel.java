package br.com.fiap.EficienciaEnergetica.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.Date;

@EqualsAndHashCode
@Entity
@Table(name = "tbl_equipamentos")
public class EquipamentosModel {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_DB_EQUIPAMENTOS"
    )
    @SequenceGenerator(
            name = "SEQ_DB_EQUIPAMENTOS",
            sequenceName = "SEQ_DB_EQUIPAMENTOS",
            allocationSize = 1
    )

    @Column(name = "id_equipamento")
    private Long idEquipamento;

    @Column(name = "nome_equipamento")
    private String nomeEquipamento;

    @Column(name = "tipo_equipamento")
    private String tipoEquipamento;

    @Column(name = "potencia_equipamento")
    private int potenciaEquipamento;

    @Column(name = "fabricante_equipamento")
    private String fabricanteEquipamento;

    @Column(name = "modelo_equipamento")
    private String modeloEquipamento;

    @Column(name = "status_equipamento")
    private String statusEquipamento;

    @Column(name = "validade_equipamento")
    private LocalDate validadeEquipamento;

    public EquipamentosModel(){}

    public EquipamentosModel(
        Long idEquipamento,
        String nomeEquipamento,
        String tipoEquipamento,
        int potenciaEquipamento,
        String fabricanteEquipamento,
        String modeloEquipamento,
        String statusEquipamento,
        LocalDate validadeEquipamento) {
        this.idEquipamento = idEquipamento;
        this.nomeEquipamento = nomeEquipamento;
        this.tipoEquipamento = tipoEquipamento;
        this.potenciaEquipamento = potenciaEquipamento;
        this.fabricanteEquipamento = fabricanteEquipamento;
        this.modeloEquipamento = modeloEquipamento;
        this.statusEquipamento = statusEquipamento;
        this.validadeEquipamento = validadeEquipamento;
    }




    public Long getIdEquipamento() {
        return idEquipamento;
    }

    public void setIdEquipamento(Long idEquipamento) {
        this.idEquipamento = idEquipamento;
    }

    public String getNomeEquipamento() {
        return nomeEquipamento;
    }

    public void setNomeEquipamento(String nomeEquipamento) {
        this.nomeEquipamento = nomeEquipamento;
    }

    public String getTipoEquipamento() {
        return tipoEquipamento;
    }

    public void setTipoEquipamento(String tipoEquipamento) {
        this.tipoEquipamento = tipoEquipamento;
    }

    public int getPotenciaEquipamento() {
        return potenciaEquipamento;
    }

    public void setPotenciaEquipamento(int potenciaEquipamento) {
        this.potenciaEquipamento = potenciaEquipamento;
    }

    public String getFabricanteEquipamento() {
        return fabricanteEquipamento;
    }

    public void setFabricanteEquipamento(String fabricanteEquipamento) {
        this.fabricanteEquipamento = fabricanteEquipamento;
    }

    public String getModeloEquipamento() {
        return modeloEquipamento;
    }

    public void setModeloEquipamento(String modeloEquipamento) {
        this.modeloEquipamento = modeloEquipamento;
    }

    public String getStatusEquipamento() {
        return statusEquipamento;
    }

    public void setStatusEquipamento(String statusEquipamento) {
        this.statusEquipamento = statusEquipamento;
    }

    public LocalDate getValidadeEquipamento() {
        return validadeEquipamento;
    }

    public void setValidadeEquipamento(LocalDate validadeEquipamento) {
        this.validadeEquipamento = validadeEquipamento;
    }
}

