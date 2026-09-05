package com.marcos.acervo_pessoal_api.service;

import com.marcos.acervo_pessoal_api.dto.request.CadastroRequest;
import com.marcos.acervo_pessoal_api.dto.response.CadastroLivroResponse;
import com.marcos.acervo_pessoal_api.exception.LivroJaExisteException;
import com.marcos.acervo_pessoal_api.model.Livro;
import com.marcos.acervo_pessoal_api.repository.LivroRepository;
import org.springframework.stereotype.Service;

@Service
public class LivroService {
    private final LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public CadastroLivroResponse cadastrar (CadastroRequest request){
        if (livroRepository.existsByIsbn(request.getIsbn())) {
            throw new LivroJaExisteException("Essa isbn ja foi cadastrada");
        }

        Livro livro = new Livro();
        livro.setTitulo(request.getTitulo());
        livro.setAutor(request.getAutor());
        livro.setEditora(request.getEditora());
        livro.setIsbn(request.getIsbn());
        livro.setDisponibilidade(true);
        livro.setLido(false);
        livro.setCategoria(request.getCategoria());
        livro.setDataPublicacao(request.getDataPublicacao());

        Livro livroSalvo = livroRepository.save(livro);

        return new  CadastroLivroResponse(livroSalvo.getId(), livroSalvo.getIsbn(), livroSalvo.isLido(), livroSalvo.isDisponibilidade());

    }
}
