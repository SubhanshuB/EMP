import java.util.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
public class Home {

	public static void main(String ar[])
	{
		JFrame f=new JFrame();
		f.setResizable(false);
		f.getContentPane().setBackground(Color.WHITE);

		JButton b=new JButton("VALIDATE");
		b.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		b.setBackground(new Color(30, 144, 255));
		b.setForeground(new Color(255, 255, 255));
		b.setBounds(193,366,107, 37);
		JTextField voterid=new JTextField("");
		voterid.setBounds(284,315,176,25);

		f.getContentPane().add(b);
		f.getContentPane().add(voterid);
		f.setSize(500,600);
		f.getContentPane().setLayout(null);

		JLabel lblEnterYourVoter = new JLabel("Enter Your Voter ID Number here");
		lblEnterYourVoter.setFont(new Font("Dialog", Font.BOLD, 15));
		lblEnterYourVoter.setForeground(new Color(0, 0, 0));
		lblEnterYourVoter.setBounds(29, 316, 243, 20);
		f.getContentPane().add(lblEnterYourVoter);

		JButton btnLogin = new JButton("ADMIN LOGIN");
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(30, 144, 255));
		btnLogin.setBorder(null);
		btnLogin.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btnLogin.setBounds(364, 12, 110, 30);
		f.getContentPane().add(btnLogin);

		JLabel lblLokSabhaElection = new JLabel("Lok Sabha Election Voting \r\n");
		lblLokSabhaElection.setForeground(new Color(0, 128, 0));
		lblLokSabhaElection.setFont(new Font("Consolas", Font.BOLD, 32));
		lblLokSabhaElection.setAlignmentX(Component.CENTER_ALIGNMENT);

		lblLokSabhaElection.setBounds(16, 83, 458, 38);
		f.getContentPane().add(lblLokSabhaElection);

		JLabel label = new JLabel("2018");
		label.setForeground(new Color(0, 128, 0));
		label.setFont(new Font("Dialog", Font.BOLD, 34));
		label.setBounds(205, 123, 83, 49);
		f.getContentPane().add(label);

		JLabel label_1 = new JLabel("\u0932\u094B\u0915\u0938\u092D\u093E \u091A\u0941\u0928\u093E\u0935 \u092E\u0924\u0926\u093E\u0928");
		label_1.setForeground(new Color(34, 139, 34));
		label_1.setFont(new Font("Mangal", Font.BOLD, 32));
		label_1.setBounds(79, 166, 341, 54);
		f.getContentPane().add(label_1);

		JLabel label_2 = new JLabel("\u0968\u0966\u0967\u096E");
		label_2.setForeground(new Color(0, 128, 0));
		label_2.setFont(new Font("Dialog", Font.BOLD, 34));
		label_2.setBounds(196, 230, 93, 44);
		f.getContentPane().add(label_2);

		 btnLogin.addActionListener(new ActionListener(){
			    public void actionPerformed(ActionEvent e){
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

					 JButton button = new JButton("LOGIN");
					 button.setForeground(Color.WHITE);
					 button.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
					 button.setBorder(null);
					 button.setBackground(new Color(30, 144, 255));
					 button.setBounds(131, 362, 120, 50);
					 jr.getContentPane().add(button);
			         jr.setVisible(true);
			         jr.setLocation(50,100);
			         jr.setSize(400,500);

			         JLabel bgpic = new JLabel("",new ImageIcon("C:\\Users\\Tanishk Pokhariya\\Downloads\\EVM-master\\EVM-master\\src\\eci.png"),JLabel.CENTER);
			 		 bgpic.setBounds(10, 12, 70, 70);


			    }
			    });

		JLabel logo = new JLabel("",new ImageIcon("C:\\Users\\Tanishk Pokhariya\\Downloads\\EVM-master\\EVM-master\\src\\ecj.jpg"),JLabel.CENTER);
		logo.setBounds(10, 12, 70, 70);
		f.getContentPane().add(logo);
		f.setVisible(true);
	}
}
