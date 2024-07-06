package com.dferna.entrenamiento.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ApiKeyService {
	private static final Map<String, String> apiKeys = new HashMap<>();

    static {
        // Aquí deberías cargar las claves de API de una fuente segura, como una base de datos o un archivo de configuración
        apiKeys.put("123456", "user1");
    }

    public boolean isValidApiKey(String apiKey) {
        return apiKeys.containsKey(apiKey);
    }
}
