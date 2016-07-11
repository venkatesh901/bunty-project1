package courseScheduling;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class EditProfessor extends JFrame {
	private JTextField daysAvailabletxt;
	private JTextField springtxt;
	private JTextField summertxt;
	private JTextField falltxt;
	ArrayList<Faculty> flist=ImportData.faculty;
	JComboBox comboBox;
	public EditProfessor() {
	
		this.setSize(new Dimension(500,500));
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Name :");
		label.setFont(new Font("Verdana", Font.PLAIN, 12));
		label.setBounds(97, 100, 82, 17);
		getContentPane().add(label);
		
		JLabel lblDaysAvailable = new JLabel("Days Available :");
		lblDaysAvailable.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblDaysAvailable.setBounds(97, 140, 118, 17);
		getContentPane().add(lblDaysAvailable);
		
		daysAvailabletxt = new JTextField();
		daysAvailabletxt.setColumns(10);
		daysAvailabletxt.setBounds(225, 137, 141, 20);
		getContentPane().add(daysAvailabletxt);
		
		JLabel lblMaxLoadSpring = new JLabel("Max Load Spring:");
		lblMaxLoadSpring.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblMaxLoadSpring.setBounds(97, 186, 118, 17);
		getContentPane().add(lblMaxLoadSpring);
		
		springtxt = new JTextField();
		springtxt.setColumns(10);
		springtxt.setBounds(225, 183, 141, 20);
		getContentPane().add(springtxt);
		
		JLabel lblMaxLoadSummer = new JLabel("Max Load Summer:");
		lblMaxLoadSummer.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblMaxLoadSummer.setBounds(97, 229, 138, 17);
		getContentPane().add(lblMaxLoadSummer);
		
		summertxt = new JTextField();
		summertxt.setColumns(10);
		summertxt.setBounds(225, 228, 141, 20);
		getContentPane().add(summertxt);
		
		JButton btnEdit = new JButton("Save");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				for(int i=0;i<flist.size();i++)
				{
					if(comboBox.getSelectedItem().equals(flist.get(i).getFirstname()))
					{
						String daysavail=daysAvailabletxt.getText();
						int maxspring=Integer.parseInt(springtxt.getText());
						int maxsummer=Integer.parseInt(summertxt.getText());
						int maxfall=Integer.parseInt(falltxt.getText());
						
						flist.get(i).setDays(daysavail);
						flist.get(i).setMaxloadspring(maxspring);
						
						flist.get(i).setMaxloadsummer(maxsummer);
						flist.get(i).setMaxloadfall(maxfall);
						
						ImportData.faculty=flist;
					}
				}
				
			
			}
		});
		btnEdit.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnEdit.setBounds(203, 315, 95, 23);
		getContentPane().add(btnEdit);
		
		JLabel MaxLoadFalllbl = new JLabel("Max Load Fall :");
		MaxLoadFalllbl.setFont(new Font("Verdana", Font.PLAIN, 12));
		MaxLoadFalllbl.setBounds(97, 268, 138, 17);
		getContentPane().add(MaxLoadFalllbl);
		
		falltxt = new JTextField();
		falltxt.setColumns(10);
		falltxt.setBounds(225, 267, 141, 20);
		getContentPane().add(falltxt);
		
		 comboBox = new JComboBox();
		for(int i=0;i<flist.size();i++)
			comboBox.addItem(flist.get(i).getFirstname());
		
		comboBox.setBounds(225, 99, 141, 20);
		getContentPane().add(comboBox);
		
		JLabel lblAddEditProfessor = new JLabel("Edit/ Delete Professor");
		lblAddEditProfessor.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblAddEditProfessor.setBounds(144, 29, 235, 28);
		getContentPane().add(lblAddEditProfessor);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			for(int i=0;i<flist.size();i++)
			{
				if(comboBox.getSelectedItem().equals(flist.get(i).getFirstname()))
				{
					flist.remove(i);
				}
			}
			
			ImportData.faculty=flist;
			}
		});
		btnDelete.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnDelete.setBounds(308, 315, 95, 23);
		getContentPane().add(btnDelete);
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				ProfessorManagement dm=new ProfessorManagement();
				setVisible(false);
				dm.setVisible(true);
		
			
			}
		});
		btnBack.setBounds(390, 36, 73, 23);
		getContentPane().add(btnBack);
		
	}

	
}
