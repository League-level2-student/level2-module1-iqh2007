package intro_to_array_lists;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Add Name");
	JButton button2 = new JButton("View Names");
	ArrayList<String> strings = new ArrayList<String>();
	String names;

	public static void main(String[] args) {

		new GuestBook().run();

	}

	void run() {
		button1.addActionListener(this);
		button2.addActionListener(this);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button1) {
			names = JOptionPane.showInputDialog("Please enter a name.");
			strings.add(names);
		}
		
		if(e.getSource()== button2) {
			JOptionPane.showMessageDialog(null, strings);
			
		}

	}
}
