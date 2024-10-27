package com.consumir.api.receita.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Receita {

    private String publisher;
    private String title;
    private String source_url;
    private String recipe_id;
    private String image_url;
    private double social_rank;
    private String publisher_url;

}
