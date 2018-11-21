import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
import pack.Marquee;
import java.sql.*;
import java.awt.*;
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

	//public static String check;
	public static int check;
	public static void main(String ar[])
	{
		JFrame f=new JFrame();
		JTextField voterid=new JTextField("");
		voterid.setBounds(326,424,200,30);
		f.setResizable(false);
		f.getContentPane().setBackground(Color.WHITE);

		JButton b=new JButton("VALIDATE");
		b.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		b.setBackground(new Color(30, 144, 255));
		b.setForeground(new Color(255, 255, 255));
		b.setBounds(235,487,120, 37);
		
		b.addActionListener(new ActionListener()
		 {
			 public void actionPerformed(ActionEvent e)
			 {
				 try     
				 {  
					 check=Integer.parseInt(voterid.getText());
				 Class.forName("com.mysql.jdbc.Driver");  
				 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/evm","root","");  
				 //here sonoo is database name, root is username and password  
				 Statement stmt=con.createStatement();  
				 ResultSet rs=stmt.executeQuery("select * from validacc where Voter_id='"+ check +"'");  
				 
				
					if(rs.next())
					{ System.out.println("Happy");}
					else
					 {
						JOptionPane.showMessageDialog(f,"Invalid Voter Id Number");
						//System.out.println("Invalid Input");}
					 }
				  
				 
				 con.close();  
				 }
				 catch(Exception eq)
				 { //System.out.println("Error found in try block");
					 JOptionPane.showMessageDialog(f,"Voter Id cannot be Empty\n Please Enter Again","Error",JOptionPane.ERROR_MESSAGE);
				 }  
				 
			}  
				  
		});
		
		
		
		
		f.getContentPane().add(b);
		f.getContentPane().add(voterid);
		f.setSize(600,700);
		f.getContentPane().setLayout(null);

		JLabel lblEnterYourVoter = new JLabel("Enter Your Voter ID Number here");
		lblEnterYourVoter.setFont(new Font("Dialog", Font.BOLD, 15));
		lblEnterYourVoter.setForeground(new Color(0, 0, 0));
		lblEnterYourVoter.setBounds(71, 425, 243, 20);
		f.getContentPane().add(lblEnterYourVoter);

		JButton btnLogin = new JButton("ADMIN LOGIN");
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(30, 144, 255));
		btnLogin.setBorder(null);
		btnLogin.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btnLogin.setBounds(455, 12, 110, 30);
		f.getContentPane().add(btnLogin);

		JLabel lblLokSabhaElection = new JLabel("Lok Sabha Election Voting \r\n");
		lblLokSabhaElection.setForeground(new Color(0, 128, 0));
		lblLokSabhaElection.setFont(new Font("Consolas", Font.BOLD, 32));
		lblLokSabhaElection.setAlignmentX(Component.CENTER_ALIGNMENT);

		lblLokSabhaElection.setBounds(71, 165, 468, 49);
		f.getContentPane().add(lblLokSabhaElection);

		JLabel label = new JLabel("2018");
		label.setForeground(new Color(0, 128, 0));
		label.setFont(new Font("Dialog", Font.BOLD, 34));
		label.setBounds(259, 205, 83, 49);
		f.getContentPane().add(label);

		JLabel label_1 = new JLabel("\u0932\u094B\u0915\u0938\u092D\u093E \u091A\u0941\u0928\u093E\u0935 \u092E\u0924\u0926\u093E\u0928");
		label_1.setForeground(new Color(34, 139, 34));
		label_1.setFont(new Font("Dialog", Font.BOLD, 42));
		label_1.setBounds(101, 254, 399, 66);
		f.getContentPane().add(label_1);

		JLabel label_2 = new JLabel("\u0968\u0966\u0967\u096E");
		label_2.setForeground(new Color(0, 128, 0));
		label_2.setFont(new Font("Dialog", Font.BOLD, 34));
		label_2.setBounds(262, 320, 93, 44);
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
					
					JLabel logo = new JLabel("",new ImageIcon("C:\\Users\\Tanishk Pokhariya\\Documents\\GitHub\\EVM\\src\\Images\\orignal._100x100.png"),JLabel.CENTER);
					logo.setBounds(126, 12, 100, 100);
					jr.getContentPane().add(logo);
			        jr.setVisible(true);
			        jr.setLocation(50,100);
			        jr.setSize(400,500);
					 

			    }
			    });
		 
		 
		 JLabel logo = new JLabel("",new ImageIcon("C:\\Users\\Tanishk Pokhariya\\Documents\\GitHub\\EVM\\src\\Images\\complete logo.png"),JLabel.CENTER);
		logo.setBounds(27, 25, 414, 103);
		f.getContentPane().add(logo);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\\\Users\\\\Tanishk Pokhariya\\\\Documents\\\\GitHub\\\\EVM\\\\src\\\\Images\\\\complete logo.png"));
		
		JLabel label_3 = new JLabel("", new ImageIcon("C:\\Users\\Tanishk Pokhariya\\Documents\\GitHub\\EVM\\src\\Images\\invertedbigeci.png"), SwingConstants.CENTER);
		label_3.setBounds(321, 399, 501, 500);
		//check=Integer.parseInt(voterid.getText());
		
		f.setTitle( "Electronic Voting Machine V2.0" );
		
		f.getContentPane().add(label_3);
		
		f.setVisible(true);
	}
}
