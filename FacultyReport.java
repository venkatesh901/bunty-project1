package courseScheduling;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FacultyReport extends JFrame {
	public FacultyReport() {
		getContentPane().setLayout(null);

	
		ArrayList<Faculty> f=ImportData.faculty;
	
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(39, 64, 658, 564);
		getContentPane().add(textArea);
		this.setSize(new Dimension(750,750));
		String text="";
		
		for(int i=0;i<f.size();i++)
		{
			text=text+f.get(i).toString();
		}
		
		
		JScrollPane sp = new JScrollPane(textArea); 
		sp.setBounds(39, 64, 658, 564);
		
		textArea.setText(text);
		getContentPane().add(sp);
		
	}

}
