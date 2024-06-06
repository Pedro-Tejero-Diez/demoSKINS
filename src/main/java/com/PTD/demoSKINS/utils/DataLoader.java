package com.PTD.demoSKINS.utils;

import com.PTD.demoSKINS.model.Skin;
import com.PTD.demoSKINS.repository.SkinRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Component
public class DataLoader {
    @Autowired
    private SkinRepository skinRepository;

    @PostConstruct
    public void loadSkins() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            List<Skin> skins = mapper.readValue(new File("skins.json"), new TypeReference<List<Skin>>() {});
            skinRepository.saveAll(skins);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}