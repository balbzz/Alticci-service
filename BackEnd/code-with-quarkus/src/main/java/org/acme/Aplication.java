package org.acme;

import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;

@OpenAPIDefinition(info = @Info(title = "Alticci Calculator", description = "for number less or equals to 157", version = "0.0.1"))
public class Aplication extends Application {
}
