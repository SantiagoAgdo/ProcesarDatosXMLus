package com.mibanco.procesardatosxml.us;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: ProcesarDatosXML.proto")
public interface ProcesarDatosService extends MutinyService {

    io.smallrye.mutiny.Uni<com.mibanco.procesardatosxml.us.RptInforme> datosXMLObj(com.mibanco.procesardatosxml.us.InformeXML request);
}
