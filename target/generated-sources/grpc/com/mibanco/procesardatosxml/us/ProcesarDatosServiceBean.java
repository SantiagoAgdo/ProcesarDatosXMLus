package com.mibanco.procesardatosxml.us;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.MutinyBean;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: ProcesarDatosXML.proto")
public class ProcesarDatosServiceBean extends MutinyProcesarDatosServiceGrpc.ProcesarDatosServiceImplBase implements BindableService, MutinyBean {

    private final ProcesarDatosService delegate;

    ProcesarDatosServiceBean(@GrpcService ProcesarDatosService delegate) {
        this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.mibanco.procesardatosxml.us.RptInforme> datosXMLObj(com.mibanco.procesardatosxml.us.InformeXML request) {
        try {
            return delegate.datosXMLObj(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }
}
