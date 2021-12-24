package com.emd.consumo.api.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emd.consumo.api.feign.client.AirlineApiClient;

@RestController
@RequestMapping("/airlines")
public class AirlineController {
	
	@Autowired
	private AirlineApiClient apiClient;
	
	@GetMapping
	public ResponseEntity<?> obtenerListaAerolineas(){
		return ResponseEntity.ok(apiClient.listarAerolineas());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> obtenerAerolineaPorId(@PathVariable String id){
		return ResponseEntity.ok(apiClient.obtenerAerolineaPorId(id));
	}

}
