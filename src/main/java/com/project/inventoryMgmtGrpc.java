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
    comments = "Source: inventory.proto")
public final class inventoryMgmtGrpc {

  private inventoryMgmtGrpc() {}

  public static final String SERVICE_NAME = "inventoryMgmt";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.project.Inventory.QuantityInput,
      com.project.Inventory.QuantityOutput> getInventoryChangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InventoryChange",
      requestType = com.project.Inventory.QuantityInput.class,
      responseType = com.project.Inventory.QuantityOutput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.project.Inventory.QuantityInput,
      com.project.Inventory.QuantityOutput> getInventoryChangeMethod() {
    io.grpc.MethodDescriptor<com.project.Inventory.QuantityInput, com.project.Inventory.QuantityOutput> getInventoryChangeMethod;
    if ((getInventoryChangeMethod = inventoryMgmtGrpc.getInventoryChangeMethod) == null) {
      synchronized (inventoryMgmtGrpc.class) {
        if ((getInventoryChangeMethod = inventoryMgmtGrpc.getInventoryChangeMethod) == null) {
          inventoryMgmtGrpc.getInventoryChangeMethod = getInventoryChangeMethod = 
              io.grpc.MethodDescriptor.<com.project.Inventory.QuantityInput, com.project.Inventory.QuantityOutput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "inventoryMgmt", "InventoryChange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.Inventory.QuantityInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.Inventory.QuantityOutput.getDefaultInstance()))
                  .setSchemaDescriptor(new inventoryMgmtMethodDescriptorSupplier("InventoryChange"))
                  .build();
          }
        }
     }
     return getInventoryChangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.project.Inventory.CountRequest,
      com.project.Inventory.CountResponse> getInventoryCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InventoryCount",
      requestType = com.project.Inventory.CountRequest.class,
      responseType = com.project.Inventory.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.project.Inventory.CountRequest,
      com.project.Inventory.CountResponse> getInventoryCountMethod() {
    io.grpc.MethodDescriptor<com.project.Inventory.CountRequest, com.project.Inventory.CountResponse> getInventoryCountMethod;
    if ((getInventoryCountMethod = inventoryMgmtGrpc.getInventoryCountMethod) == null) {
      synchronized (inventoryMgmtGrpc.class) {
        if ((getInventoryCountMethod = inventoryMgmtGrpc.getInventoryCountMethod) == null) {
          inventoryMgmtGrpc.getInventoryCountMethod = getInventoryCountMethod = 
              io.grpc.MethodDescriptor.<com.project.Inventory.CountRequest, com.project.Inventory.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "inventoryMgmt", "InventoryCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.Inventory.CountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.Inventory.CountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new inventoryMgmtMethodDescriptorSupplier("InventoryCount"))
                  .build();
          }
        }
     }
     return getInventoryCountMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static inventoryMgmtStub newStub(io.grpc.Channel channel) {
    return new inventoryMgmtStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static inventoryMgmtBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new inventoryMgmtBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static inventoryMgmtFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new inventoryMgmtFutureStub(channel);
  }

  /**
   */
  public static abstract class inventoryMgmtImplBase implements io.grpc.BindableService {

    /**
     */
    public void inventoryChange(com.project.Inventory.QuantityInput request,
        io.grpc.stub.StreamObserver<com.project.Inventory.QuantityOutput> responseObserver) {
      asyncUnimplementedUnaryCall(getInventoryChangeMethod(), responseObserver);
    }

    /**
     */
    public void inventoryCount(com.project.Inventory.CountRequest request,
        io.grpc.stub.StreamObserver<com.project.Inventory.CountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInventoryCountMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInventoryChangeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.project.Inventory.QuantityInput,
                com.project.Inventory.QuantityOutput>(
                  this, METHODID_INVENTORY_CHANGE)))
          .addMethod(
            getInventoryCountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.project.Inventory.CountRequest,
                com.project.Inventory.CountResponse>(
                  this, METHODID_INVENTORY_COUNT)))
          .build();
    }
  }

  /**
   */
  public static final class inventoryMgmtStub extends io.grpc.stub.AbstractStub<inventoryMgmtStub> {
    private inventoryMgmtStub(io.grpc.Channel channel) {
      super(channel);
    }

    private inventoryMgmtStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected inventoryMgmtStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new inventoryMgmtStub(channel, callOptions);
    }

    /**
     */
    public void inventoryChange(com.project.Inventory.QuantityInput request,
        io.grpc.stub.StreamObserver<com.project.Inventory.QuantityOutput> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInventoryChangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void inventoryCount(com.project.Inventory.CountRequest request,
        io.grpc.stub.StreamObserver<com.project.Inventory.CountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInventoryCountMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class inventoryMgmtBlockingStub extends io.grpc.stub.AbstractStub<inventoryMgmtBlockingStub> {
    private inventoryMgmtBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private inventoryMgmtBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected inventoryMgmtBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new inventoryMgmtBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.project.Inventory.QuantityOutput inventoryChange(com.project.Inventory.QuantityInput request) {
      return blockingUnaryCall(
          getChannel(), getInventoryChangeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.project.Inventory.CountResponse inventoryCount(com.project.Inventory.CountRequest request) {
      return blockingUnaryCall(
          getChannel(), getInventoryCountMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class inventoryMgmtFutureStub extends io.grpc.stub.AbstractStub<inventoryMgmtFutureStub> {
    private inventoryMgmtFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private inventoryMgmtFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected inventoryMgmtFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new inventoryMgmtFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.project.Inventory.QuantityOutput> inventoryChange(
        com.project.Inventory.QuantityInput request) {
      return futureUnaryCall(
          getChannel().newCall(getInventoryChangeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.project.Inventory.CountResponse> inventoryCount(
        com.project.Inventory.CountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInventoryCountMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INVENTORY_CHANGE = 0;
  private static final int METHODID_INVENTORY_COUNT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final inventoryMgmtImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(inventoryMgmtImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INVENTORY_CHANGE:
          serviceImpl.inventoryChange((com.project.Inventory.QuantityInput) request,
              (io.grpc.stub.StreamObserver<com.project.Inventory.QuantityOutput>) responseObserver);
          break;
        case METHODID_INVENTORY_COUNT:
          serviceImpl.inventoryCount((com.project.Inventory.CountRequest) request,
              (io.grpc.stub.StreamObserver<com.project.Inventory.CountResponse>) responseObserver);
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

  private static abstract class inventoryMgmtBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    inventoryMgmtBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.project.Inventory.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("inventoryMgmt");
    }
  }

  private static final class inventoryMgmtFileDescriptorSupplier
      extends inventoryMgmtBaseDescriptorSupplier {
    inventoryMgmtFileDescriptorSupplier() {}
  }

  private static final class inventoryMgmtMethodDescriptorSupplier
      extends inventoryMgmtBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    inventoryMgmtMethodDescriptorSupplier(String methodName) {
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
      synchronized (inventoryMgmtGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new inventoryMgmtFileDescriptorSupplier())
              .addMethod(getInventoryChangeMethod())
              .addMethod(getInventoryCountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
