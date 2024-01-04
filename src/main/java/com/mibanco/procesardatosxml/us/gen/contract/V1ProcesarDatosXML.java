package com.mibanco.procesardatosxml.us.gen.contract;

import com.mibanco.procesardatosxml.us.gen.type.Error;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;



import java.io.InputStream;
import java.util.Map;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

@Path("/v1/es/procesar-datos-xml")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-01-04T12:43:40.196845-05:00[America/Bogota]")
public interface V1ProcesarDatosXML {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    Response procesarDatosXML(@Valid Object body);
}
