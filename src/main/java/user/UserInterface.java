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

public class UserInterface implements ActionListener
{


		private JTextField entry1, reply1;
		private JTextField entry2, reply2;


		private JPanel getStaffingJPanel() {

			JPanel panel = new JPanel();

			BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

			JLabel label = new JLabel("Enter Level")	;
			panel.add(label);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));
			entry1 = new JTextField("",10);
			panel.add(entry1);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));

			JButton button = new JButton("Invoke Staffing Service");
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

			JLabel label = new JLabel("Enter value")	;
			panel.add(label);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));
			entry2 = new JTextField("",10);
			panel.add(entry2);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));

			JButton button = new JButton("Invoke Service 2");
			button.addActionListener(this);
			panel.add(button);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));

			reply2 = new JTextField("", 10);
			reply2 .setEditable(false);
			panel.add(reply2 );

			panel.setLayout(boxlayout);

			return panel;

		}
		public static void main(String[] args) {

			UserInterface gui = new UserInterface();

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
		
			panel.add( getStaffingJPanel() );
			panel.add( getService2JPanel() );

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

			if (label.equals("Invoke Staffing Service")) 
			{
				System.out.println("Staffing Service to be invoked ...");

			
				/*
				 * 
				 */
				ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
				staffingGrpc.staffingBlockingStub blockingStub = staffingGrpc.newBlockingStub(channel);

				//preparing message to send
//				Staffing.TimeLevel request = Staffing.TimeLevel.newBuilder().setText(entry1.getText()).build();

				//Retrieving reply from service
//				Staffing.APIResponse response = blockingStub.userGUI(request);

//				reply1.setText( String.valueOf(response.getLength() ) );
			
			}
			else
			{
				
			}
		}
}
