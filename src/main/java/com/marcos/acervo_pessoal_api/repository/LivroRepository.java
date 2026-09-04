package com.marcos.acervo_pessoal_api.repository;

import com.marcos.acervo_pessoal_api.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
    boolean existsByIsbn(String isbn);
}
