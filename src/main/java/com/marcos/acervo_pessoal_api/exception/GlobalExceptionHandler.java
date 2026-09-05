package com.marcos.acervo_pessoal_api.exception;

import com.marcos.acervo_pessoal_api.dto.response.ErroResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(LivroJaExisteException.class)
    public ResponseEntity<ErroResponse> tratarLivroJaExiste (LivroJaExisteException ex){
        ErroResponse erro = new ErroResponse(
                ex.getMessage(),
                HttpStatus.CONFLICT.value(),
                LocalDateTime.now()
        );
        return ResponseEntity.status(HttpStatus.CONFLICT).body(erro);
    }
}
