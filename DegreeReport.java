package courseScheduling;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DegreeReport extends JFrame {
	public DegreeReport() {
		getContentPane().setLayout(null);
		
		ArrayList <Degree> d=ImportData.degrees;

		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(39, 64, 658, 564);
		getContentPane().add(textArea);
		this.setSize(new Dimension(750,750));
		String text="";
		
		for(int i=0;i<d.size();i++)
		{
			text=text+d.get(i).toString()+"\n";
			
			ArrayList<DegreeData> ar=d.get(i).getDegreedata();
			for(int k=0;k<ar.size();k++)
			{
				text=text+ar.get(k).toString();
				
				
			}
		}
		
		JScrollPane sp = new JScrollPane(textArea); 
		sp.setBounds(39, 64, 658, 564);
		
		textArea.setText(text);
		getContentPane().add(sp);
		
	
	}

	
}
