package com.marcos.acervo_pessoal_api.dto.response;

public class CadastroLivroResponse {
    private Long id;
    private String isbn;
    private boolean lido;
    private boolean disponibilidade;

    public CadastroLivroResponse() {
    }

    public CadastroLivroResponse(Long id, String isbn, boolean lido, boolean disponibilidade) {
        this.id = id;
        this.isbn = isbn;
        this.lido = lido;
        this.disponibilidade = disponibilidade;
    }

    public Long getId() {
        return id;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public boolean isLido() {
        return lido;
    }

    public String getIsbn() {
        return isbn;
    }
}
