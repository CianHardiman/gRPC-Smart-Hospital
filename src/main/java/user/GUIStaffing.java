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

import com.project.*;

import com.project.StaffingGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GUIStaffing implements ActionListener
{
		
		private JTextField entry1, reply1;
		private JTextField entry2;


		private JPanel getStaffingJPanel1() {

			JPanel panel = new JPanel();

			BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

			JLabel label = new JLabel("Enter Shift Code (Time) 1-3")	;
			panel.add(label);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));
			entry1 = new JTextField("");
			panel.add(entry1);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));

			JButton button = new JButton("Invoke Staffing Service");
			button.addActionListener(this);
			panel.add(button);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));

			reply1 = new JTextField("");
			reply1 .setEditable(false);
			panel.add(reply1);
			
			panel.setLayout(boxlayout);
			
			return panel;

		}

		private JPanel getStaffingJPanel2() {

			JPanel panel = new JPanel();

			BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

			JLabel label = new JLabel("Enter Level")	;
			panel.add(label);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));
			entry2 = new JTextField("");
			panel.add(entry2);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));

			panel.setLayout(boxlayout);

			return panel;

		}
		public static void main(String[] args) {

			GUIStaffing gui = new GUIStaffing();

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
		
			panel.add( getStaffingJPanel1() );
			panel.add( getStaffingJPanel2() );

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

			System.out.println("Staffing Service to be invoked ...");
			
			/*
			 * 
			 */
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
			StaffingGrpc.StaffingBlockingStub blockingStub = StaffingGrpc.newBlockingStub(channel);

			//preparing message to send
			com.project.StaffingOuterClass.TimeLevel request1 = com.project.StaffingOuterClass.TimeLevel.newBuilder().setTime(entry1.getText()).build();
			com.project.StaffingOuterClass.TimeLevel request2 = com.project.StaffingOuterClass.TimeLevel.newBuilder().setLevel(entry2.getText()).build();

			//Retrieving reply from service
			com.project.StaffingOuterClass.APIResponse response1 = blockingStub.staffRequired(request1);
			com.project.StaffingOuterClass.APIResponse response2 = blockingStub.staffRequired(request2);
			
			reply1.setText(String.valueOf(response1.getResponseText()) );

		}
		
}
