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

import com.project.PatientOrg.VacantBedResponse;
import com.project.patientOrgGrpc;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GUIPatientOrg implements ActionListener
{
		
		private JTextField entry1, reply1;


		private JPanel getPatientOrgJPanel() {

			JPanel panel = new JPanel();

			BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

			JLabel label = new JLabel("Enter Bed for Patient")	;
			panel.add(label);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));
			entry1 = new JTextField("");
			panel.add(entry1);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));

			JButton button = new JButton("Invoke Patient Org Service");
			button.addActionListener(this);
			panel.add(button);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));

			reply1 = new JTextField("");
			reply1 .setEditable(false);
			panel.add(reply1);
			
			panel.setLayout(boxlayout);
			
			return panel;
			
		}

		public static void main(String[] args) {

			GUIPatientOrg gui = new GUIPatientOrg();

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
		
			panel.add( getPatientOrgJPanel() );

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

			System.out.println("Patient Bed Assignment Service to be invoked ...");
			System.out.println("Bed Selected is: " + entry1.getText());
		
			/*
			 * 
			 */
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
			patientOrgGrpc.patientOrgBlockingStub blockingStub = patientOrgGrpc.newBlockingStub(channel);

			//preparing message to send
			com.project.PatientOrg.VacantBedInput request = com.project.PatientOrg.VacantBedInput.newBuilder().setRoomType(entry1.getText()).build();

			//Retrieving reply from service
			VacantBedResponse response = blockingStub.vacantBed(request);
			
			reply1.setText(String.valueOf(response.getResponseText()) );

		}
}
