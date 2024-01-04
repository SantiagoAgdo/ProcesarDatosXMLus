package com.mibanco.procesardatosxml.us;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.quarkus.Generated(value = "by gRPC proto compiler (version 1.59.0)", comments = "Source: ProcesarDatosXML.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProcesarDatosServiceGrpc {

    private ProcesarDatosServiceGrpc() {
    }

    public static final java.lang.String SERVICE_NAME = "ProcesarDatosXMLgRPC.ProcesarDatosService";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<com.mibanco.procesardatosxml.us.InformeXML, com.mibanco.procesardatosxml.us.RptInforme> getDatosXMLObjMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "datosXMLObj", requestType = com.mibanco.procesardatosxml.us.InformeXML.class, responseType = com.mibanco.procesardatosxml.us.RptInforme.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.mibanco.procesardatosxml.us.InformeXML, com.mibanco.procesardatosxml.us.RptInforme> getDatosXMLObjMethod() {
        io.grpc.MethodDescriptor<com.mibanco.procesardatosxml.us.InformeXML, com.mibanco.procesardatosxml.us.RptInforme> getDatosXMLObjMethod;
        if ((getDatosXMLObjMethod = ProcesarDatosServiceGrpc.getDatosXMLObjMethod) == null) {
            synchronized (ProcesarDatosServiceGrpc.class) {
                if ((getDatosXMLObjMethod = ProcesarDatosServiceGrpc.getDatosXMLObjMethod) == null) {
                    ProcesarDatosServiceGrpc.getDatosXMLObjMethod = getDatosXMLObjMethod = io.grpc.MethodDescriptor.<com.mibanco.procesardatosxml.us.InformeXML, com.mibanco.procesardatosxml.us.RptInforme>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "datosXMLObj")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.mibanco.procesardatosxml.us.InformeXML.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.mibanco.procesardatosxml.us.RptInforme.getDefaultInstance())).setSchemaDescriptor(new ProcesarDatosServiceMethodDescriptorSupplier("datosXMLObj")).build();
                }
            }
        }
        return getDatosXMLObjMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static ProcesarDatosServiceStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<ProcesarDatosServiceStub> factory = new io.grpc.stub.AbstractStub.StubFactory<ProcesarDatosServiceStub>() {

            @java.lang.Override
            public ProcesarDatosServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new ProcesarDatosServiceStub(channel, callOptions);
            }
        };
        return ProcesarDatosServiceStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static ProcesarDatosServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<ProcesarDatosServiceBlockingStub> factory = new io.grpc.stub.AbstractStub.StubFactory<ProcesarDatosServiceBlockingStub>() {

            @java.lang.Override
            public ProcesarDatosServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new ProcesarDatosServiceBlockingStub(channel, callOptions);
            }
        };
        return ProcesarDatosServiceBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static ProcesarDatosServiceFutureStub newFutureStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<ProcesarDatosServiceFutureStub> factory = new io.grpc.stub.AbstractStub.StubFactory<ProcesarDatosServiceFutureStub>() {

            @java.lang.Override
            public ProcesarDatosServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new ProcesarDatosServiceFutureStub(channel, callOptions);
            }
        };
        return ProcesarDatosServiceFutureStub.newStub(factory, channel);
    }

    /**
     */
    public interface AsyncService {

        /**
         */
        default void datosXMLObj(com.mibanco.procesardatosxml.us.InformeXML request, io.grpc.stub.StreamObserver<com.mibanco.procesardatosxml.us.RptInforme> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDatosXMLObjMethod(), responseObserver);
        }
    }

    /**
     * Base class for the server implementation of the service ProcesarDatosService.
     */
    public static abstract class ProcesarDatosServiceImplBase implements io.grpc.BindableService, AsyncService {

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return ProcesarDatosServiceGrpc.bindService(this);
        }
    }

    /**
     * A stub to allow clients to do asynchronous rpc calls to service ProcesarDatosService.
     */
    public static class ProcesarDatosServiceStub extends io.grpc.stub.AbstractAsyncStub<ProcesarDatosServiceStub> {

        private ProcesarDatosServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected ProcesarDatosServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ProcesarDatosServiceStub(channel, callOptions);
        }

        /**
         */
        public void datosXMLObj(com.mibanco.procesardatosxml.us.InformeXML request, io.grpc.stub.StreamObserver<com.mibanco.procesardatosxml.us.RptInforme> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getDatosXMLObjMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     * A stub to allow clients to do synchronous rpc calls to service ProcesarDatosService.
     */
    public static class ProcesarDatosServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProcesarDatosServiceBlockingStub> {

        private ProcesarDatosServiceBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected ProcesarDatosServiceBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ProcesarDatosServiceBlockingStub(channel, callOptions);
        }

        /**
         */
        public com.mibanco.procesardatosxml.us.RptInforme datosXMLObj(com.mibanco.procesardatosxml.us.InformeXML request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getDatosXMLObjMethod(), getCallOptions(), request);
        }
    }

    /**
     * A stub to allow clients to do ListenableFuture-style rpc calls to service ProcesarDatosService.
     */
    public static class ProcesarDatosServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ProcesarDatosServiceFutureStub> {

        private ProcesarDatosServiceFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected ProcesarDatosServiceFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ProcesarDatosServiceFutureStub(channel, callOptions);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.mibanco.procesardatosxml.us.RptInforme> datosXMLObj(com.mibanco.procesardatosxml.us.InformeXML request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getDatosXMLObjMethod(), getCallOptions()), request);
        }
    }

    private static final int METHODID_DATOS_XMLOBJ = 0;

    private static final class MethodHandlers<Req, Resp> implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>, io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final AsyncService serviceImpl;

        private final int methodId;

        MethodHandlers(AsyncService serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                case METHODID_DATOS_XMLOBJ:
                    serviceImpl.datosXMLObj((com.mibanco.procesardatosxml.us.InformeXML) request, (io.grpc.stub.StreamObserver<com.mibanco.procesardatosxml.us.RptInforme>) responseObserver);
                    break;
                default:
                    throw new AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                default:
                    throw new AssertionError();
            }
        }
    }

    public static io.grpc.ServerServiceDefinition bindService(AsyncService service) {
        return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(getDatosXMLObjMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.mibanco.procesardatosxml.us.InformeXML, com.mibanco.procesardatosxml.us.RptInforme>(service, METHODID_DATOS_XMLOBJ))).build();
    }

    private static abstract class ProcesarDatosServiceBaseDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {

        ProcesarDatosServiceBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return com.mibanco.procesardatosxml.us.ProcesarDatosXMLgRPC.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("ProcesarDatosService");
        }
    }

    private static final class ProcesarDatosServiceFileDescriptorSupplier extends ProcesarDatosServiceBaseDescriptorSupplier {

        ProcesarDatosServiceFileDescriptorSupplier() {
        }
    }

    private static final class ProcesarDatosServiceMethodDescriptorSupplier extends ProcesarDatosServiceBaseDescriptorSupplier implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {

        private final java.lang.String methodName;

        ProcesarDatosServiceMethodDescriptorSupplier(java.lang.String methodName) {
            this.methodName = methodName;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
            return getServiceDescriptor().findMethodByName(methodName);
        }
    }

    private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

    public static io.grpc.ServiceDescriptor getServiceDescriptor() {
        io.grpc.ServiceDescriptor result = serviceDescriptor;
        if (result == null) {
            synchronized (ProcesarDatosServiceGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME).setSchemaDescriptor(new ProcesarDatosServiceFileDescriptorSupplier()).addMethod(getDatosXMLObjMethod()).build();
                }
            }
        }
        return result;
    }
}
