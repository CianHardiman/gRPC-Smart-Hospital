package com.project;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.processing.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: patientOrg.proto")
public final class patientOrgGrpc {

  private patientOrgGrpc() {}

  public static final String SERVICE_NAME = "patientOrg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.project.PatientOrg.VacantBedInput,
      com.project.PatientOrg.VacantBedResponse> getVacantBedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VacantBed",
      requestType = com.project.PatientOrg.VacantBedInput.class,
      responseType = com.project.PatientOrg.VacantBedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.project.PatientOrg.VacantBedInput,
      com.project.PatientOrg.VacantBedResponse> getVacantBedMethod() {
    io.grpc.MethodDescriptor<com.project.PatientOrg.VacantBedInput, com.project.PatientOrg.VacantBedResponse> getVacantBedMethod;
    if ((getVacantBedMethod = patientOrgGrpc.getVacantBedMethod) == null) {
      synchronized (patientOrgGrpc.class) {
        if ((getVacantBedMethod = patientOrgGrpc.getVacantBedMethod) == null) {
          patientOrgGrpc.getVacantBedMethod = getVacantBedMethod = 
              io.grpc.MethodDescriptor.<com.project.PatientOrg.VacantBedInput, com.project.PatientOrg.VacantBedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "patientOrg", "VacantBed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.PatientOrg.VacantBedInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.PatientOrg.VacantBedResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new patientOrgMethodDescriptorSupplier("VacantBed"))
                  .build();
          }
        }
     }
     return getVacantBedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static patientOrgStub newStub(io.grpc.Channel channel) {
    return new patientOrgStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static patientOrgBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new patientOrgBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static patientOrgFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new patientOrgFutureStub(channel);
  }

  /**
   */
  public static abstract class patientOrgImplBase implements io.grpc.BindableService {

    /**
     */
    public void vacantBed(com.project.PatientOrg.VacantBedInput request,
        io.grpc.stub.StreamObserver<com.project.PatientOrg.VacantBedResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getVacantBedMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getVacantBedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.project.PatientOrg.VacantBedInput,
                com.project.PatientOrg.VacantBedResponse>(
                  this, METHODID_VACANT_BED)))
          .build();
    }
  }

  /**
   */
  public static final class patientOrgStub extends io.grpc.stub.AbstractStub<patientOrgStub> {
    private patientOrgStub(io.grpc.Channel channel) {
      super(channel);
    }

    private patientOrgStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected patientOrgStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new patientOrgStub(channel, callOptions);
    }

    /**
     */
    public void vacantBed(com.project.PatientOrg.VacantBedInput request,
        io.grpc.stub.StreamObserver<com.project.PatientOrg.VacantBedResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVacantBedMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class patientOrgBlockingStub extends io.grpc.stub.AbstractStub<patientOrgBlockingStub> {
    private patientOrgBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private patientOrgBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected patientOrgBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new patientOrgBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.project.PatientOrg.VacantBedResponse vacantBed(com.project.PatientOrg.VacantBedInput request) {
      return blockingUnaryCall(
          getChannel(), getVacantBedMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class patientOrgFutureStub extends io.grpc.stub.AbstractStub<patientOrgFutureStub> {
    private patientOrgFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private patientOrgFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected patientOrgFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new patientOrgFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.project.PatientOrg.VacantBedResponse> vacantBed(
        com.project.PatientOrg.VacantBedInput request) {
      return futureUnaryCall(
          getChannel().newCall(getVacantBedMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VACANT_BED = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final patientOrgImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(patientOrgImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_VACANT_BED:
          serviceImpl.vacantBed((com.project.PatientOrg.VacantBedInput) request,
              (io.grpc.stub.StreamObserver<com.project.PatientOrg.VacantBedResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class patientOrgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    patientOrgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.project.PatientOrg.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("patientOrg");
    }
  }

  private static final class patientOrgFileDescriptorSupplier
      extends patientOrgBaseDescriptorSupplier {
    patientOrgFileDescriptorSupplier() {}
  }

  private static final class patientOrgMethodDescriptorSupplier
      extends patientOrgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    patientOrgMethodDescriptorSupplier(String methodName) {
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
      synchronized (patientOrgGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new patientOrgFileDescriptorSupplier())
              .addMethod(getVacantBedMethod())
              .build();
        }
      }
    }
    return result;
  }
}
