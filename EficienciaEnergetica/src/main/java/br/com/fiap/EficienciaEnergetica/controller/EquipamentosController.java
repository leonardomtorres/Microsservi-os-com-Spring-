package br.com.fiap.EficienciaEnergetica.controller;


import br.com.fiap.EficienciaEnergetica.dto.EquipamentoDto;
import br.com.fiap.EficienciaEnergetica.dto.EquipamentoResponseDto;
import br.com.fiap.EficienciaEnergetica.mapper.EquipamentoMapper;
import br.com.fiap.EficienciaEnergetica.model.EquipamentosModel;
import br.com.fiap.EficienciaEnergetica.service.EquipamentoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipamentos")
public class EquipamentosController {

    @Autowired
    private EquipamentoService equipamentosService;

    @GetMapping
    public List<EquipamentosModel> listar() {
        return equipamentosService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EquipamentosModel> buscar(@PathVariable Long id) {
        return equipamentosService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/vencidos")
    public List<EquipamentosModel> listarEquipamentosForaDaValidade() {
        return equipamentosService.buscarEquipamentosVencidos();
    }

    @GetMapping("/inativos")
    public List<EquipamentosModel> listarEquipamentosInativos() {
        return equipamentosService.listarInativos();
    }

    @PostMapping
    public ResponseEntity<EquipamentoResponseDto> salvar(@Valid @RequestBody EquipamentoDto dto) {
        EquipamentosModel model = EquipamentoMapper.fromDTO(dto);
        EquipamentosModel salvo = equipamentosService.salvar(model);
        return ResponseEntity.ok(EquipamentoMapper.toDTO(salvo));
    }


    @PutMapping("/{id}")
    public ResponseEntity<EquipamentosModel> atualizar(@PathVariable Long id, @RequestBody EquipamentosModel equipamento) {
        if (equipamentosService.buscarPorId(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(equipamentosService.atualizar(equipamento));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (equipamentosService.buscarPorId(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        equipamentosService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
