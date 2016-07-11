package courseScheduling;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class EditRoom extends JFrame {
	private JTextField buildingtxt;
	private JTextField capacitytxt;
	ArrayList<Room> rooms=new ArrayList<Room>();
	public EditRoom () {
		this.setSize(new Dimension(600,450));
		
		getContentPane().setLayout(null);
		JComboBox roomnocombo = new JComboBox();
		
		JLabel lblRoom = new JLabel("Room No.:");
		lblRoom.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblRoom.setBounds(149, 114, 82, 17);
		getContentPane().add(lblRoom);
		
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
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				
		
				for(int i=0;i<rooms.size();i++){
					if(rooms.get(i).getNumber()==Integer.parseInt(roomnocombo.getSelectedItem().toString()))
					{
		
						
						Room r=new Room(rooms.get(i).getNumber(),buildingtxt.getText(),Integer.parseInt(capacitytxt.getText()),true);
		
						rooms.add(i,r);
						
					}
				}

			
				ImportData.rooms=rooms;
			}
		});
		btnSave.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnSave.setBounds(273, 239, 95, 23);
		getContentPane().add(btnSave);
		
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
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
			
			}
		});
		btnDelete.setBounds(157, 240, 89, 23);
		getContentPane().add(btnDelete);
		
		roomnocombo.setBounds(227, 113, 141, 20);
		getContentPane().add(roomnocombo);
	
	
	}

	
}
