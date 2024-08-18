package com.streamingUnir.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.streamingUnir.entity.Bitacora;

import com.streamingUnir.service.BitacoraService;


@RestController
public class BitacoraController {
	
	@Autowired
	 private BitacoraService bitacoraService;
	
	@PostMapping("/bitacora")
	Bitacora addBitacora(@RequestBody Bitacora bitacora) {
	    return bitacoraService.save(bitacora);
	  }
	

}
