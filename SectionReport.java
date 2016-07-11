package courseScheduling;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class SectionReport extends JFrame {
	public SectionReport() {
		getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(39, 64, 658, 564);
		getContentPane().add(textArea);
		this.setSize(new Dimension(750,750));
		String text="";
		ArrayList<Section> s=ScheduleManagement.sections;
		for(int i=0;i<s.size();i++)
		{
	
		
			text=text+s.get(i).toString();
		
		}
		
		
		JScrollPane sp = new JScrollPane(textArea); 
		sp.setBounds(39, 64, 658, 564);
		
		textArea.setText(text);
		getContentPane().add(sp);
		
	}
}
