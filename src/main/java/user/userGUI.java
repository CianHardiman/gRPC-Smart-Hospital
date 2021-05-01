package user;
import com.project.Staffing.*;
import com.project.staffingGrpc.*;

import io.grpc.stub.StreamObserver;

public class userGUI extends staffingImplBase
{

	@Override
	public void staffRequired(StaffCount request, StreamObserver<APIResponse> responseObserver) 
	{
		System.out.println("Inside staffRequired");
		
		String doctorsNumber = request.getDoctors();
		String nursesNumber = request.getNurses();
		
		APIResponse.Builder response = APIResponse.newBuilder();
		if (doctorsNumber.equals(nursesNumber))
		{
			response.setResponseCode(0).setResponsetext("Success");
		}
		else
		{
			response.setResponseCode(1).setResponsetext("Not Equal");
		}
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
		
	}
	
}