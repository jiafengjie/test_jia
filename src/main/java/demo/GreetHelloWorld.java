// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test.proto

package demo;

/**
 * Protobuf service {@code helloworld.GreetHelloWorld}
 */
public  abstract class GreetHelloWorld
    implements com.google.protobuf.Service {
  protected GreetHelloWorld() {}

  public interface Interface {
    /**
     * <code>rpc SayHello(.helloworld.HelloWorldRequest) returns (.helloworld.HelloWorldResponse);</code>
     */
    public abstract void sayHello(
            com.google.protobuf.RpcController controller,
            demo.HelloWorldRequest request,
            com.google.protobuf.RpcCallback<demo.HelloWorldResponse> done);

  }

  public static com.google.protobuf.Service newReflectiveService(
      final Interface impl) {
    return new GreetHelloWorld() {
      @Override
      public  void sayHello(
          com.google.protobuf.RpcController controller,
          demo.HelloWorldRequest request,
          com.google.protobuf.RpcCallback<demo.HelloWorldResponse> done) {
        impl.sayHello(controller, request, done);
      }

    };
  }

  public static com.google.protobuf.BlockingService
      newReflectiveBlockingService(final BlockingInterface impl) {
    return new com.google.protobuf.BlockingService() {
      public final com.google.protobuf.Descriptors.ServiceDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }

      public final com.google.protobuf.Message callBlockingMethod(
          com.google.protobuf.Descriptors.MethodDescriptor method,
          com.google.protobuf.RpcController controller,
          com.google.protobuf.Message request)
          throws com.google.protobuf.ServiceException {
        if (method.getService() != getDescriptor()) {
          throw new IllegalArgumentException(
            "Service.callBlockingMethod() given method descriptor for " +
            "wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return impl.sayHello(controller, (demo.HelloWorldRequest)request);
          default:
            throw new AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getRequestPrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new IllegalArgumentException(
            "Service.getRequestPrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return demo.HelloWorldRequest.getDefaultInstance();
          default:
            throw new AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getResponsePrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new IllegalArgumentException(
            "Service.getResponsePrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return demo.HelloWorldResponse.getDefaultInstance();
          default:
            throw new AssertionError("Can't get here.");
        }
      }

    };
  }

  /**
   * <code>rpc SayHello(.helloworld.HelloWorldRequest) returns (.helloworld.HelloWorldResponse);</code>
   */
  public abstract void sayHello(
      com.google.protobuf.RpcController controller,
      demo.HelloWorldRequest request,
      com.google.protobuf.RpcCallback<demo.HelloWorldResponse> done);

  public static final
      com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptor() {
    return demo.HelloWorldProto.getDescriptor().getServices().get(0);
  }
  public final com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }

  public final void callMethod(
      com.google.protobuf.Descriptors.MethodDescriptor method,
      com.google.protobuf.RpcController controller,
      com.google.protobuf.Message request,
      com.google.protobuf.RpcCallback<
        com.google.protobuf.Message> done) {
    if (method.getService() != getDescriptor()) {
      throw new IllegalArgumentException(
        "Service.callMethod() given method descriptor for wrong " +
        "service type.");
    }
    switch(method.getIndex()) {
      case 0:
        this.sayHello(controller, (demo.HelloWorldRequest)request,
          com.google.protobuf.RpcUtil.<demo.HelloWorldResponse>specializeCallback(
            done));
        return;
      default:
        throw new AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getRequestPrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new IllegalArgumentException(
        "Service.getRequestPrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return demo.HelloWorldRequest.getDefaultInstance();
      default:
        throw new AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getResponsePrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new IllegalArgumentException(
        "Service.getResponsePrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return demo.HelloWorldResponse.getDefaultInstance();
      default:
        throw new AssertionError("Can't get here.");
    }
  }

  public static Stub newStub(
      com.google.protobuf.RpcChannel channel) {
    return new Stub(channel);
  }

  public static final class Stub extends GreetHelloWorld implements Interface {
    private Stub(com.google.protobuf.RpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.RpcChannel channel;

    public com.google.protobuf.RpcChannel getChannel() {
      return channel;
    }

    public  void sayHello(
        com.google.protobuf.RpcController controller,
        demo.HelloWorldRequest request,
        com.google.protobuf.RpcCallback<demo.HelloWorldResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        demo.HelloWorldResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          demo.HelloWorldResponse.class,
          demo.HelloWorldResponse.getDefaultInstance()));
    }
  }

  public static BlockingInterface newBlockingStub(
      com.google.protobuf.BlockingRpcChannel channel) {
    return new BlockingStub(channel);
  }

  public interface BlockingInterface {
    public demo.HelloWorldResponse sayHello(
            com.google.protobuf.RpcController controller,
            demo.HelloWorldRequest request)
        throws com.google.protobuf.ServiceException;
  }

  private static final class BlockingStub implements BlockingInterface {
    private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.BlockingRpcChannel channel;

    public demo.HelloWorldResponse sayHello(
        com.google.protobuf.RpcController controller,
        demo.HelloWorldRequest request)
        throws com.google.protobuf.ServiceException {
      return (demo.HelloWorldResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        demo.HelloWorldResponse.getDefaultInstance());
    }

  }

  // @@protoc_insertion_point(class_scope:helloworld.GreetHelloWorld)
}

