package br.com.fiap.EficienciaEnergetica.service;

import br.com.fiap.EficienciaEnergetica.dto.EquipamentoDto;
import br.com.fiap.EficienciaEnergetica.dto.EquipamentoResponseDto;
import br.com.fiap.EficienciaEnergetica.model.EquipamentosModel;
import br.com.fiap.EficienciaEnergetica.repository.EquipamentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EquipamentoService {

    @Autowired
    private EquipamentosRepository equipamentosRepository;

    public List<EquipamentosModel> listarTodos() {
        return equipamentosRepository.findAll();
    }

    public Optional<EquipamentosModel> buscarPorId(Long id) {
        return equipamentosRepository.findById(id);
    }

    public List<EquipamentosModel> buscarEquipamentosVencidos(){
        LocalDate today = LocalDate.now();
        return equipamentosRepository.findByValidadeEquipamentoLessThan(today);
    }

    public List<EquipamentosModel> listarInativos() {
        return equipamentosRepository.findByStatusEquipamento("Inativo");
    }

    public EquipamentosModel salvar(EquipamentosModel equipamento) {
        return equipamentosRepository.save(equipamento);
    }

    public void deletar(Long id) {
        equipamentosRepository.deleteById(id);
    }

    public EquipamentosModel atualizar(EquipamentosModel novoEquipamento) {
        Optional<EquipamentosModel> equipamentosModelopcional = equipamentosRepository
                .findById(novoEquipamento.getIdEquipamento());
        if(equipamentosModelopcional.isPresent()){
            return equipamentosRepository.save(novoEquipamento);
        } else {
            throw new RuntimeException("Equipamento não encontrado");
        }
    }

}
