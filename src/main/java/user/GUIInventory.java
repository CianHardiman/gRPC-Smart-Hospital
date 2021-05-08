package user;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.text.*;
import java.util.*;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.project.inventoryMgmtGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GUIInventory implements ActionListener
{
		
		private JTextField entry1, reply1;
		private JTextField entry2;


		private JPanel getInventoryJPanel1() {

			JPanel panel = new JPanel();

			BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

			JLabel label = new JLabel("Inventory Type")	;
			panel.add(label);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));
			entry1 = new JTextField("");
			panel.add(entry1);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));

			JButton button = new JButton("Invoke Inventory Service");
			button.addActionListener(this);
			panel.add(button);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));

			reply1 = new JTextField("");
			reply1 .setEditable(false);
			panel.add(reply1);
			
			panel.setLayout(boxlayout);
			
			return panel;

		}

		private JPanel getInventoryJPanel2() {

			JPanel panel = new JPanel();

			BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

			JLabel label = new JLabel("Enter Change Inventory Amount")	;
			panel.add(label);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));
			entry2 = new JTextField("");
			panel.add(entry2);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));

			panel.setLayout(boxlayout);

			return panel;

		}
		public static void main(String[] args) {

			GUIInventory gui = new GUIInventory();

			gui.build();
		}

		private void build() { 

			JFrame frame = new JFrame("Service Controller Sample");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			// Set the panel to add buttons
			JPanel panel = new JPanel();

			// Set the BoxLayout to be X_AXIS: from left to right
			BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

			panel.setLayout(boxlayout);

			// Set border for the panel
			panel.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));
		
			panel.add( getInventoryJPanel1() );
			panel.add( getInventoryJPanel2() );

			// Set size for the frame
			frame.setSize(300, 300);

			// Set the window to be visible as the default to be false
			frame.add(panel);
			frame.pack();
			frame.setVisible(true);
		}

		@Override
		public void actionPerformed(ActionEvent e) 
		{

			System.out.println("Inventory Management Service to be invoked ...");
			System.out.println("Inventory Type: " + entry1.getText());
			System.out.println("Change in Inventory Quantity: " + entry2.getText());
		
			/*
			 * 
			 */
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
			inventoryMgmtGrpc.inventoryMgmtBlockingStub blockingStub = inventoryMgmtGrpc.newBlockingStub(channel);

			//preparing message to send
			com.project.Inventory.QuantityInput request1 = com.project.Inventory.QuantityInput.newBuilder().setInventoryType(entry1.getText()).build();
			com.project.Inventory.QuantityInput request2 = com.project.Inventory.QuantityInput.newBuilder().setInventoryAddSubtract(entry2.getText()).build();

			//Retrieving reply from service
			com.project.Inventory.QuantityOutput response1 = blockingStub.inventoryChange(request1);
			com.project.Inventory.QuantityOutput response2 = blockingStub.inventoryChange(request2);
			
			reply1.setText(String.valueOf(response1.getResponseText()) );

		}
		
}
