package com.PTD.demoSKINS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PTD.demoSKINS.model.Skin;
import com.PTD.demoSKINS.repository.SkinRepository;

import java.util.List;
import java.util.Optional;

	@Service
	public class SkinService {
	    @Autowired
	    private SkinRepository skinRepository;

	    public List<Skin> getAvailableSkins() {
	        return skinRepository.findAll();
	    }

	    public Optional<Skin> getSkinById(String id) {
	        return skinRepository.findById(id);
	    }

	    public Skin buySkin(Skin skin) {
	        return skinRepository.save(skin);
	    }

	    public List<Skin> getUserSkins(String userId) {
	        return skinRepository.findByUserId(userId);
	    }

	    public Skin updateSkinColor(String id, String color) {
	        Skin skin = skinRepository.findById(id).orElseThrow(() -> new RuntimeException("Skin not found"));
	        skin.setColor(color);
	        return skinRepository.save(skin);
	    }

	    public void deleteSkin(String id) {
	        skinRepository.deleteById(id);
	    }
	}