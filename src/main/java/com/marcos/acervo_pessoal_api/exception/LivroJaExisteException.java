package com.marcos.acervo_pessoal_api.exception;

public class LivroJaExisteException extends RuntimeException {
    public LivroJaExisteException(String mensagem){
        super(mensagem);
    }
}
