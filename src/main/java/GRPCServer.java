import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import user.UserStaffing;

public class GRPCServer
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		Server server = ServerBuilder.forPort(50051).addService(new UserStaffing()).build();
		
		server.start();
		
		System.out.println("Server started. Port: " + server.getPort());
		
		server.awaitTermination();
	}
	
}