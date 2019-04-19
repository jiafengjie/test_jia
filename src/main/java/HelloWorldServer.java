import io.grpc.Server;
import java.io.IOException;
import io.grpc.ServerBuilder;
import demo.HelloWorldRequest;
import demo.HelloWorldResponse;
import io.grpc.BindableService;
import io.grpc.stub.StreamObserver;
import demo.GreetHelloWorldGrpc.GreetHelloWorldImplBase;


public class HelloWorldServer {

    private int port = 8851;
    private Server server;

    private void start() throws IOException {
        server = ServerBuilder.forPort(port)
                .addService((BindableService) new GreeterHelloWorldImpl())
                .build()
                .start();

        System.out.println("service start...");

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {

                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                HelloWorldServer.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }


    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }


    public static void main(String[] args) throws IOException, InterruptedException {

        final HelloWorldServer server = new HelloWorldServer();
        server.start();
        server.blockUntilShutdown();
    }


    // 实现 定义一个实现服务接口的类 
    private class GreeterHelloWorldImpl extends GreetHelloWorldImplBase {

        public void sayHello(HelloWorldRequest req, StreamObserver<HelloWorldResponse> responseObserver) {
            // 具体其他丰富的业务实现代码


            System.err.println("serviceeeeeeeee:" + req.getName());
            HelloWorldResponse reply = HelloWorldResponse.newBuilder().setMessage(("Hello: " + req.getName())).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
    }

}