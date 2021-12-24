package com.emd.consumo.api.feign.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.emd.consumo.api.feign.DTO.AirlineDTO;

@FeignClient(name = "${app.feign.config.name}", url = "${app.feign.config.url}")
public interface AirlineApiClient {
	
	@GetMapping("/airlines")
	List<AirlineDTO> listarAerolineas();
	
	@GetMapping("/airlines/{id}")
	AirlineDTO obtenerAerolineaPorId(@PathVariable String id);

}
