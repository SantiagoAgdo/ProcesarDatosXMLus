package com.mibanco.procesardatosxml.us;

import java.util.function.BiFunction;
import io.quarkus.grpc.MutinyClient;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: ProcesarDatosXML.proto")
public class ProcesarDatosServiceClient implements ProcesarDatosService, MutinyClient<MutinyProcesarDatosServiceGrpc.MutinyProcesarDatosServiceStub> {

    private final MutinyProcesarDatosServiceGrpc.MutinyProcesarDatosServiceStub stub;

    public ProcesarDatosServiceClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyProcesarDatosServiceGrpc.MutinyProcesarDatosServiceStub, MutinyProcesarDatosServiceGrpc.MutinyProcesarDatosServiceStub> stubConfigurator) {
        this.stub = stubConfigurator.apply(name, MutinyProcesarDatosServiceGrpc.newMutinyStub(channel));
    }

    private ProcesarDatosServiceClient(MutinyProcesarDatosServiceGrpc.MutinyProcesarDatosServiceStub stub) {
        this.stub = stub;
    }

    public ProcesarDatosServiceClient newInstanceWithStub(MutinyProcesarDatosServiceGrpc.MutinyProcesarDatosServiceStub stub) {
        return new ProcesarDatosServiceClient(stub);
    }

    @Override
    public MutinyProcesarDatosServiceGrpc.MutinyProcesarDatosServiceStub getStub() {
        return stub;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.mibanco.procesardatosxml.us.RptInforme> datosXMLObj(com.mibanco.procesardatosxml.us.InformeXML request) {
        return stub.datosXMLObj(request);
    }
}
