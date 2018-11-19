import java.util.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
public class Home {
	
	public static void main(String ar[])
	{
		JFrame f=new JFrame();
		f.getContentPane().setBackground(Color.WHITE);
        
		JButton b=new JButton("VALIDATE");
		b.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		b.setBackground(new Color(30, 144, 255));
		b.setForeground(new Color(255, 255, 255));
		b.setBounds(183,301,107, 37);
		JTextField voterid=new JTextField("");
		voterid.setBounds(288,250,151,25);  
		
		f.getContentPane().add(b); 
		f.getContentPane().add(voterid);         
		f.setSize(500,600); 
		f.getContentPane().setLayout(null);
		
		JLabel lblEnterYourVoter = new JLabel("Enter Your Voter ID Number here");
		lblEnterYourVoter.setBounds(66, 252, 189, 20);
		f.getContentPane().add(lblEnterYourVoter);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(30, 144, 255));
		btnLogin.setBorder(null);
		btnLogin.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		btnLogin.setBounds(383, 12, 89, 25);
		f.getContentPane().add(btnLogin);
		
		JLabel lblLokSabhaElection = new JLabel("Lok Sabha Election Voting \r\n");
		lblLokSabhaElection.setForeground(new Color(0, 128, 0));
		lblLokSabhaElection.setFont(new Font("Consolas", Font.BOLD, 33));
		lblLokSabhaElection.setAlignmentX(Component.CENTER_ALIGNMENT);
				
		lblLokSabhaElection.setBounds(12, 104, 468, 40);
		f.getContentPane().add(lblLokSabhaElection);
		
		JLabel label = new JLabel("2018");
		label.setForeground(new Color(0, 128, 0));
		label.setFont(new Font("Dialog", Font.BOLD, 34));
		label.setBounds(207, 156, 83, 49);
		f.getContentPane().add(label);
		f.setVisible(true);
	}
}
