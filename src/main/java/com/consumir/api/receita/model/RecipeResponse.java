package com.consumir.api.receita.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RecipeResponse {

    private int count;

    @JsonAlias("recipes")
    private List<Receita> recipes;
}
