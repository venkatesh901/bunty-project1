package courseScheduling;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class AddRoom extends JFrame {
	private JTextField Roomnotxt;
	private JTextField buildingtxt;
	private JTextField capacitytxt;
	ArrayList<Room> rooms=new ArrayList<Room>();
	public AddRoom () {
		this.setSize(new Dimension(600,450));
		
		getContentPane().setLayout(null);
		
		JLabel lblRoom = new JLabel("Room No.:");
		lblRoom.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblRoom.setBounds(149, 114, 82, 17);
		getContentPane().add(lblRoom);
		
		Roomnotxt = new JTextField();
		Roomnotxt.setColumns(10);
		Roomnotxt.setBounds(227, 111, 141, 20);
		getContentPane().add(Roomnotxt);
		
		JLabel lblBuilding = new JLabel("Building :");
		lblBuilding.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblBuilding.setBounds(149, 154, 82, 17);
		getContentPane().add(lblBuilding);
		
		buildingtxt = new JTextField();
		buildingtxt.setColumns(10);
		buildingtxt.setBounds(227, 151, 141, 20);
		getContentPane().add(buildingtxt);
		
		JLabel lblCapacity = new JLabel("Capacity :");
		lblCapacity.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblCapacity.setBounds(149, 198, 82, 17);
		getContentPane().add(lblCapacity);
		
		capacitytxt = new JTextField();
		capacitytxt.setColumns(10);
		capacitytxt.setBounds(227, 197, 141, 20);
		getContentPane().add(capacitytxt);
		
		JButton button = new JButton("Add");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				
				

				Room r=new Room(Integer.parseInt(Roomnotxt.getText()),buildingtxt.getText(),Integer.parseInt(capacitytxt.getText()),true);
			
				rooms.add(r);
				ImportData.rooms=rooms;
			}
		});
		button.setFont(new Font("Verdana", Font.PLAIN, 12));
		button.setBounds(273, 239, 95, 23);
		getContentPane().add(button);
		
		JLabel lblStudentManagement = new JLabel("Room Management");
		lblStudentManagement.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblStudentManagement.setBounds(168, 33, 200, 23);
		getContentPane().add(lblStudentManagement);
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				RoomManagement dm=new RoomManagement();
				setVisible(false);
				dm.setVisible(true);
		
			}
		});
		btnBack.setBounds(485, 33, 67, 23);
		getContentPane().add(btnBack);
	
	
	}

}
