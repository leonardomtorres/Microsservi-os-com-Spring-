package br.com.fiap.EficienciaEnergetica.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


public class EquipamentoResponseDto {
    private Long idEquipamento;
    private String nomeEquipamento;
    private String tipoEquipamento;
    private int potenciaEquipamento;
    private String fabricanteEquipamento;
    private String modeloEquipamento;
    private String statusEquipamento;
    private LocalDate validadeEquipamento;

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
