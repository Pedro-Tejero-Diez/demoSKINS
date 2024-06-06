package com.PTD.demoSKINS.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
@Document(collection = "skins")
public class Skin {
    @Id
    private String id;
    private String name;
    private String type;
    private Double price;
    private String color;
    private String userId;
    
}
