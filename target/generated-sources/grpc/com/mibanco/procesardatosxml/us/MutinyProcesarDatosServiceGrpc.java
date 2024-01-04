package com.mibanco.procesardatosxml.us;

import static com.mibanco.procesardatosxml.us.ProcesarDatosServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: ProcesarDatosXML.proto")
public final class MutinyProcesarDatosServiceGrpc implements io.quarkus.grpc.MutinyGrpc {

    private MutinyProcesarDatosServiceGrpc() {
    }

    public static MutinyProcesarDatosServiceStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyProcesarDatosServiceStub(channel);
    }

    public static class MutinyProcesarDatosServiceStub extends io.grpc.stub.AbstractStub<MutinyProcesarDatosServiceStub> implements io.quarkus.grpc.MutinyStub {

        private ProcesarDatosServiceGrpc.ProcesarDatosServiceStub delegateStub;

        private MutinyProcesarDatosServiceStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = ProcesarDatosServiceGrpc.newStub(channel);
        }

        private MutinyProcesarDatosServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = ProcesarDatosServiceGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyProcesarDatosServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyProcesarDatosServiceStub(channel, callOptions);
        }

        public io.smallrye.mutiny.Uni<com.mibanco.procesardatosxml.us.RptInforme> datosXMLObj(com.mibanco.procesardatosxml.us.InformeXML request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::datosXMLObj);
        }
    }

    public static abstract class ProcesarDatosServiceImplBase implements io.grpc.BindableService {

        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public ProcesarDatosServiceImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }

        public io.smallrye.mutiny.Uni<com.mibanco.procesardatosxml.us.RptInforme> datosXMLObj(com.mibanco.procesardatosxml.us.InformeXML request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(com.mibanco.procesardatosxml.us.ProcesarDatosServiceGrpc.getDatosXMLObjMethod(), asyncUnaryCall(new MethodHandlers<com.mibanco.procesardatosxml.us.InformeXML, com.mibanco.procesardatosxml.us.RptInforme>(this, METHODID_DATOS_XMLOBJ, compression))).build();
        }
    }

    private static final int METHODID_DATOS_XMLOBJ = 0;

    private static final class MethodHandlers<Req, Resp> implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>, io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final ProcesarDatosServiceImplBase serviceImpl;

        private final int methodId;

        private final String compression;

        MethodHandlers(ProcesarDatosServiceImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                case METHODID_DATOS_XMLOBJ:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.mibanco.procesardatosxml.us.InformeXML) request, (io.grpc.stub.StreamObserver<com.mibanco.procesardatosxml.us.RptInforme>) responseObserver, compression, serviceImpl::datosXMLObj);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }
}
