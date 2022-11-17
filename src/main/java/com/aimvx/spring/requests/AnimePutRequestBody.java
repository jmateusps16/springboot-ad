package com.aimvx.spring.requests;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AnimePutRequestBody {
    private Long id;
    @NotEmpty(message = "The anime name cannot be empty")
    @NotNull(message = "The anime name cannot be null")
    private String name;

    public void setId (Long id){
        this.id = id;
    }

    public void setName (String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }

    public Long getId(){
        return id;
    }
}
