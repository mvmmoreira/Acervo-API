package com.marcos.acervo_pessoal_api.dto.response;

import java.time.LocalDateTime;

public class ErroResponse {
    private String mensagem;
    private int status;
    private LocalDateTime timestamp;

    public ErroResponse(String mensagem, int status, LocalDateTime timestamp) {
        this.mensagem = mensagem;
        this.status = status;
        this.timestamp = timestamp;
    }

    public String getMensagem() {
        return mensagem;
    }

    public int getStatus() {
        return status;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
