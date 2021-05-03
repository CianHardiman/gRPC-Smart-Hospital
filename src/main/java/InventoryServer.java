import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import user.UserInventory;

public class InventoryServer
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		Server server = ServerBuilder.forPort(50053).addService(new UserInventory()).build();
		
		server.start();
		
		System.out.println("Server started. Port: " + server.getPort());
		
		server.awaitTermination();
	}
	
}