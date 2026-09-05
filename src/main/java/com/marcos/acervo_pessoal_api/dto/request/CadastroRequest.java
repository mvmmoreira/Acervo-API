package com.marcos.acervo_pessoal_api.dto.request;

import com.marcos.acervo_pessoal_api.model.Categoria;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDate;

public class CadastroRequest {
    @NotBlank(message = "Campo de titulo obrigatorio")
    private String titulo;

    @NotBlank(message = "Campo de autor obrigatorio")
    private String autor;

    @NotBlank(message = "Campo de editora obrigatorio")
    private String editora;

    @NotNull(message = "campo Categoria obrigatorio")
    private Categoria categoria;

    @NotBlank(message = "campo isbn obrigatorio")
    @Pattern(regexp = "^(?:\\d{9}[\\dX]|\\d{13})$")
    private String isbn;

    @NotNull(message = "Campo de data de publicação e obrigatorio")
    private LocalDate dataPublicacao;



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
}
