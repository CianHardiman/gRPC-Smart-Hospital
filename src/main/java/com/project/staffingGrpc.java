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
public final class staffingGrpc {

  private staffingGrpc() {}

  public static final String SERVICE_NAME = "staffing";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.project.Staffing.StaffCount,
      com.project.Staffing.APIResponse> getStaffRequiredMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "staffRequired",
      requestType = com.project.Staffing.StaffCount.class,
      responseType = com.project.Staffing.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.project.Staffing.StaffCount,
      com.project.Staffing.APIResponse> getStaffRequiredMethod() {
    io.grpc.MethodDescriptor<com.project.Staffing.StaffCount, com.project.Staffing.APIResponse> getStaffRequiredMethod;
    if ((getStaffRequiredMethod = staffingGrpc.getStaffRequiredMethod) == null) {
      synchronized (staffingGrpc.class) {
        if ((getStaffRequiredMethod = staffingGrpc.getStaffRequiredMethod) == null) {
          staffingGrpc.getStaffRequiredMethod = getStaffRequiredMethod = 
              io.grpc.MethodDescriptor.<com.project.Staffing.StaffCount, com.project.Staffing.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "staffing", "staffRequired"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.Staffing.StaffCount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.Staffing.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new staffingMethodDescriptorSupplier("staffRequired"))
                  .build();
          }
        }
     }
     return getStaffRequiredMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static staffingStub newStub(io.grpc.Channel channel) {
    return new staffingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static staffingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new staffingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static staffingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new staffingFutureStub(channel);
  }

  /**
   */
  public static abstract class staffingImplBase implements io.grpc.BindableService {

    /**
     */
    public void staffRequired(com.project.Staffing.StaffCount request,
        io.grpc.stub.StreamObserver<com.project.Staffing.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStaffRequiredMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStaffRequiredMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.project.Staffing.StaffCount,
                com.project.Staffing.APIResponse>(
                  this, METHODID_STAFF_REQUIRED)))
          .build();
    }
  }

  /**
   */
  public static final class staffingStub extends io.grpc.stub.AbstractStub<staffingStub> {
    private staffingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private staffingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected staffingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new staffingStub(channel, callOptions);
    }

    /**
     */
    public void staffRequired(com.project.Staffing.StaffCount request,
        io.grpc.stub.StreamObserver<com.project.Staffing.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStaffRequiredMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class staffingBlockingStub extends io.grpc.stub.AbstractStub<staffingBlockingStub> {
    private staffingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private staffingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected staffingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new staffingBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.project.Staffing.APIResponse staffRequired(com.project.Staffing.StaffCount request) {
      return blockingUnaryCall(
          getChannel(), getStaffRequiredMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class staffingFutureStub extends io.grpc.stub.AbstractStub<staffingFutureStub> {
    private staffingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private staffingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected staffingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new staffingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.project.Staffing.APIResponse> staffRequired(
        com.project.Staffing.StaffCount request) {
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
    private final staffingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(staffingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STAFF_REQUIRED:
          serviceImpl.staffRequired((com.project.Staffing.StaffCount) request,
              (io.grpc.stub.StreamObserver<com.project.Staffing.APIResponse>) responseObserver);
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

  private static abstract class staffingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    staffingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.project.Staffing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("staffing");
    }
  }

  private static final class staffingFileDescriptorSupplier
      extends staffingBaseDescriptorSupplier {
    staffingFileDescriptorSupplier() {}
  }

  private static final class staffingMethodDescriptorSupplier
      extends staffingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    staffingMethodDescriptorSupplier(String methodName) {
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
      synchronized (staffingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new staffingFileDescriptorSupplier())
              .addMethod(getStaffRequiredMethod())
              .build();
        }
      }
    }
    return result;
  }
}