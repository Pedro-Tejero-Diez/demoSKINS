package com.PTD.demoSKINS.service;

	import org.junit.jupiter.api.Test;
	import org.mockito.InjectMocks;
	import org.mockito.Mock;
	import org.mockito.MockitoAnnotations;

import com.PTD.demoSKINS.model.Skin;
import com.PTD.demoSKINS.repository.SkinRepository;

import java.util.Optional;

	import static org.junit.jupiter.api.Assertions.assertEquals;
	import static org.mockito.Mockito.*;

	public class SkinServiceTest {
	    @Mock
	    private SkinRepository skinRepository;

	    @InjectMocks
	    private SkinService skinService;

	    public SkinServiceTest() {
	        MockitoAnnotations.openMocks(this);
	    }

	    @Test
	    public void testGetSkinById() {
	        Skin skin = new Skin();
	        skin.setId("1");
	        when(skinRepository.findById("1")).thenReturn(Optional.of(skin));

	        Optional<Skin> result = skinService.getSkinById("1");
	        assertEquals(skin, result.orElse(null));
	    }
	}

}
