

import java.io.IOException;

import com.project.StaffingGrpc;
import com.project.Staffing.APIResponse;
import com.project.Staffing.TimeLevel;
import com.project.StaffingGrpc.StaffingImplBase;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.text.*;
import java.util.*;


public class StaffingServer extends StaffingImplBase
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		
		StaffingServer staffingServer = new StaffingServer();
		
		Server server = ServerBuilder.forPort(50051).addService(staffingServer).build();
		
		server.start();
		
		System.out.println("Server started. Port: " + server.getPort());
		
		server.awaitTermination();
	}
	
//	@Override
	public void staffRequired(TimeLevel request1, TimeLevel request2,  StreamObserver<APIResponse> responseObserver) 
	{
		
		System.out.println("Please enter Level and Time (Shift) number (1-3)");
		System.out.println("Time 1 is 12AM-8AM, 2 is 8AM-4PM (Working Hours), 3 is 4PM-12AM");
		System.out.println("Level 1 is quieter than usual, 2 is medium and 3 is busy");
		

		APIResponse.Builder response = APIResponse.newBuilder();
		
		int levelNumber = Integer.parseInt(request2.getLevel());
		int timeNumber = Integer.parseInt(request1.getTime());
		int nursesNeeded = 0;
		int doctorsNeeded = 0;
		
		if(levelNumber==1)
		{
			if (timeNumber == 1 || timeNumber == 3)
			{
				doctorsNeeded = 10;
			}
			else if (timeNumber == 2)
			{
				doctorsNeeded = 15;
			}
			else
			{
				System.out.println("Time number relates to 8-hour shifts starting from midnight");
				System.out.println("Please enter a valid time code (1, 2 or 3)");
			}	
		}
		else if (levelNumber == 2)
		{
			if (timeNumber == 1 || timeNumber == 3)
			{
				doctorsNeeded = 13;
			}
			else if (timeNumber == 2)
			{
				doctorsNeeded = 18;
			}
			else
			{
				System.out.println("Time number relates to 8-hour shifts starting from midnight");
				System.out.println("Please enter a valid time code (1, 2 or 3)");
			}	
		}
		else if (levelNumber == 3)
		{
			if (timeNumber == 1 || timeNumber == 3)
			{
				doctorsNeeded = 15;
			}
			else if (timeNumber == 2)
			{
				doctorsNeeded = 21;
			}
			else
			{
				System.out.println("Time number relates to 8-hour shifts starting from midnight");
				System.out.println("Please enter a valid time code (1, 2 or 3)");
			}	
		}
		else
			{
			System.out.println("Level number relates to expected business");
			System.out.println("Please enter a valid level number (1, 2 or 3)");
			}
		
		System.out.println("Time is " + timeNumber);
		
		nursesNeeded = doctorsNeeded*2;
		if ((levelNumber<=3 && levelNumber>=1)&&(timeNumber<=3 && timeNumber>=1))
		{
			response.setResponseCode(0).setResponseText("Nurses Needed: " + nursesNeeded + ". Doctors Needed: " + doctorsNeeded + ".");
		}
		else
		{
			response.setResponseCode(1).setResponseText("Please ensure that time and level are both 1, 2 or 3");
		}
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}
}