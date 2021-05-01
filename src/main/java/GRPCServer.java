import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import user.userGUI;

public class GRPCServer
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		Server server = ServerBuilder.forPort(50052).addService(new userGUI()).build();
		
		server.start();
		
		System.out.println("Server started. Port: " + server.getPort());
		
		server.awaitTermination();
	}
}