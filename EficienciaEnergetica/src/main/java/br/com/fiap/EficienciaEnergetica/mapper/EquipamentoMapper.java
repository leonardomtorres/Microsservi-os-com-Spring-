package br.com.fiap.EficienciaEnergetica.mapper;

import br.com.fiap.EficienciaEnergetica.dto.EquipamentoDto;
import br.com.fiap.EficienciaEnergetica.dto.EquipamentoResponseDto;
import br.com.fiap.EficienciaEnergetica.model.EquipamentosModel;

public class EquipamentoMapper {

    // --- MÉTODOS DE CONVERSÃO DTO <-> MODEL ---

    public static EquipamentosModel fromDTO(EquipamentoDto dto) {
        return new EquipamentosModel(
                null,
                dto.getNomeEquipamento(),
                dto.getTipoEquipamento(),
                dto.getPotenciaEquipamento(),
                dto.getFabricanteEquipamento(),
                dto.getModeloEquipamento(),
                dto.getStatusEquipamento(),
                dto.getValidadeEquipamento()
        );
    }

    public static EquipamentoResponseDto toDTO(EquipamentosModel model) {
        EquipamentoResponseDto dto = new EquipamentoResponseDto();
        dto.setIdEquipamento(model.getIdEquipamento());
        dto.setNomeEquipamento(model.getNomeEquipamento());
        dto.setTipoEquipamento(model.getTipoEquipamento());
        dto.setPotenciaEquipamento(model.getPotenciaEquipamento());
        dto.setFabricanteEquipamento(model.getFabricanteEquipamento());
        dto.setModeloEquipamento(model.getModeloEquipamento());
        dto.setStatusEquipamento(model.getStatusEquipamento());
        dto.setValidadeEquipamento(model.getValidadeEquipamento());
        return dto;
    }
}
