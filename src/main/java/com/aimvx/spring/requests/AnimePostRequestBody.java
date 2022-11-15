package com.aimvx.spring.requests;

import lombok.Data;

@Data
public class AnimePostRequestBody {
    private String name;

    public void setName (String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
}
