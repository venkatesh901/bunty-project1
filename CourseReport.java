package courseScheduling;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CourseReport extends JFrame{
	public CourseReport() {
		getContentPane().setLayout(null);
		
		JLabel lblCourseReport = new JLabel("Course Report");
		lblCourseReport.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblCourseReport.setBounds(326, 22, 154, 36);
		getContentPane().add(lblCourseReport);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(50, 138, 645, 359);
		getContentPane().add(textArea);
		this.setSize(new Dimension(700,700));
		ArrayList<Course> slist=ImportData.courses;
		String text="";
		for(int i=0;i<slist.size();i++)
		{
			 text=text+slist.get(i).toString()+"\n\n";

				
		}

		JScrollPane sp = new JScrollPane(textArea); 
		sp.setBounds(50, 138, 645, 359);
		
		textArea.setText(text);
		getContentPane().add(sp);
		
	
	}
}
