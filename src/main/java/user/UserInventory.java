package user;
import com.project.Inventory.*;
import com.project.inventoryMgmtGrpc.*;

import io.grpc.stub.StreamObserver;


public class UserInventory extends inventoryMgmtImplBase
{
	int inventoryType = 0;
	int inventoryAddSubtract = 0;
	
	public void inventoryMgmt(QuantityInput request, StreamObserver <QuantityOutput> responseObserver) 
	{
		
		QuantityOutput.Builder response = QuantityOutput.newBuilder();
	
		inventoryType = request.getInventoryType();
		inventoryAddSubtract = request.getInventoryAddSubtract();
		
		response.setResponseCode(1).setResponseText("inventory type:  " + inventoryType);
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}
}
