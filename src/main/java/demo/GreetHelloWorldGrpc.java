package demo;

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
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: test.proto")
public final class GreetHelloWorldGrpc {

  private GreetHelloWorldGrpc() {}

  public static final String SERVICE_NAME = "helloworld.GreetHelloWorld";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<demo.HelloWorldRequest,
      demo.HelloWorldResponse> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = demo.HelloWorldRequest.class,
      responseType = demo.HelloWorldResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<demo.HelloWorldRequest,
      demo.HelloWorldResponse> getSayHelloMethod() {
    io.grpc.MethodDescriptor<demo.HelloWorldRequest, demo.HelloWorldResponse> getSayHelloMethod;
    if ((getSayHelloMethod = GreetHelloWorldGrpc.getSayHelloMethod) == null) {
      synchronized (GreetHelloWorldGrpc.class) {
        if ((getSayHelloMethod = GreetHelloWorldGrpc.getSayHelloMethod) == null) {
          GreetHelloWorldGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<demo.HelloWorldRequest, demo.HelloWorldResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "helloworld.GreetHelloWorld", "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  demo.HelloWorldRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  demo.HelloWorldResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GreetHelloWorldMethodDescriptorSupplier("SayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreetHelloWorldStub newStub(io.grpc.Channel channel) {
    return new GreetHelloWorldStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreetHelloWorldBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreetHelloWorldBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreetHelloWorldFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreetHelloWorldFutureStub(channel);
  }

  /**
   */
  public static abstract class GreetHelloWorldImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(demo.HelloWorldRequest request,
        io.grpc.stub.StreamObserver<demo.HelloWorldResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                demo.HelloWorldRequest,
                demo.HelloWorldResponse>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class GreetHelloWorldStub extends io.grpc.stub.AbstractStub<GreetHelloWorldStub> {
    private GreetHelloWorldStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetHelloWorldStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected GreetHelloWorldStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetHelloWorldStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(demo.HelloWorldRequest request,
        io.grpc.stub.StreamObserver<demo.HelloWorldResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GreetHelloWorldBlockingStub extends io.grpc.stub.AbstractStub<GreetHelloWorldBlockingStub> {
    private GreetHelloWorldBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetHelloWorldBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected GreetHelloWorldBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetHelloWorldBlockingStub(channel, callOptions);
    }

    /**
     */
    public demo.HelloWorldResponse sayHello(demo.HelloWorldRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GreetHelloWorldFutureStub extends io.grpc.stub.AbstractStub<GreetHelloWorldFutureStub> {
    private GreetHelloWorldFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetHelloWorldFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected GreetHelloWorldFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetHelloWorldFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<demo.HelloWorldResponse> sayHello(
        demo.HelloWorldRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreetHelloWorldImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreetHelloWorldImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((demo.HelloWorldRequest) request,
              (io.grpc.stub.StreamObserver<demo.HelloWorldResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreetHelloWorldBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreetHelloWorldBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return demo.HelloWorldProto.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GreetHelloWorld");
    }
  }

  private static final class GreetHelloWorldFileDescriptorSupplier
      extends GreetHelloWorldBaseDescriptorSupplier {
    GreetHelloWorldFileDescriptorSupplier() {}
  }

  private static final class GreetHelloWorldMethodDescriptorSupplier
      extends GreetHelloWorldBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreetHelloWorldMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GreetHelloWorldGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreetHelloWorldFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
