package courseScheduling;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class AdminPanel extends JFrame {
	
	JLabel labl;
	String strURL;
	public AdminPanel() {
	
		this.setSize(new Dimension(600,450));
		
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Import Data");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			ImportData id=new ImportData();
			setVisible(false);
			id.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnNewButton.setBounds(193, 309, 183, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnTeacherManagment = new JButton("Teacher Management");
		btnTeacherManagment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			ProfessorManagement dm=new ProfessorManagement();
				setVisible(false);
				dm.setVisible(true);
		
			}
		});
		btnTeacherManagment.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnTeacherManagment.setBounds(193, 74, 183, 23);
		getContentPane().add(btnTeacherManagment);
		
		JLabel lblAdminDashboard = new JLabel("Admin Dashboard");
		lblAdminDashboard.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblAdminDashboard.setBounds(201, 26, 205, 23);
		getContentPane().add(lblAdminDashboard);
		
		JButton btnRoomManagment = new JButton("Room Management");
		btnRoomManagment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RoomManagement dm=new RoomManagement();
				setVisible(false);
				dm.setVisible(true);
		
				
			}
		});
		btnRoomManagment.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnRoomManagment.setBounds(193, 119, 183, 23);
		getContentPane().add(btnRoomManagment);
		
		JButton button_1 = new JButton("Course Managment");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CourseManagement dm=new CourseManagement();
				setVisible(false);
				dm.setVisible(true);
		
			
			}
		});
		button_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		button_1.setBounds(193, 262, 183, 23);
		getContentPane().add(button_1);
		
		JButton btnDegreeManagement = new JButton("Degree Management");
		btnDegreeManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				DegreeManagement dm=new DegreeManagement();
				setVisible(false);
				dm.setVisible(true);
			}
		});
		btnDegreeManagement.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnDegreeManagement.setBounds(193, 209, 183, 23);
		getContentPane().add(btnDegreeManagement);
		
		JButton btnReports = new JButton("Reports");
		btnReports.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			Reports rp=new Reports();
			setVisible(false);
			rp.setVisible(true);
			}
		});
		btnReports.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnReports.setBounds(193, 357, 183, 23);
		getContentPane().add(btnReports);
		
		JButton btnScheduleManagement = new JButton("Schedule Management");
		btnScheduleManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			ScheduleManagement sm=new ScheduleManagement();
			setVisible(false);
			sm.setVisible(true);
			
			}
		});
		btnScheduleManagement.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnScheduleManagement.setBounds(193, 164, 183, 23);
		getContentPane().add(btnScheduleManagement);
		
		 labl = new JLabel("logout");
		strURL = "not a user?signup here";
		Font font = labl.getFont();
		Map attributes = font.getAttributes();
		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		labl.setFont(font.deriveFont(attributes));
		//labl.setFont(new Font("Times New Roman", Font.BOLD, 11));
		
		labl.setBounds(498, 23, 46, 14);
		getContentPane().add(labl);
		   
		labl.addMouseListener(new MouseAdapter() {
		       public void mouseEntered(MouseEvent me) {
		          labl.setCursor(new Cursor(Cursor.HAND_CURSOR));
		       }
		       public void mouseExited(MouseEvent me) {
		          labl.setCursor(Cursor.getDefaultCursor());
		       }
		       public void mouseClicked(MouseEvent me)
		       {
		          try {
		      
		        setVisible(false);
		
		       Login r=new Login();
		        r.setVisible(true);
		          }
		            catch(Exception e) {
		               System.out.println(e);
		            }
		       }
		      });
			
	}
}
