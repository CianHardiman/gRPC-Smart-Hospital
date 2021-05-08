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
    comments = "Source: staffing.proto")
public final class StaffingGrpc {

  private StaffingGrpc() {}

  public static final String SERVICE_NAME = "project.Staffing";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.project.TimeLevel,
      com.project.APIResponse> getStaffRequiredMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "staffRequired",
      requestType = com.project.TimeLevel.class,
      responseType = com.project.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.project.TimeLevel,
      com.project.APIResponse> getStaffRequiredMethod() {
    io.grpc.MethodDescriptor<com.project.TimeLevel, com.project.APIResponse> getStaffRequiredMethod;
    if ((getStaffRequiredMethod = StaffingGrpc.getStaffRequiredMethod) == null) {
      synchronized (StaffingGrpc.class) {
        if ((getStaffRequiredMethod = StaffingGrpc.getStaffRequiredMethod) == null) {
          StaffingGrpc.getStaffRequiredMethod = getStaffRequiredMethod = 
              io.grpc.MethodDescriptor.<com.project.TimeLevel, com.project.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "project.Staffing", "staffRequired"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.TimeLevel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StaffingMethodDescriptorSupplier("staffRequired"))
                  .build();
          }
        }
     }
     return getStaffRequiredMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StaffingStub newStub(io.grpc.Channel channel) {
    return new StaffingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StaffingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StaffingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StaffingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StaffingFutureStub(channel);
  }

  /**
   */
  public static abstract class StaffingImplBase implements io.grpc.BindableService {

    /**
     */
    public void staffRequired(com.project.TimeLevel request,
        io.grpc.stub.StreamObserver<com.project.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStaffRequiredMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStaffRequiredMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.project.TimeLevel,
                com.project.APIResponse>(
                  this, METHODID_STAFF_REQUIRED)))
          .build();
    }
  }

  /**
   */
  public static final class StaffingStub extends io.grpc.stub.AbstractStub<StaffingStub> {
    private StaffingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StaffingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StaffingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StaffingStub(channel, callOptions);
    }

    /**
     */
    public void staffRequired(com.project.TimeLevel request,
        io.grpc.stub.StreamObserver<com.project.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStaffRequiredMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StaffingBlockingStub extends io.grpc.stub.AbstractStub<StaffingBlockingStub> {
    private StaffingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StaffingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StaffingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StaffingBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.project.APIResponse staffRequired(com.project.TimeLevel request) {
      return blockingUnaryCall(
          getChannel(), getStaffRequiredMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StaffingFutureStub extends io.grpc.stub.AbstractStub<StaffingFutureStub> {
    private StaffingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StaffingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StaffingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StaffingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.project.APIResponse> staffRequired(
        com.project.TimeLevel request) {
      return futureUnaryCall(
          getChannel().newCall(getStaffRequiredMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_STAFF_REQUIRED = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StaffingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StaffingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STAFF_REQUIRED:
          serviceImpl.staffRequired((com.project.TimeLevel) request,
              (io.grpc.stub.StreamObserver<com.project.APIResponse>) responseObserver);
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

  private static abstract class StaffingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StaffingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.project.StaffingImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Staffing");
    }
  }

  private static final class StaffingFileDescriptorSupplier
      extends StaffingBaseDescriptorSupplier {
    StaffingFileDescriptorSupplier() {}
  }

  private static final class StaffingMethodDescriptorSupplier
      extends StaffingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StaffingMethodDescriptorSupplier(String methodName) {
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
      synchronized (StaffingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StaffingFileDescriptorSupplier())
              .addMethod(getStaffRequiredMethod())
              .build();
        }
      }
    }
    return result;
  }
}
