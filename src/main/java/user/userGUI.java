package user;
import com.project.Staffing.*;
import com.project.staffingGrpc.*;

import io.grpc.stub.StreamObserver;

public class userGUI extends staffingImplBase
{

	public void staffRequired(TimeLevel request, StreamObserver<APIResponse> responseObserver) 
	{
		System.out.println("Inside staffRequired");
		
		int levelNumber = 2;
		int timeNumber = 1;
		int nursesNeeded;
		int doctorsNeeded=0;
		
		//set timeNumber
		try 
		{
			timeNumber = Integer.parseInt(request.getTime());
		}
		catch(Exception e) 
		{
			System.out.println("Please enter time as an number");
		}
		
		//set levelNumber
		try 
		{
			levelNumber = Integer.parseInt(request.getLevel());
		}
		
		catch(Exception e) 
		{
			System.out.println("Please enter level as an number");
		}
		
		APIResponse.Builder response = APIResponse.newBuilder();
		
		
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
		
		nursesNeeded = doctorsNeeded*2;
		
		response.setResponseCode(0).setResponseText("Nurses Needed: " + nursesNeeded + ". Doctors Needed: " + doctorsNeeded + ".");
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
		
	}
	
}