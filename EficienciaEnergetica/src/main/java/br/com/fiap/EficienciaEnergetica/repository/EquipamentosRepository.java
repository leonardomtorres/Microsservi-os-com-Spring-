package br.com.fiap.EficienciaEnergetica.repository;

import br.com.fiap.EficienciaEnergetica.model.EquipamentosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNullApi;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface EquipamentosRepository extends JpaRepository<EquipamentosModel, Long> {
    public Optional<EquipamentosModel> findById(Long id);

    List<EquipamentosModel> findByValidadeEquipamentoLessThan(LocalDate data);

    List<EquipamentosModel> findByStatusEquipamento(String statusEquipamento);


}
