package com.mibanco.procesardatosxml.us.grpc;

import com.mibanco.procesardatosxml.us.InformeXML;
import com.mibanco.procesardatosxml.us.ProcesarDatosServiceGrpc;
import com.mibanco.procesardatosxml.us.RptInforme;
import com.mibanco.procesardatosxml.us.dto.Informes;
import com.mibanco.procesardatosxml.us.service.impl.ProcesarDatosXMLImpl;
import com.mibanco.procesardatosxml.us.utils.exceptions.ApplicationException;
import com.mibanco.procesardatosxml.us.utils.mapper.ProcesarDatosMapperGrpc;
import com.mibanco.procesardatosxml.us.utils.validators.ProcesarDatosValidator;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.StatusException;
import io.grpc.stub.StreamObserver;
import io.quarkus.grpc.GrpcService;
import io.smallrye.common.annotation.Blocking;
import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@GrpcService
public class ProcesarDatosGrpcController extends ProcesarDatosServiceGrpc.ProcesarDatosServiceImplBase {

    public static final Logger LOG = LoggerFactory.getLogger(ProcesarDatosGrpcController.class);

    @Inject
    ProcesarDatosXMLImpl service;

    @Inject
    ProcesarDatosValidator validator;

    @Inject
    ProcesarDatosMapperGrpc mapperGrpc;

    @Override
    @Blocking
    public void datosXMLObj(InformeXML request, StreamObserver<RptInforme> responseObs){

        LOG.info("Inicia Procesamiento de datos XML por GRPC");
        try {

            validator.validarXMl(request.getXml().toByteArray());
            Informes alertaListType = service.procesarDatosXml(request.getXml().toByteArray());

            String jsonString = mapperGrpc.objToJson(alertaListType);
            RptInforme responseInforme = RptInforme.newBuilder().setJsonRpt(jsonString).build();
            LOG.info("Finaliza Procesamiento de datos XML por GRPC");

            responseObs.onNext(responseInforme);
            responseObs.onCompleted();

        } catch (ApplicationException e) {

            StatusException statusException = responseExceptionGrpc(Status.INVALID_ARGUMENT, e.getMessage());
            responseObs.onError(statusException);

        } catch (Exception e) {

            StatusException statusException = responseExceptionGrpc(Status.INTERNAL, e.getMessage());
            responseObs.onError(statusException);
        }
    }

    private StatusException responseExceptionGrpc(Status statusCode, String exceptionMessage) {
        LOG.error("Exception: " + exceptionMessage);

        Metadata metadata = new Metadata();
        metadata.put(Metadata.Key.of("Error", Metadata.ASCII_STRING_MARSHALLER), exceptionMessage);

        return statusCode.asException(metadata);
    }

}