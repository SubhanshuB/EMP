import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class random {
	public static void main(String ar[]) {
	JFrame jr=new JFrame();
	JTextField textField;
	JPasswordField passwordField;
	 jr.getContentPane().setBackground(new Color(255, 255, 255));
	 jr.getContentPane().setLayout(null);

	 
	 JLabel lblUserName = new JLabel("User Name");
	 lblUserName.setFont(new Font("Trebuchet MS", Font.BOLD, 28));
	 lblUserName.setForeground(new Color(30, 144, 255));
	 lblUserName.setBounds(25, 124, 142, 34);
	 jr.getContentPane().add(lblUserName);

	 textField = new JTextField();
	 textField.setForeground(new Color(0, 0, 0));
	 textField.setBounds(35, 178, 300, 50);
	 jr.getContentPane().add(textField);
	 textField.setColumns(10);

	 JLabel label = new JLabel("Password");
	 label.setForeground(new Color(30, 144, 255));
	 label.setFont(new Font("Trebuchet MS", Font.BOLD, 28));
	 label.setBounds(28, 237, 142, 34);
	 jr.getContentPane().add(label);

	 passwordField = new JPasswordField();
	 passwordField.setBounds(35, 286, 300, 50);
	 jr.getContentPane().add(passwordField);

	 JButton button = new JButton("ABORT VOTING");
	 button.setLocation(81, 373);
	 button.setSize(205, 39);
	 button.setForeground(Color.WHITE);
	 button.addActionListener(new ActionListener()
	 {
		 public void actionPerformed(ActionEvent e)
		 {
			String usrname = textField.getText();
			String pswrd = String.valueOf(passwordField.getPassword());
			if(usrname.equals("a") && pswrd.equals(" a"))
				{
					jr.dispatchEvent(new WindowEvent(jr, WindowEvent.WINDOW_CLOSING)); 
				}
			else
				JOptionPane.showMessageDialog(jr,"Invalid User Name or Password","Error",JOptionPane.ERROR_MESSAGE);
			 
		 }  
			  
	});
	 
	 button.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
	 button.setBorder(null);
	 button.setBackground(new Color(30, 144, 255));
	
	jr.getContentPane().add(button);
	
	JLabel logo = new JLabel("",new ImageIcon("C:\\Users\\Tanishk Pokhariya\\Documents\\GitHub\\EVM\\src\\Images\\orignal._100x100.png"),JLabel.CENTER);
	logo.setBounds(126, 12, 100, 100);
	jr.getContentPane().add(logo);
    jr.setVisible(true);
    jr.setLocation(50,100);
    jr.setSize(400,500);

}
}
