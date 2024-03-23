import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.SwingUtilities;

public class Ex10_2{
	public static void main(String args[]) {
		SwingUtilities.invokeLater(()-> Ex10_2());
	}

 
    public static void Ex10_2() {
    	JFrame frame=new JFrame("Language Selection");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setSize(400,200);
    	
    	JPanel panel=new JPanel();
    	panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
    	
    	JLabel instructionlabel=new JLabel("Please choose your favorite language");
    	panel.add(instructionlabel);
    	
    	JRadioButton radiobutton1=new JRadioButton("Java");
    	JRadioButton radiobutton2=new JRadioButton("Python");
    	JRadioButton radiobutton3=new JRadioButton("ASP.Net");
    	
    	ButtonGroup buttongroup=new ButtonGroup();
    	buttongroup.add(radiobutton1);
    	buttongroup.add(radiobutton2);
    	buttongroup.add(radiobutton3);
    	
    	ActionListener radiolistener=new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			JRadioButton selectedRadio = (JRadioButton) e.getSource();
    			showMessage(selectedRadio.getText()+ "is selected");
    		}
    	};
    	radiobutton1.addActionListener(radiolistener);
    	radiobutton2.addActionListener(radiolistener);
    	radiobutton3.addActionListener(radiolistener);
    	
    	panel.add(radiobutton1);
    	panel.add(radiobutton2);
    	panel.add(radiobutton3);
    	
    	frame.add(panel);
    	frame.setVisible(true);	
    
}
    private static void showMessage( String message) {
    	JOptionPane.showMessageDialog(null,message,"Language Selection",JOptionPane.INFORMATION_MESSAGE);
    }
    }
