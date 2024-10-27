package com.consumir.api.receita.endpoint;

import com.consumir.api.receita.model.RecipeResponse;
import com.consumir.api.receita.service.ReceitasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/receitas")
public class ReceitasEndpoint {

    @Autowired
    private ReceitasService receitasService;

    @GetMapping("{receita}")
    public ResponseEntity<Object> consulta(@PathVariable String receita) {

        return receitasService.getReceitas(receita);
    }
}
