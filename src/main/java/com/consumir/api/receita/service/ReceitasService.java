package com.consumir.api.receita.service;

import com.consumir.api.receita.model.RecipeResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class ReceitasService {

    public ResponseEntity<Object> getReceitas(String receitas) {

        RestTemplate restTemplate = new RestTemplate();
        try {

            ResponseEntity<RecipeResponse> response = restTemplate.getForEntity(
                    String.format("https://forkify-api.herokuapp.com/api/search?q=%s", receitas),
                    RecipeResponse.class);

            return ResponseEntity.ok(response.getBody());

        } catch (HttpClientErrorException e) {

            return ResponseEntity.status(e.getStatusCode())
                    .body("Erro ao buscar receitas: " + receitas + "\n" + e.getMessage());
        } catch (Exception e) {

        // Captura qualquer outra exceção
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}
