import java.util.concurrent.TimeUnit;
import demo.GreetHelloWorldGrpc;
import demo.GreetHelloWorldGrpc.GreetHelloWorldBlockingStub;
import demo.HelloWorldRequest;
import demo.HelloWorldResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


public class HelloWorldClient {

    private final ManagedChannel channel;
    private final GreetHelloWorldBlockingStub blockingStub;


    public HelloWorldClient(String host,int port){
        channel = ManagedChannelBuilder.forAddress(host,port)
                .usePlaintext(true)
                .build();

        blockingStub = GreetHelloWorldGrpc.newBlockingStub(channel);
    }


    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public  void greet(String name){
        HelloWorldRequest request = HelloWorldRequest.newBuilder().setName(name).build();
        HelloWorldResponse   response = blockingStub.sayHello(request);
        System.out.println(response.getMessage());

    }

    public static void main(String[] args) throws InterruptedException {
        HelloWorldClient client = new HelloWorldClient("127.0.0.1", 8851);
        for(int i=0;i<5;i++){
            client.greet("worldwwwww:"+i);
        }
    }

}