package user;
import com.project.Inventory.*;
import com.project.inventoryMgmtGrpc.*;

import io.grpc.stub.StreamObserver;


public class UserInventory extends inventoryMgmtImplBase
{
	int inventoryType = 0;
	int inventoryAddSubtract = 0;
	
	//create and set quantities of the inventory
	int bandageQty = 1000;
	int antibioticQty = 1000;
	int vaccineQty = 1000;
	int syringeQty = 1000;
	int medicineQty = 1000;
	
	public void inventoryChange(QuantityInput request, StreamObserver <QuantityOutput> responseObserver) 
	{
	
		//Exception Handling
		
		try
		{
			inventoryAddSubtract = Integer.parseInt(request.getInventoryAddSubtract());
		}
		catch(Exception e) 
		{
			System.out.println("Please enter the number of items you wish to add or take (Negative for subtract)");
		}
		
		try
		{
			inventoryType = Integer.parseInt(request.getInventoryType());
		}
		catch(Exception e) 
		{
			System.out.println("Please enter room type as an number (1-5)");
		}
		
		QuantityOutput.Builder response = QuantityOutput.newBuilder();
		
		switch (inventoryType)
		{
			case 1:
				bandageQty = bandageQty + inventoryAddSubtract;
				response.setResponseCode(1).setResponseText("Remainging bandages: " + bandageQty);
				inventoryType = 0;
				break;
			case 2:
			{
				antibioticQty = antibioticQty + inventoryAddSubtract;
				response.setResponseCode(2).setResponseText("Remainging antibiotics: " + antibioticQty);
				inventoryType = 0;
				break;
			}
			case 3:
			{
				vaccineQty = vaccineQty + inventoryAddSubtract;
				response.setResponseCode(3).setResponseText("Remainging vaccines: " + vaccineQty);
				inventoryType = 0;
				break;
			}
			case 4:
			{
				syringeQty = syringeQty + inventoryAddSubtract;
				response.setResponseCode(4).setResponseText("Remainging syringes: " + syringeQty);
				inventoryType = 0;
				break;
			}
			case 5:
			{
				medicineQty = medicineQty + inventoryAddSubtract;
				response.setResponseCode(5).setResponseText("Remainging medicine: " + medicineQty);
				inventoryType = 0;
				break;
			}
			default:
			{
				response.setResponseCode(6).setResponseText("Please enter the item code (1-5) and the number you wish to add or subtract (subtract being negative)");
			}
		}
		if (bandageQty<0 || antibioticQty<0 || vaccineQty<0 || syringeQty<0 || medicineQty<0)
		{
			response.setResponseCode(7).setResponseText("Please be advised that you have reduced by more than what is in stock");
		}
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

}
