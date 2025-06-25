package br.com.fiap.EficienciaEnergetica.dto;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class EquipamentoDto {
    @NotBlank(message = "O nome do equipamento é obrigatório")
    private String nomeEquipamento;

    @NotBlank(message = "O tipo do equipamento é obrigatório")
    private String tipoEquipamento;

    @Positive(message = "A potência deve ser maior que zero")
    private int potenciaEquipamento;

    @NotBlank(message = "O fabricante é obrigatório")
    private String fabricanteEquipamento;

    @NotBlank(message = "O modelo é obrigatório")
    private String modeloEquipamento;

    @NotBlank(message = "O status é obrigatório")
    private String statusEquipamento;

    @FutureOrPresent(message = "A validade não pode ser uma data passada")
    private LocalDate validadeEquipamento;

    public @NotBlank(message = "O nome do equipamento é obrigatório") String getNomeEquipamento() {
        return nomeEquipamento;
    }

    public void setNomeEquipamento(@NotBlank(message = "O nome do equipamento é obrigatório") String nomeEquipamento) {
        this.nomeEquipamento = nomeEquipamento;
    }

    public @NotBlank(message = "O tipo do equipamento é obrigatório") String getTipoEquipamento() {
        return tipoEquipamento;
    }

    public void setTipoEquipamento(@NotBlank(message = "O tipo do equipamento é obrigatório") String tipoEquipamento) {
        this.tipoEquipamento = tipoEquipamento;
    }

    @Positive(message = "A potência deve ser maior que zero")
    public int getPotenciaEquipamento() {
        return potenciaEquipamento;
    }

    public void setPotenciaEquipamento(@Positive(message = "A potência deve ser maior que zero") int potenciaEquipamento) {
        this.potenciaEquipamento = potenciaEquipamento;
    }

    public @NotBlank(message = "O fabricante é obrigatório") String getFabricanteEquipamento() {
        return fabricanteEquipamento;
    }

    public void setFabricanteEquipamento(@NotBlank(message = "O fabricante é obrigatório") String fabricanteEquipamento) {
        this.fabricanteEquipamento = fabricanteEquipamento;
    }

    public @NotBlank(message = "O modelo é obrigatório") String getModeloEquipamento() {
        return modeloEquipamento;
    }

    public void setModeloEquipamento(@NotBlank(message = "O modelo é obrigatório") String modeloEquipamento) {
        this.modeloEquipamento = modeloEquipamento;
    }

    public @NotBlank(message = "O status é obrigatório") String getStatusEquipamento() {
        return statusEquipamento;
    }

    public void setStatusEquipamento(@NotBlank(message = "O status é obrigatório") String statusEquipamento) {
        this.statusEquipamento = statusEquipamento;
    }

    public @FutureOrPresent(message = "A validade não pode ser uma data passada") LocalDate getValidadeEquipamento() {
        return validadeEquipamento;
    }

    public void setValidadeEquipamento(@FutureOrPresent(message = "A validade não pode ser uma data passada") LocalDate validadeEquipamento) {
        this.validadeEquipamento = validadeEquipamento;
    }
}
