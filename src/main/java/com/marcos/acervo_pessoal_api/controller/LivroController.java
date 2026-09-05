package com.marcos.acervo_pessoal_api.controller;


import com.marcos.acervo_pessoal_api.dto.request.CadastroRequest;
import com.marcos.acervo_pessoal_api.dto.response.CadastroLivroResponse;
import com.marcos.acervo_pessoal_api.service.LivroService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livros")
public class LivroController {
    private final LivroService livroService;

    public LivroController(LivroService livroService){
        this.livroService = livroService;
    }

    @PostMapping("/cadastro")
    public ResponseEntity<CadastroLivroResponse> cadastrar(@Valid @RequestBody CadastroRequest request){
        CadastroLivroResponse response = livroService.cadastrar(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
