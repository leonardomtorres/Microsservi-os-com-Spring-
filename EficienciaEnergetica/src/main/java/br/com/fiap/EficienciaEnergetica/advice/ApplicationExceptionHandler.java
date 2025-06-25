package br.com.fiap.EficienciaEnergetica.advice;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestControllerAdvice
public class ApplicationExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> manusearArgumentosInvalidos(MethodArgumentNotValidException exception) {
        Map<String, String> mapaDeErros = new HashMap<>();
        List<FieldError> campos = exception.getBindingResult().getFieldErrors();

        for (FieldError error : campos) {
            mapaDeErros.put(error.getField(), error.getDefaultMessage());
        }

        return mapaDeErros;
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(DataIntegrityViolationException.class)
    public Map<String, String> manusearErros(DataIntegrityViolationException exception) {
    String mensagemErro = "Erro de integridade de dados.";

    if (exception.getRootCause() != null && exception.getRootCause().getMessage().contains("VALIDADE_EQUIPAMENTO")) {
        mensagemErro = "A data de validade é obrigatória.";
    }

    Map<String, String> erro = new HashMap<>();
    erro.put("erro", mensagemErro);
    return erro;

    }

}
