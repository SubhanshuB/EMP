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
		f.getContentPane().setBackground(Color.WHITE);
        
		JButton b=new JButton("VALIDATE");
		b.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		b.setBackground(new Color(30, 144, 255));
		b.setForeground(new Color(255, 255, 255));
		b.setBounds(193,366,107, 37);
		JTextField voterid=new JTextField("");
		voterid.setBounds(273,315,176,25);  
		
		f.getContentPane().add(b); 
		f.getContentPane().add(voterid);         
		f.setSize(500,600); 
		f.getContentPane().setLayout(null);
		
		JLabel lblEnterYourVoter = new JLabel("Enter Your Voter ID Number here");
		lblEnterYourVoter.setFont(new Font("Dialog", Font.BOLD, 15));
		lblEnterYourVoter.setForeground(new Color(0, 0, 0));
		lblEnterYourVoter.setBounds(29, 316, 243, 20);
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
		lblLokSabhaElection.setFont(new Font("Consolas", Font.BOLD, 32));
		lblLokSabhaElection.setAlignmentX(Component.CENTER_ALIGNMENT);
				
		lblLokSabhaElection.setBounds(10, 84, 468, 40);
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
		
		ImageIcon img=new ImageIcon("eci.jpg");
		
		//img.IconHeight(500);
		//img.getIconHeight(500);
		JLabel label_2 = new JLabel("\u0968\u0966\u0967\u096E");
		label_2.setForeground(new Color(0, 128, 0));
		label_2.setFont(new Font("Dialog", Font.BOLD, 34));
		label_2.setBounds(196, 230, 93, 44);
		f.getContentPane().add(label_2);
		
		 btnLogin.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){  
			             
			    }  
			    });  
		
		JLabel logo = new JLabel("",new ImageIcon("C:\\Users\\Tanishk Pokhariya\\Downloads\\EVM-master\\EVM-master\\src\\ecj.jpg"),JLabel.CENTER);
		logo.setBounds(10, 12, 70, 70);
		f.getContentPane().add(logo);
		f.setVisible(true);
	}
}
