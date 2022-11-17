package com.aimvx.spring.requests;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class AnimePostRequestBody {
    private Long id;
    @NotEmpty(message = "The anime name cannot be empty")
    @NotNull(message = "The anime name cannot be null")
    private String name;

    public void setName (String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
}
