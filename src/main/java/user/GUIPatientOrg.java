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

import com.project.staffingGrpc;

import com.project.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GUIPatientOrg implements ActionListener
{


		private JTextField entry1, reply1;
		private JTextField entry2, reply2;


		private JPanel getGUIPatientOrgJPanel() {

			JPanel panel = new JPanel();

			BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

			JLabel label = new JLabel("Enter Level")	;
			panel.add(label);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));
			entry1 = new JTextField("",10);
			panel.add(entry1);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));

			JButton button = new JButton("Invoke Patient Org Service");
			button.addActionListener(this);
			panel.add(button);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));

			reply1 = new JTextField("", 10);
			reply1 .setEditable(false);
			panel.add(reply1 );

			panel.setLayout(boxlayout);

			return panel;

		}

		private JPanel getService2JPanel() {

			JPanel panel = new JPanel();

			BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

			JLabel label = new JLabel("Enter Time")	;
			panel.add(label);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));
			entry2 = new JTextField("",10);
			panel.add(entry2);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));

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
			panel.add( getPatientOrgJPanel() );

			// Set size for the frame
			frame.setSize(300, 300);

			// Set the window to be visible as the default to be false
			frame.add(panel);
			frame.pack();
			frame.setVisible(true);
		}


		public void actionPerformed(ActionEvent e) 
		{
			JButton button = (JButton)e.getSource();
			String label = button.getActionCommand();  

			if (label.equals("Invoke Patient Org Service")) 
			{
				System.out.println("Patient Org Service to be invoked ...");

			
				/*
				 * 
				 */
				ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
				patientOrgGrpc.patientOrgBlockingStub blockingStub = patientOrgGrpc.newBlockingStub(channel);

				//preparing message to send
				PatientOrg.VacantBedInput request1 = PatientOrg.VacantBedInput.newBuilder().setTime(entry1.getText()).build();
				Staffing.TimeLevel request2 = Staffing.TimeLevel.newBuilder().setLevel(entry2.getText()).build();

				//Retrieving reply from service
				Staffing.APIResponse response1 = blockingStub.staffRequired(request1);

				reply1.setText( String.valueOf(response1) );
			
			}
			else
			{
				
			}
		}
}
