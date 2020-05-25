package com.mo.kyung.dps.openapi.application.util;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.core.util.Json;

@Provider
public class JsonProvider implements ContextResolver<ObjectMapper> {
	private final ObjectMapper objectMapper;

	public JsonProvider() {
		objectMapper = Json.mapper();
	}

	@Override
	public ObjectMapper getContext(Class<?> type) {
		return objectMapper;
	}

}
