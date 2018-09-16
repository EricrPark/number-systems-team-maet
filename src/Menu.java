import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Menu implements ActionListener {
	JFrame frame;
	JComboBox<String> combo;
	JComboBox<String> combo2;
	JButton button;
	JLabel label;
	JTextField textBox;
	public Menu(Binary bin, Hexadecimal hex, Decimal dec) {
		frame = new JFrame();
		JPanel panel = new JPanel();
		combo = new JComboBox<>();
		combo.addItem("Decimal");
		combo.addItem("Hexadecimal");
		combo.addItem("Binary");
		combo2 = new JComboBox<>();
		combo2.addItem("Decimal");
		combo2.addItem("Hexadecimal");
		combo2.addItem("Binary");
		button = new JButton("    convert    ");
		label = new JLabel();
		textBox = new JTextField(9);
		frame.add(panel);
		panel.add(textBox);
		panel.add(combo);
		panel.add(combo2);
		panel.add(button);
		panel.add(label);
		frame.pack();
		frame.setVisible(true);
		button.addActionListener(this);
	}

	public void display() {
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(combo.getSelectedItem().equals("Decimal") && combo2.getSelectedItem().equals("Decimal")) {
			label.setText(textBox.getText());
			frame.pack();
		}
		if(combo.getSelectedItem().equals("Hexadecimal") && combo2.getSelectedItem().equals("Hexadecimal")) {
			label.setText(textBox.getText());
			frame.pack();
		}
		if(combo.getSelectedItem().equals("Binary") && combo2.getSelectedItem().equals("Binary")) {
			label.setText(textBox.getText());
			frame.pack();
		}
		if(combo.getSelectedItem().equals("Decimal") && combo2.getSelectedItem().equals("Binary")) {
			label.setText("ERROR ERROR");
			frame.pack();
		}
		if(combo.getSelectedItem().equals("Decimal") && combo2.getSelectedItem().equals("Hexadecimal")) {
			label.setText("ERROR ERROR");
			frame.pack();
		}
		if(combo.getSelectedItem().equals("Binary") && combo2.getSelectedItem().equals("Decimal")) {
			label.setText("ERROR ERROR");
			frame.pack();
		}
		if(combo.getSelectedItem().equals("Binary") && combo2.getSelectedItem().equals("Hexadecimal")) {
			label.setText("ERROR ERROR");
			frame.pack();
		}
		if(combo.getSelectedItem().equals("Hexadecimal") && combo2.getSelectedItem().equals("Binary")) {
			label.setText("ERROR ERROR");
			frame.pack();
		}
		if(combo.getSelectedItem().equals("Hexadecimal") && combo2.getSelectedItem().equals("Decimal")) {
			label.setText("ERROR ERROR");
			frame.pack();
		}
	}

}
