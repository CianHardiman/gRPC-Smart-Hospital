package user;
import com.project.PatientOrg.*;
import com.project.patientOrgGrpc.*;

import io.grpc.stub.StreamObserver;

public class UserPatientOrg extends patientOrgImplBase
{
	int roomTypeCode = 0;
	
	public void vacantBed(VacantBedInput request, StreamObserver<VacantBedResponse> responseObserver) 
	{
		
		VacantBedResponse.Builder response = VacantBedResponse.newBuilder();
		
		try 
		{
			roomTypeCode = Integer.parseInt(request.getRoomType());
		}
		catch(Exception e) 
		{
			System.out.println("Please roomType time as an number");
		}
		
		if (roomTypeCode==4)
		{
			response.setResponseCode(2).setResponseText("It's 4");
		}
		else
		{
			response.setResponseCode(3).setResponseText("Ain't 4");
		}
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}
	
}
