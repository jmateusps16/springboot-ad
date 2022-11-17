package com.aimvx.spring.requests;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class AnimePostRequestBody {
    private Long id;
    @NotEmpty(message = "The anime name cannot be empty or null")
    private String name;

    public void setName (String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
}
