package com.PTD.demoSKINS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.PTD.demoSKINS.model.Skin;
import com.PTD.demoSKINS.service.SkinService;

import java.util.List;

@RestController
@RequestMapping("/skins")
public class SkinController {
    @Autowired
    private SkinService skinService;

    @GetMapping("/available")
    public List<Skin> getAvailableSkins() {
        return skinService.getAvailableSkins();
    }

    @PostMapping("/buy")
    public Skin buySkin(@RequestBody Skin skin) {
        return skinService.buySkin(skin);
    }

    @GetMapping("/myskins/{userId}")
    public List<Skin> getUserSkins(@PathVariable String userId) {
        return skinService.getUserSkins(userId);
    }

    @PutMapping("/color/{id}")
    public Skin updateSkinColor(@PathVariable String id, @RequestBody String color) {
        return skinService.updateSkinColor(id, color);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSkin(@PathVariable String id) {
        skinService.deleteSkin(id);
    }

    @GetMapping("/getskin/{id}")
    public Skin getSkinById(@PathVariable String id) {
        return skinService.getSkinById(id).orElse(null);
    }
}