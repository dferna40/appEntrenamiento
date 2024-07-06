package com.dferna.entrenamiento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dferna.entrenamiento.exception.UnauthorizedException;
import com.dferna.entrenamiento.service.ApiKeyService;

@RestController
@RequestMapping("/api")
public class ApiController {

	 @Autowired
	    private ApiKeyService apiKeyService;

	    @GetMapping("/ruta-protegida")
	    public String protectedRoute(@RequestHeader("x-api-key") String apiKey) {
	        if (!apiKeyService.isValidApiKey(apiKey)) {
	            throw new UnauthorizedException();
	        }
	        return "¡Acceso concedido!";
	    }
}
