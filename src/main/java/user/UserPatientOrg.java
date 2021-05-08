package user;
import java.util.ArrayList;

import com.project.PatientOrg.*;
import com.project.patientOrgGrpc.*;

import io.grpc.stub.StreamObserver;

public class UserPatientOrg extends patientOrgImplBase
{
	int roomTypeCode = 0;
	String bedAssigned = null;
	
	public void vacantBed(VacantBedInput request, StreamObserver<VacantBedResponse> responseObserver) 
	{
		
		VacantBedResponse.Builder response = VacantBedResponse.newBuilder();
		
		try 
		{
			roomTypeCode = Integer.parseInt(request.getRoomType());
		}
		catch(Exception e) 
		{
			System.out.println("Please enter room type as an number");
		}
		
		//create the different bed types
		ArrayList<String> emergencyBed = new ArrayList<String>();
		ArrayList<String> privateBed = new ArrayList<String>();
		ArrayList<String> sharedBed = new ArrayList<String>();
		
		//add beds to the arraylists
		emergencyBed.add("Emergency Bed 1");
		emergencyBed.add("Emergency Bed 2");
		emergencyBed.add("Emergency Bed 3");
		emergencyBed.add("Emergency Bed 4");
		emergencyBed.add("Emergency Bed 5");
		
		privateBed.add("Private Bed 1");
		privateBed.add("Private Bed 2");
		privateBed.add("Private Bed 3");
		privateBed.add("Private Bed 4");
		privateBed.add("Private Bed 5");
		
		sharedBed.add("Shared Bed 1");
		sharedBed.add("Shared Bed 2");
		sharedBed.add("Shared Bed 3");
		sharedBed.add("Shared Bed 4");
		sharedBed.add("Shared Bed 5");
		
		if(roomTypeCode==1)
		{
			//store the first bed
			bedAssigned = emergencyBed.get(0);
			
			//remove the first bed from the array as it is not available anymore
			emergencyBed.remove(0);
			
			response.setResponseCode(1).setResponseText("Bed assigned: " + bedAssigned + ". Emergency Beds Remaining: " + emergencyBed.size() + ".");
		}
		else if (roomTypeCode==2)
		{
			//store the first bed
			bedAssigned = privateBed.get(0);
			
			//remove the first bed from the array as it is not available anymore
			privateBed.remove(0);
			
			response.setResponseCode(2).setResponseText("Bed assigned: " + bedAssigned + ". Private Beds Remaining: " + privateBed.size() + ".");
		}
		else if (roomTypeCode==3)
		{
			//store the first bed
			bedAssigned = sharedBed.get(0);
			
			//remove the first bed from the array as it is not available anymore
			sharedBed.remove(0);
			
			response.setResponseCode(3).setResponseText("Bed assigned: " + bedAssigned + ". Shared Beds Remaining: " + sharedBed.size() + ".");
		}
		else
		{
			response.setResponseCode(4).setResponseText("Please enter 1 for an emergency bed, 2 for a private bed and 3 for a shared room");
		}
			
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}
	
}
